/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcHomework.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mvcHomework.Model.User;
import mvcHomework.bo.UserBO;

/**
 *
 * @author NguyenHongPhuc
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        ServletContext context =  req.getServletContext();
        UserBO userBO = new UserBO(context);        
        User user = userBO.getUserBy(req.getParameter("username"));
        
        String ref = "./GotoLoginServlet";
        
        if (user.getPassword().equals(req.getParameter("password"))) {
            if (user.getRule().equals("admin")) {
                ref = "./GotoAdminServlet";
            } else {
                ref = "./GotoUserServlet";
            }
        }
        
        resp.sendRedirect(ref);
    }
}
