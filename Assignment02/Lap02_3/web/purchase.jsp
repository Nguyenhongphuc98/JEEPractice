<%-- 
    Document   : purchase
    Created on : Apr 16, 2020, 9:50:46 PM
    Author     : NguyenHongPhuc
--%>

<%@page import="DTO.ShopingCart"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product</title>

        <style>
            table, th, td {
                border: 1px solid black;
            }
        </style>
    </head>
    <body>
        <h1>Cảm ơn quý khách</h1>

        <form action="ProductServlet" method="post">
        <table>
            <tr>
                <th>STT</th>
                <th>Tên hàng</th>
                <th>Giá</th>
                <th>Số lượng</th>
                <th>Thành tiền</th>
            </tr>
            <%
            ArrayList<ShopingCart> arrC;
            //HttpSession newSession = request.getSession();
            if (session.getAttribute("items") != null) {
                arrC = (ArrayList<ShopingCart>) session.getAttribute("items");
                int sum = 0;
                for(int i=0; i< arrC.size();i++) { 
                    int price =arrC.get(i).getItem().getPrice()*arrC.get(i).getQuantity();
                    sum+= price;
                %>
                    <tr>
                        <td><%= i %></td>
                        <td><%= arrC.get(i).getItem().getName()%></td>
                        <td><%= arrC.get(i).getItem().getPrice()%></td>
                        <td><%= arrC.get(i).getQuantity()%></td>
                        <td><%= price%></td>
                    </tr>
            <% } %>
                <tr>
                    <td>Tổng</td>
                    <td><%= sum %></td>
                </tr>
            <% } %>    
            
        </table>
        
        </form>
           
        <script>
            function myFunction(id) {
                document.getElementById("productID").value = id;
            }
        </script>
    </body>
</html>

