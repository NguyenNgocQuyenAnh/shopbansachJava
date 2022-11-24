<%@page import="bean.giohangbean"%>
<%@page import="bo.giohangbo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%
       //neu mua hang lan dau
    giohangbo gh ;
       //b1: luu session ra bien
       gh =(giohangbo) session.getAttribute("gio");
       //b2: thao tac tren bien
       // xoa sach
       if(request.getParameter("msxoa")!=null){
    	   gh.xoa(request.getParameter("msxoa"));
       }
       //luu bien vao session
       session.setAttribute("gio", gh);
       //hien thi hang
       response.sendRedirect("htgio.jsp");
       
    %>
</body>
</html>