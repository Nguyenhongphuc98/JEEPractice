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
import mvcHomework.Model.User;

/**
 *
 * @author NguyenHongPhuc
 */
public class UserMapper extends MapperDB{
    
     public UserMapper() throws Exception {
        super();
    }    
//    public ArrayList<User> searchBook(String authorName) {
//        ArrayList<BookDTO> books = new ArrayList<>();    
//        try {     
//            Statement stmt = getConnection().createStatement();
//            String sqlStr = "SELECT * FROM ebookshop.books WHERE author LIKE "
//                    + "'%" + authorName + "%'"
//                    + " AND qty > 0 ORDER BY author ASC, title ASC";
//            ResultSet rs = stmt.executeQuery(sqlStr); // Send the query to the server
//            int count = 0;
//            while (rs != null && rs.next()) {
//                BookDTO book = new BookDTO();
//                book.setId(rs.getInt("id"));
//                book.setTitle(rs.getString("title"));
//                book.setAuthor(rs.getString("author"));
//                book.setPrice(rs.getFloat("price"));
//                book.setQty(rs.getInt("qty"));
//                books.add(book);
//            }          
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        } 
//        
//        return books;
//    }
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
}
