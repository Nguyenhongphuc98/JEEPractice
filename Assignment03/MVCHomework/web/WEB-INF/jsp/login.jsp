<%-- 
    Document   : login
    Created on : May 28, 2020, 8:56:54 PM
    Author     : NguyenHongPhuc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Welcome to login page</h1>
        <form method="post", action="./LoginServlet">
            Username <input name="username" type="text"/> <br/>
            Password <input name="password" type="password"/> <br/>
            <input type="submit" value="login"/>
        </form>
    </body>
</html>
