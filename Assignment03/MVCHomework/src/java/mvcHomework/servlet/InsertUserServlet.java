/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcHomework.servlet;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "InsertUserServlet", urlPatterns = {"/InsertUserServlet"})
public class InsertUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String password2 = request.getParameter("password2");
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String sex = request.getParameter("sex");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        
        if (!password.equals(password2)) {
            return;
        }
        
        User user = new User(username, password, firstname, lastname, sex, address, email, phone, "user");
        
        ServletContext context =  request.getServletContext();
        UserBO userBO = new UserBO(context);        
        
        if (userBO.saveUser(user)) {
            response.sendRedirect("./UsersServlet");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       RequestDispatcher dispatcher = req.getRequestDispatcher("./WEB-INF/jsp/createUser.jsp");
       dispatcher.forward(req, resp);
    }
}
