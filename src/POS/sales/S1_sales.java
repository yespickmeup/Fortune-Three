/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package POS.sales;

import POS.main.Main;
import POS.main.Main.MyDB;
import POS.util.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.ReceiptIncrementor;
import mijzcx.synapse.desk.utils.SqlStringUtil;

/**
 *
 * @author i1
 */
public class S1_sales {

    public static class to_sales {

        public final int id;
        public final String sales_no;
        public final String date_added;
        public final String user_name;
        public final String session_no;
        public final double gross_amount;
        public final double amount_paid;
        public final double amount_due;
        public final String discount_name;
        public final double discount;
        public final double discount_amount;
        public final String customer_name;
        public final String check_bank;
        public final String check_no;
        public final double check_amount;
        public final String discount_customer_name;
        public final String discount_customer_id;
        public final int status;
        public final String or_no;
        public final String check_holder;
        public final String services;
        public final double service_amount;

        public to_sales(int id, String sales_no, String date_added, String user_name, String session_no, double gross_amount, double amount_paid, double amount_due, String discount_name, double discount, double discount_amount, String customer_name, String check_bank, String check_no, double check_amount, String discount_customer_name, String discount_customer_id, int status, String or_no, String check_holder, String services, double service_amount) {
            this.id = id;
            this.sales_no = sales_no;
            this.date_added = date_added;
            this.user_name = user_name;
            this.session_no = session_no;
            this.gross_amount = gross_amount;
            this.amount_paid = amount_paid;
            this.amount_due = amount_due;
            this.discount_name = discount_name;
            this.discount = discount;
            this.discount_amount = discount_amount;
            this.customer_name = customer_name;
            this.check_bank = check_bank;
            this.check_no = check_no;
            this.check_amount = check_amount;
            this.discount_customer_name = discount_customer_name;
            this.discount_customer_id = discount_customer_id;
            this.status = status;
            this.or_no = or_no;
            this.check_holder = check_holder;
            this.services = services;
            this.service_amount = service_amount;
        }
    }

