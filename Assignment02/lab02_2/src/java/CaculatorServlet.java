/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
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
@WebServlet(urlPatterns = {"/CaculatorServlet"})
public class CaculatorServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            Integer t1 = Integer.parseInt(request.getParameter("t1"));
            Integer t2 = Integer.parseInt(request.getParameter("t2"));
            String toantu = request.getParameter("operator");
            Integer ketqua = 0;
            switch (toantu) {
                case "Cong":
                    ketqua = t1 + t2;
                    break;
                case "Tru":
                    ketqua = t1 - t2;
                    break;
                case "Nhan":
                    ketqua = t1 * t2;
                    break;
                case "Chia":
                    ketqua = t1 / t2;
                    break;
            }

            HttpSession session = request.getSession();
            session.setAttribute("result", ketqua);

            response.sendRedirect("index.jsp");
        } catch (Exception e) {
             response.sendRedirect("index.jsp");
        }
    }

}
