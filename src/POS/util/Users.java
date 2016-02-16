/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package POS.util;

import POS.cash_drawer.S1_cash_drawer;
import POS.cash_drawer.S1_cash_drawer.to_cash_drawer;
import POS.cash_drawer.S1_cash_drawer_checks;
import POS.cash_drawer.S1_cash_drawer_checks.to_cash_drawer_checks;
import POS.cash_drawer.S1_cash_drawer_expenses;
import POS.cash_drawer.S1_cash_drawer_expenses.to_cash_drawer_expenses;
import POS.users.Users.to_users;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author i1
 */
public class Users {

    public int id;
    public static String screen_name;
    public static String user_name;
    public static String password;
    public static int user_level;
    public static String date_added;
    public static int is_active;
    public static String session_no;
    public static String t_sales;
    public static String t_receipts;
    public static String t_stock_transfer;
    public static String m_items;
    public static String m_category;
    public static String m_users;
    public static String m_uom;
    public static String m_suppliers;
    public static String r_sales;
    public static String r_cash_count;
    public static String r_receipts;
    public static String r_stock_transferred;
    public static String r_stock_take;
    public static String m_customers;
    public static String m_discount;
    public static String m_banks;
    public static List<S1_cash_drawer_checks.to_cash_drawer_checks> checks;
    public static S1_cash_drawer.to_cash_drawer drawer;
    public static String r_stock_left_supplier;
    public static String time_in;
    public static String time_out;
    public static String t_inventory_adjuster;
    public static List<S1_cash_drawer_expenses.to_cash_drawer_expenses> expenses;

    public static List<to_cash_drawer_expenses> getExpenses() {
        return expenses;
    }

    public static void setExpenses(List<to_cash_drawer_expenses> expenses) {
        Users.expenses = expenses;
    }

    public static String getT_inventory_adjuster() {
        return t_inventory_adjuster;
    }

    public static void setT_inventory_adjuster(String t_inventory_adjuster) {
        Users.t_inventory_adjuster = t_inventory_adjuster;
    }

    public static String getTime_in() {
        return time_in;
    }

    public static void setTime_in(String time_in) {
        Users.time_in = time_in;
    }

    public static String getTime_out() {
        return time_out;
    }

    public static void setTime_out(String time_out) {
        Users.time_out = time_out;
    }

    public static String getR_stock_left_supplier() {
        return r_stock_left_supplier;
    }

    public static void setR_stock_left_supplier(String r_stock_left_supplier) {
        Users.r_stock_left_supplier = r_stock_left_supplier;
    }

    public static to_cash_drawer getDrawer() {
        return drawer;
    }

    public static void setDrawer(to_cash_drawer drawer) {
        Users.drawer = drawer;
    }

    public static List<to_cash_drawer_checks> getChecks() {
        return checks;
    }

    public static void setChecks(List<to_cash_drawer_checks> checks) {
        Users.checks = checks;
    }

    public static String getM_banks() {
        return m_banks;
    }

    public static void setM_banks(String m_banks) {
        Users.m_banks = m_banks;
    }

    public static String getM_discount() {
        return m_discount;
    }

    public static void setM_discount(String m_discount) {
        Users.m_discount = m_discount;
    }

    public static String getM_customers() {
        return m_customers;
    }

    public static void setM_customers(String m_customers) {
        Users.m_customers = m_customers;
    }

    public String getDate_added() {
        return date_added;
    }

    public void setDate_added(String date_added) {
        Users.date_added = date_added;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIs_active() {
        return is_active;
    }

    public static void setIs_active(int is_active) {
        Users.is_active = is_active;
    }

    public String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Users.password = password;
    }

    public String getScreen_name() {
        return screen_name;
    }

    public static void setScreen_name(String screen_name) {
        Users.screen_name = screen_name;
    }

    public int getUser_level() {
        return user_level;
    }

    public static void setUser_level(int user_level) {
        Users.user_level = user_level;
    }

    public static String getUser_name() {
        try {
            return user_name;
        } catch (Exception e) {
            return "";
        }

    }

    public static void setUser_name(String user_name) {
        Users.user_name = user_name;
    }

    public static String getSession_no() {
        return session_no;
    }

    public static void setSession_no(String session_no) {
        Users.session_no = session_no;
    }

    public static String getM_category() {
        return m_category;
    }

    public static void setM_category(String m_category) {
        Users.m_category = m_category;
    }

    public static String getM_items() {
        return m_items;
    }

    public static void setM_items(String m_items) {
        Users.m_items = m_items;
    }

    public static String getM_suppliers() {
        return m_suppliers;
    }

    public static void setM_suppliers(String m_suppliers) {
        Users.m_suppliers = m_suppliers;
    }

    public static String getM_uom() {
        return m_uom;
    }

    public static void setM_uom(String m_uom) {
        Users.m_uom = m_uom;
    }

    public static String getM_users() {
        return m_users;
    }

    public static void setM_users(String m_users) {
        Users.m_users = m_users;
    }

    public static String getR_cash_count() {
        return r_cash_count;
    }

    public static void setR_cash_count(String r_cash_count) {
        Users.r_cash_count = r_cash_count;
    }

    public static String getR_receipts() {
        return r_receipts;
    }

    public static void setR_receipts(String r_receipts) {
        Users.r_receipts = r_receipts;
    }

    public static String getR_sales() {
        return r_sales;
    }

    public static void setR_sales(String r_sales) {
        Users.r_sales = r_sales;
    }

