<%-- 
    Document   : product
    Created on : Apr 16, 2020, 10:35:35 AM
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
        <h1>Mua hàng online</h1>

        <form action="ProductServlet" method="post">
        <table>
            <tr>
                <th>STT</th>
                <th>Tên hàng</th>
                <th>Giá</th>
                <th>Số lượng</th>
                <th>mua</th>
            </tr>
            <%
            ArrayList<ShopingCart> arrC;
            //HttpSession newSession = request.getSession();
            if (session.getAttribute("items") != null) {
                arrC = (ArrayList<ShopingCart>) session.getAttribute("items");
     
                for(int i=0; i< arrC.size();i++) { %>
                    <tr>
                        <td><%= i %></td>
                        <td><%= arrC.get(i).getItem().getName()%></td>
                        <td><%= arrC.get(i).getItem().getPrice()%></td>
                        <td><%= arrC.get(i).getQuantity()%></td>
                        <td><input type ="submit" value = "mua" onclick="myFunction(<%= arrC.get(i).getItem().getId()%>)"> </input></td>
                    </tr>
            <% } }%>    
            
        </table>
        <input id="productID" name ="productID" value = "0" type = "hidden" ></input>
        </form>
            
            <form method="post" action="purchase.jsp">
                <input type="submit" value="Thanh toán"></input>
            </form>
        <script>
            function myFunction(id) {
                document.getElementById("productID").value = id;
            }
        </script>
    </body>
</html>
