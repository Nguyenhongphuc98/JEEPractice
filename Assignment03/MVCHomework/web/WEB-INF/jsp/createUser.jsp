<%-- 
    Document   : createUser
    Created on : May 28, 2020, 8:57:50 PM
    Author     : NguyenHongPhuc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create new user</title>
    </head>
    <body>
        <h1>Create new user</h1> <a href="./">Home</a> <a href="./">Logout</a>
        
        <form method="post" action="./InsertUserServlet">
            Username <input name="username" type="text"/><br/>
            Pass <input name="password" type="password"/><br/>
            Confirm Pass <input name="password2" type="password"/><br/>
            First name <input name="firstname" type="text"/><br/>
            Last name <input name="lastname" type="text"/><br/>
            Sex <input name="sex" type="text"/><br/>
            Email <input name="email" type="text"/><br/>
            Phone <input name="phone" type="text"/><br/>

            <button>
                <a href="./GotoADminServlet">Back</a>
            </button>

            <input type="submit" value="save">
        </form>
        
        
    </body>
</html>
