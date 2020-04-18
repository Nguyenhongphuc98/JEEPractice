<%-- 
    Document   : login
    Created on : Apr 18, 2020, 10:42:05 AM
    Author     : NguyenHongPhuc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <%
            String username = request.getParameter("username");
            String password = request.getParameter("password");
        %>
        Welcome <%=username%>
        <form action="BookServlet" method ="post">
            <input type="hidden" name="username" value="<%=username%>">
            <p>
                Please enter your favorite book :
                <select name ="book">
                    <option value="C" selected> C/C++</option>
                    <option value="Java"> Java </option>
                    <option value ="Linux"> Linux </option>
                    <option value ="XML"> XML </option>
                    <option value ="SQL Server"> SQL Server 2005</option>
                </select>
            <p>
                <input type = submit value ="Choose book">
        </form>
    </body>
</html>
