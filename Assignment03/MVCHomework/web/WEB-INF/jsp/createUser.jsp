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
        
        <form method="post" action="./">
            Username <input type="text"/><br/>
            Pass <input type="password"/><br/>
            Confirm Pass <input type="password"/><br/>
            First name <input type="text"/><br/>
            Last name <input type="text"/><br/>
            Sex <input type="text"/><br/>
            Email <input type="text"/><br/>
            Phone <input type="text"/><br/>
        </form>
        
        <button>
            <a href="./">Back</a>
        </button>
        
        <button>
            <a href="./">Save</a>
        </button>
    </body>
</html>