    public static void add_sales(to_sales to_sales,String datetime) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into sales("
                    + "sales_no"
                    + ",date_added"
                    + ",user_name"
                    + ",session_no"
                    + ",gross_amount"
                    + ",amount_paid"
                    + ",amount_due"
                    + ",discount_name"
                    + ",discount"
                    + ",discount_amount"
                    + ",customer_name"
                    + ",check_bank"
                    + ",check_no"
                    + ",check_amount"
                    + ",discount_customer_name"
                    + ",discount_customer_id"
                    + ",status"
                    + ",or_no"
                    + ",check_holder"
                    + ",services"
                    + ",service_amount"
                    + ")values("
                    + ":sales_no"
                    + ",:date_added"
                    + ",:user_name"
                    + ",:session_no"
                    + ",:gross_amount"
                    + ",:amount_paid"
                    + ",:amount_due"
                    + ",:discount_name"
                    + ",:discount"
                    + ",:discount_amount"
                    + ",:customer_name"
                    + ",:check_bank"
                    + ",:check_no"
                    + ",:check_amount"
                    + ",:discount_customer_name"
                    + ",:discount_customer_id"
                    + ",:status"
                    + ",:or_no"
                    + ",:check_holder"
                    + ",:services"
                    + ",:service_amount"
                    + ")";

            s0 = SqlStringUtil.parse(s0).
                    setString("sales_no", to_sales.sales_no).
                    setString("date_added", datetime).
                    setString("user_name", to_sales.user_name).
                    setString("session_no", to_sales.session_no).
                    setNumber("gross_amount", to_sales.gross_amount).
                    setNumber("amount_paid", to_sales.amount_paid).
                    setNumber("amount_due", to_sales.amount_due).
                    setString("discount_name", to_sales.discount_name).
                    setNumber("discount", to_sales.discount).
                    setNumber("discount_amount", to_sales.discount_amount).
                    setString("customer_name", to_sales.customer_name).
                    setString("check_bank", to_sales.check_bank).
                    setString("check_no", to_sales.check_no).
                    setNumber("check_amount", to_sales.check_amount).
                    setString("discount_customer_name", to_sales.discount_customer_name).
                    setString("discount_customer_id", to_sales.discount_customer_id).
                    setNumber("status", to_sales.status).
                    setString("or_no", to_sales.or_no).
                    setString("check_holder", to_sales.check_holder).
                    setString("services", to_sales.services).
                    setNumber("service_amount", to_sales.service_amount).
                    ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_sales.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_sales(to_sales to_sales) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update sales set "
                    + "sales_no= '" + to_sales.sales_no + "'"
                    + ",date_added= '" + to_sales.date_added + "'"
                    + ",user_name= '" + to_sales.user_name + "'"
                    + ",session_no= '" + to_sales.session_no + "'"
                    + ",gross_amount= '" + to_sales.gross_amount + "'"
                    + ",amount_paid= '" + to_sales.amount_paid + "'"
                    + ",amount_due= '" + to_sales.amount_due + "'"
                    + ",discount_name= '" + to_sales.discount_name + "'"
                    + ",discount= '" + to_sales.discount + "'"
                    + ",discount_amount= '" + to_sales.discount_amount + "'"
                    + ",check_bank= '" + to_sales.check_bank + "'"
                    + ",check_no= '" + to_sales.check_no + "'"
                    + ",check_amount= '" + to_sales.check_amount + "'"
                    + ",status= '" + to_sales.status + "'"
                    + ",check_holder= '" + to_sales.check_holder + "'"
                    + "where "
                    + " id ='" + to_sales.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_sales.class, "Successfully Updated");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_sales(to_sales to_sales) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from sales where "
                    + " id ='" + to_sales.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_sales.class, "Successfully Deleted");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_sales> ret_data(String date_from, String date_to, String user_names) {
        List<to_sales> datas = new ArrayList();
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",sales_no"
                    + ",date_added"
                    + ",user_name"
                    + ",session_no"
                    + ",gross_amount"
                    + ",amount_paid"
                    + ",amount_due"
                    + ",discount_name"
                    + ",discount"
                    + ",discount_amount"
                    + ",customer_name"
                    + ",check_bank"
                    + ",check_no"
                    + ",check_amount"
                    + ",discount_customer_name"
                    + ",discount_customer_id"
                    + ",status"
                    + ",or_no"
                    + ",check_holder"
                     + ",services"
                     + ",service_amount"
                    + " from sales where "
                    + " date(date_added) between '" + date_from + "' and '" + date_to + "' "
                    + " and user_name like'%" + user_names + "%' "
                    + " ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String sales_no = rs.getString(2);
                String date_added = rs.getString(3);
                String user_name = rs.getString(4);
                String session_no = rs.getString(5);
                double gross_amount = rs.getDouble(6);
                double amount_paid = rs.getDouble(7);
                double amount_due = rs.getDouble(8);
                String discount_name = rs.getString(9);
                double discount = rs.getDouble(10);
                double discount_amount = rs.getDouble(11);
                String customer_name = rs.getString(12);
                String check_bank = rs.getString(13);
                String check_no = rs.getString(14);
                double check_amount = rs.getDouble(15);
                String discount_customer_name = rs.getString(16);
                String discount_customer_id = rs.getString(17);
                int status = rs.getInt(18);
                String or_no = rs.getString(19);
                String check_holder = rs.getString(20);
                  String services = rs.getString(21);
                   double service_amount = rs.getDouble(22);
                to_sales to = new to_sales(id, sales_no, date_added, user_name, session_no, gross_amount, amount_paid, amount_due,
                        discount_name, discount, discount_amount, customer_name, check_bank, check_no, check_amount, discount_customer_name
                        , discount_customer_id, status, or_no, check_holder,services,service_amount);
                datas.add(to);
            }
            return datas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_sales> ret_data_or(String date_from, String date_to, String or_nos) {
        List<to_sales> datas = new ArrayList();
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",sales_no"
                    + ",date_added"
                    + ",user_name"
                    + ",session_no"
                    + ",gross_amount"
                    + ",amount_paid"
                    + ",amount_due"
                    + ",discount_name"
                    + ",discount"
                    + ",discount_amount"
                    + ",customer_name"
                    + ",check_bank"
                    + ",check_no"
                    + ",check_amount"
                    + ",discount_customer_name"
                    + ",discount_customer_id"
                    + ",status"
                    + ",or_no"
                    + ",check_holder"
                     + ",services"
                     + ",service_amount"
                    + " from sales where "
                    + " date(date_added) between '" + date_from + "' and '" + date_to + "' "
                    + " and or_no like '%" + or_nos + "%' "
                    + " ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String sales_no = rs.getString(2);
                String date_added = rs.getString(3);
                String user_name = rs.getString(4);
                String session_no = rs.getString(5);
                double gross_amount = rs.getDouble(6);
                double amount_paid = rs.getDouble(7);
                double amount_due = rs.getDouble(8);
                String discount_name = rs.getString(9);
                double discount = rs.getDouble(10);
                double discount_amount = rs.getDouble(11);
                String customer_name = rs.getString(12);
                String check_bank = rs.getString(13);
                String check_no = rs.getString(14);
                double check_amount = rs.getDouble(15);
                String discount_customer_name = rs.getString(16);
                String discount_customer_id = rs.getString(17);
                int status = rs.getInt(18);
                String or_no = rs.getString(19);
                String check_holder = rs.getString(20);
                  String services = rs.getString(21);
                   double service_amount = rs.getDouble(22);
                to_sales to = new to_sales(id, sales_no, date_added, user_name, session_no, gross_amount, amount_paid, amount_due,
                        discount_name, discount, discount_amount, customer_name, check_bank, check_no, check_amount, discount_customer_name
                        , discount_customer_id, status, or_no, check_holder,services,service_amount);
                datas.add(to);
            }
            return datas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static String increment_id() {
        String ids = "SN-00000000000";
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select max(id) from " + Main.MyDB.getNames() + ".sales";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                ids = rs.getString(1);
            }
            if (ids == null) {
                ids = "SN-00000000001";
            } else {
                String s2 = "select sales_no from " + Main.MyDB.getNames() + ".sales where id='" + ids + "'";
                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                if (rs2.next()) {
                    ids = rs2.getString(1);
                }
            }

            ids = ReceiptIncrementor.increment(ids);

            return ids;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static int count_sales() {
        int count = 0;
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select count(id) from sales";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                count = rs.getInt(1);
            }
            return count;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
}
