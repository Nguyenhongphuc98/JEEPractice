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
@WebServlet(name = "UsersServlet", urlPatterns = {"/UsersServlet"})
public class UsersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        ServletContext context =  request.getServletContext();
        UserBO userBO = new UserBO(context); 
        
        ArrayList<User> users = userBO.getAllUsers();
        request.setAttribute("users", users);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("./WEB-INF/jsp/users.jsp");
        dispatcher.forward(request, response);
    }
}
