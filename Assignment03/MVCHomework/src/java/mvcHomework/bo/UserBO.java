/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcHomework.bo;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import mvcHomework.Model.User;
import mvcHomework.dbaccess.UserMapper;

/**
 *
 * @author NguyenHongPhuc
 */
public class UserBO {
    private ServletContext context;

    public UserBO(ServletContext context) {
        this.context = context;
    }
    
    public User getUserBy(String username) {
        User user = null;
        UserMapper mapper = null;
        try {
            mapper = new UserMapper();
            user = mapper.getUserBy(username);
        } catch (Exception ex) {
            Logger.getLogger(UserBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                mapper.closeConnection();
            } catch (Exception ex) {
                Logger.getLogger(UserBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
        return user;
    }
    
    public ArrayList<User> getAllUsers() {
        ArrayList<User> users = null;
        UserMapper mapper = null;
        try {
            mapper = new UserMapper();
            users = mapper.getAllUsers();
        } catch (Exception ex) {
            Logger.getLogger(UserBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                mapper.closeConnection();
            } catch (Exception ex) {
                Logger.getLogger(UserBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return users;
    }
    
    public boolean saveUser(User user) {
        UserMapper mapper = null;
        boolean r = false;
        try {
            mapper = new UserMapper();
            r = mapper.saveUser(user);
        } catch (Exception ex) {
            Logger.getLogger(UserBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                mapper.closeConnection();
            } catch (Exception ex) {
                Logger.getLogger(UserBO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
        
        return r;
    }
}
