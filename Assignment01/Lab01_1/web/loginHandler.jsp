<%-- 
    Document   : loginHandler
    Created on : Mar 24, 2020, 8:41:27 PM
    Author     : NguyenHongPhuc
--%>


<html>  
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Handel</title>
    </head>
    <body>
        <% String userName = request.getParameter("username");
        String password = request.getParameter("password"); %>
        
        <% if(userName.equals("admin") && password.equals("admin")){ %>
            <h1>HelloAdmin</h1>
        <% }else{ %>
            <b> Thong tin nguoi dung da nhap </b><br>
            Username:<%=userName%><br>
            Password<%=password%><br>
        <%} %>
        
    </body>
</html>
