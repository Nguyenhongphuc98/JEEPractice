/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author NguyenHongPhuc
 */
@WebServlet(name = "BookServlet2", urlPatterns = {"/BookServlet2"})
public class BookServlet2 extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException{
        HttpSession session = request.getSession(true);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String username = (String)session.getAttribute("username");
        String book = request.getParameter("book");
        out.println("<html>");
        out.println("<body>");
        out.println("Well, T see that " + username + "'s favorite book is " + book + ".");
        out.println("</body>");
        out.println("</html>");
    }
}

