/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelet;

import DTO.Item;
import DTO.ShopingCart;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
@WebServlet(name = "ProductServlet", urlPatterns = {"/ProductServlet"})
public class ProductServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<ShopingCart> items;
        HttpSession session = request.getSession();
        items = (List<ShopingCart>) session.getAttribute("items");
        
        if (items == null) {
            items = ShopingCart.generateItems();
        } else {
            try {
                int productID = Integer.parseInt(request.getParameter("productID"));
                for (ShopingCart item : items) {
                if (item.getItem().getId() == productID) {
                    item.setQuantity(item.getQuantity() + 1);
                }
            }
            } catch (Exception e) {
            }
            
        }
        session.setAttribute("items", items);

        response.sendRedirect("product.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
