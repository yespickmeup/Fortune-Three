/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POS.cut_off;

import POS.util.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;

/**
 *
 * @author Guinness
 */
public class S1_cut_offs {

    public static class to_cut_offs {

        public final int id;
        public final String date_added;
        public final String added_by;
        public final String date_to;
        public to_cut_offs(int id, String date_added, String added_by,String date_to) {
            this.id = id;
            this.date_added = date_added;
            this.added_by = added_by;
            this.date_to=date_to;
        }
    }

    public static void add_data(to_cut_offs to_cut_offs) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into cut_offs("
                    + "date_added"
                    + ",added_by"
                    + ",date_to"
                    + ")values("
                    + ":date_added"
                    + ",:added_by"
                    + ",:date_to"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("date_added", to_cut_offs.date_added)
                    .setString("added_by", to_cut_offs.added_by)
                    .setString("date_to",to_cut_offs.date_to)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_cut_offs.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_cut_offs to_cut_offs) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update cut_offs set "
                    + "date_added= :date_added "
                    + ",added_by= :added_by "
                    + ",date_to= :date_to"
                    + " where id='" + to_cut_offs.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("date_added", to_cut_offs.date_added)
                    .setString("added_by", to_cut_offs.added_by)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_cut_offs.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(String where) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from cut_offs  "
                    + " " + where;

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_cut_offs.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_cut_offs> ret_data(String where) {
        List<to_cut_offs> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",date_added"
                    + ",added_by"
                    + ",date_to"
                    + " from cut_offs"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String date_added = rs.getString(2);
                String added_by = rs.getString(3);
                String date_to=rs.getString(4);
                to_cut_offs to = new to_cut_offs(id, date_added, added_by,date_to);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}
