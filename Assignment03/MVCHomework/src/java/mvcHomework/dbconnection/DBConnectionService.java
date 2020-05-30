/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcHomework.dbconnection;
import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author NguyenHongPhuc
 */
public class DBConnectionService {

    protected static void loadJDBCDriver() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (java.lang.ClassNotFoundException e) {
            throw new Exception("SQL JDBC Driver not found ...");
        }
    }

    public static Connection getConnection() throws Exception {
        Connection connect = null;
        if (connect == null) {
            loadJDBCDriver();
            try {
                /// admin page: http://www.phpmyadmin.co/tbl_sql.php?db=sql10344264
                connect = DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net/sql10344264?allowPublicKeyRetrieval=true&useSSL=false",
                        "sql10344264", "KLlKm6ltLr");
            } catch (java.sql.SQLException e) {
                throw new Exception("Can not access to Database Server ..." + e.getMessage());
            }
        }
        return connect;
    }
}
