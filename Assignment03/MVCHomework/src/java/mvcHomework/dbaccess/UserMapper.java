/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcHomework.dbaccess;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import mvcHomework.Model.User;

/**
 *
 * @author NguyenHongPhuc
 */
public class UserMapper extends MapperDB{
    
     public UserMapper() throws Exception {
        super();
    }    

    public User getUserBy(String username) {
        User u = new User();
        Statement stmt = null;
        try {
            stmt = getConnection().createStatement();
            String sqlStr = "SELECT * FROM user WHERE username = '" + username + "'";
            ResultSet rs = stmt.executeQuery(sqlStr); // Send the query to the server
            int count = 0;
            if (rs != null && rs.next()) {
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
                u.setFirstname(rs.getString("firstname"));
                u.setLastname(rs.getString("lastname"));
                u.setEmail(rs.getString("email"));
                u.setAddress(rs.getString("address"));
                u.setPhone(rs.getString("phone"));
                u.setRule(rs.getString("rule"));
                u.setSex(rs.getString("sex"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        return u;
    }
    
    public ArrayList<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<>();    
        try {     
            Statement stmt = getConnection().createStatement();
            String sqlStr = "SELECT * FROM user";
            ResultSet rs = stmt.executeQuery(sqlStr); // Send the query to the server
  
            while(rs != null && rs.next()) {
                User u = new User();
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
                u.setFirstname(rs.getString("firstname"));
                u.setLastname(rs.getString("lastname"));
                u.setEmail(rs.getString("email"));
                u.setAddress(rs.getString("address"));
                u.setPhone(rs.getString("phone"));
                u.setRule(rs.getString("rule"));
                u.setSex(rs.getString("sex"));
                
                users.add(u);
            }       
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
        
        return users;
    }
    
    public boolean saveUser(User user) {
        Statement stmt = null;

        try {
            stmt = getConnection().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(UserMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sqlStr = "insert into user values ('" + user.getUsername() + "','"
                + user.getPassword() + "','"
                + user.getFirstname() + "','"
                + user.getLastname() + "','"
                + user.getSex() + "','"
                + user.getAddress() + "','"
                + user.getEmail() + "','"
                + user.getPhone() + "','"
                + user.getRule() + "')";

        int r = -1;
         try {
             r = stmt.executeUpdate(sqlStr);
         } catch (SQLException ex) {
             Logger.getLogger(UserMapper.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        return r>0;
    }
}