    public static String getR_stock_take() {
        return r_stock_take;
    }

    public static void setR_stock_take(String r_stock_take) {
        Users.r_stock_take = r_stock_take;
    }

    public static String getR_stock_transferred() {
        return r_stock_transferred;
    }

    public static void setR_stock_transferred(String r_stock_transferred) {
        Users.r_stock_transferred = r_stock_transferred;
    }

    public static String getT_receipts() {
        return t_receipts;
    }

    public static void setT_receipts(String t_receipts) {
        Users.t_receipts = t_receipts;
    }

    public static String getT_sales() {
        return t_sales;
    }

    public static void setT_sales(String t_sales) {
        Users.t_sales = t_sales;
    }

    public static String getT_stock_transfer() {
        return t_stock_transfer;
    }

    public static void setT_stock_transfer(String t_stock_transfer) {
        Users.t_stock_transfer = t_stock_transfer;
    }

    public static Users.to_users ret_data_autho(String where) {

        Users.to_users to = null;

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",screen_name"
                    + ",user_name"
                    + ",password"
                    + ",user_level"
                    + ",date_added"
                    + ",is_active"
                    + ",t_sales"
                    + ",t_receipts"
                    + ",t_stock_transfer"
                    + ",m_items"
                    + ",m_category"
                    + ",m_users"
                    + ",m_uom"
                    + ",m_suppliers"
                    + ",r_sales"
                    + ",r_cash_count"
                    + ",r_receipts"
                    + ",r_stock_transferred"
                    + ",r_stock_take"
                    + ",m_customers"
                    + ",m_discount"
                    + ",m_banks"
                    + ",r_stock_left_supplier"
                    + ",t_inventory_adjuster"
                    + " from users"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                int id1 = rs.getInt(1);
                String screen_name1 = rs.getString(2);
                String user_name1 = rs.getString(3);
                String password1 = rs.getString(4);
                int user_level1 = rs.getInt(5);
                String date_added1 = rs.getString(6);
                int is_active1 = rs.getInt(7);
                String t_sales1 = rs.getString(8);
                String t_receipts1 = rs.getString(9);
                String t_stock_transfer1 = rs.getString(10);
                String m_items1 = rs.getString(11);
                String m_category1 = rs.getString(12);
                String m_users1 = rs.getString(13);
                String m_uom1 = rs.getString(14);
                String m_suppliers1 = rs.getString(15);
                String r_sales1 = rs.getString(16);
                String r_cash_count1 = rs.getString(17);
                String r_receipts1 = rs.getString(18);
                String r_stock_transferred1 = rs.getString(19);
                String r_stock_take1 = rs.getString(20);
                String m_customers1 = rs.getString(21);
                String m_discount1 = rs.getString(22);
                String m_banks1 = rs.getString(23);
                String r_stock_left_supplier1 = rs.getString(24);
                String t_inventory_adjuster1 = rs.getString(25);
                to = new Users.to_users(id1, screen_name1, user_name1, password1, user_level1, date_added1, is_active1, t_sales1, t_receipts1, t_stock_transfer1, m_items1, m_category1, m_users1, m_uom1, m_suppliers1, r_sales1, r_cash_count1, r_receipts1, r_stock_transferred1, r_stock_take1, m_customers1, m_discount1, m_banks1, r_stock_left_supplier1, t_inventory_adjuster1);

            }
            return to;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static class to_users {

        public final int id;
        public final String screen_name;
        public final String user_name;
        public final String password;
        public final int user_level;
        public final String date_added;
        public final int is_active;
        public final String t_sales;
        public final String t_receipts;
        public final String t_stock_transfer;
        public final String m_items;
        public final String m_category;
        public final String m_users;
        public final String m_uom;
        public final String m_suppliers;
        public final String r_sales;
        public final String r_cash_count;
        public final String r_receipts;
        public final String r_stock_transferred;
        public final String r_stock_take;
        public final String m_customers;
        public final String m_discount;
        public final String m_banks;
        public final String r_stock_left_supplier;
        public final String t_inventory_adjuster;

        public to_users(int id, String screen_name, String user_name, String password, int user_level, String date_added, int is_active, String t_sales, String t_receipts, String t_stock_transfer, String m_items, String m_category, String m_users, String m_uom, String m_suppliers, String r_sales, String r_cash_count, String r_receipts, String r_stock_transferred, String r_stock_take, String m_customers, String m_discount, String m_banks, String r_stock_left_supplier, String t_inventory_adjuster) {
            this.id = id;
            this.screen_name = screen_name;
            this.user_name = user_name;
            this.password = password;
            this.user_level = user_level;
            this.date_added = date_added;
            this.is_active = is_active;
            this.t_sales = t_sales;
            this.t_receipts = t_receipts;
            this.t_stock_transfer = t_stock_transfer;
            this.m_items = m_items;
            this.m_category = m_category;
            this.m_users = m_users;
            this.m_uom = m_uom;
            this.m_suppliers = m_suppliers;
            this.r_sales = r_sales;
            this.r_cash_count = r_cash_count;
            this.r_receipts = r_receipts;
            this.r_stock_transferred = r_stock_transferred;
            this.r_stock_take = r_stock_take;
            this.m_customers = m_customers;
            this.m_discount = m_discount;
            this.m_banks = m_banks;
            this.r_stock_left_supplier = r_stock_left_supplier;
            this.t_inventory_adjuster = t_inventory_adjuster;
        }
    }

}
