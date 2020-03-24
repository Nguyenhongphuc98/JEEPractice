<%-- 
    Document   : thongTinDangKyHandle
    Created on : Mar 24, 2020, 9:07:58 PM
    Author     : NguyenHongPhuc
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kết quả đăng ký</title>
    </head>
    <body>
        <h1>Thông tin sinh viên đăng ký</h1>
        
        <% String hoTen = request.getParameter("hoTen");
         String maSo = request.getParameter("maSo");
         String ngaySinh = request.getParameter("ngaySinh");
         String gioiTinh = request.getParameter("gioiTinh");
         String khoa = request.getParameter("khoa");
         String tinHoc = request.getParameter("tinHoc");
         String vanNghe = request.getParameter("vanNghe");
         String theThao = request.getParameter("theThao");
         String soThich = request.getParameter("soThich"); %>
         
         <b>Thông tin người dùng đã nhập</b> <br/>
        Họ tên: <%=hoTen%><br>
        Mã số: <%=maSo%><br>
        Ngày sinh: <%=ngaySinh%><br>
        Giới tính: <%=gioiTinh%><br>
        Khoa: <%=khoa%><br>
        Câu lạc bộ:
        <% if (tinHoc != null) {%>
            <%=tinHoc%> ,
        <%}%>
        <% if (vanNghe != null) {%>
            <%=vanNghe%> ,
        <%}%>
        <% if (theThao != null) {%>
            <%=theThao%>
        <%}%>
       <br>
        Sở thích:<%=soThich%><br>
    </body>
</html>
