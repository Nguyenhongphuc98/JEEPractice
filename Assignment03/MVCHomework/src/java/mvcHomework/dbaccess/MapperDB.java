/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcHomework.dbaccess;

import java.sql.Connection;
import mvcHomework.dbconnection.DBConnectionService;

/**
 *
 * @author NguyenHongPhuc
 */
public class MapperDB {
    
    private Connection connection;
    public MapperDB() throws Exception {
        try {            
            connection = DBConnectionService.getConnection();
        } catch (Exception e) {
            System.out.println("Failed in constructor method in MapperDB:" + e);
            e.printStackTrace();
            throw e;
        }
    }

    public MapperDB(Connection con) {
        connection = con;
    }

    public void closeConnection() throws Exception {
        try {
            getConnection().close();
        } catch (Exception e) {
            System.out.println("Failed in closeConnection method in MapperDB:" + e);
            throw e;
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
