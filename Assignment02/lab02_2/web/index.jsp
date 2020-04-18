<%-- 
    Document   : index
    Created on : Apr 16, 2020, 10:35:54 PM
    Author     : NguyenHongPhuc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator Page</title>
    </head>
    <body>

        <div> 
            <h1>Caculator 2 big size number</h1>

            
            <form action="CaculatorServlet" method="Post">
                Toán hạng thứ nhất: 
                <input type="text" name="t1"><br/><br/>
                Phép toán: 
                 <select name="operator">
                    <option>Cong</option>
                    <option>Tru</option>
                    <option>Nhan</option>
                    <option>Chia</option>
                </select><br/><br/>
                Toán hạng thứ hai:
                <input type="text" name="t2">
                <br/><br/>
                <input type="submit" value="Tính toán">                
                
                <br/><br/>
                Kết quả:${ session.getAttribute("result")}
                <input type="text" value= " ${ session.getAttribute("result")}">
                
            </form>
        </div>
    </body>
</html>
