<%-- 
    Document   : users
    Created on : May 28, 2020, 8:58:02 PM
    Author     : NguyenHongPhuc
--%>

<%@page import="mvcHomework.Model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List users</title>
    </head>
    <body>
        <h1>The list of users</h1> <a href="./">Home</a> <a href="./">Logout</a>

        <table border="1">
            <thead>
                <tr>
                    <th>Username</th>
                    <th>Password</th>
                    <th>First name</th>
                    <th>Last name</th>
                    <th>Sex</th>
                    <th>Address</th>
                    <th>Email</th>
                    <th>Phone</th>
                    <th>Role</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach items="${users}" var="user" >
                <tr>
                    <td>${user.getUsername()}</td>
                    <td>${user.getPassword()}</td>
                    <td>${user.getFirstname()}</td>
                    <td>${user.getLastname()}</td>
                    <td>${user.getSex()}</td>
                    <td>${user.getAddress()}</td>
                    <td>${user.getEmail()}</td>
                    <td>${user.getPhone()}</td>
                    <td>${user.getRule()}</td>
            </c:forEach>
        </tbody>
    </table>
            
  
        
        <button>
            <a href="./GotoAdminServlet">Back</a>
        </button>
        
        <button>
            <a href="./InsertUserServlet">Create</a>
        </button>
            
        <button>
            <a href="./">Delete</a>
        </button>
    </body>
</html>