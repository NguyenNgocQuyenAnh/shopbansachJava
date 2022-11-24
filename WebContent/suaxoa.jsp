<%@page import="bo.giohangbo"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
giohangbo gh=(giohangbo)session.getAttribute("gio");
if(request.getParameter("butcheck")!=null){
	String[] arr=request.getParameterValues("check");
	if(arr!=null)
	   for(String st:arr)
		 gh.xoa(st);
}
if(request.getParameter("butsua")!=null){
	String ms=request.getParameter("butsua");
	String tendksl="t"+ms;
	long sl=Long.parseLong(request.getParameter(tendksl));
	if(sl==0){
		gh.xoa(ms);
	}
	else{
		gh.sua(ms, sl);
	}
}else
	if(request.getParameter("butxoa")!=null){
		String ms=request.getParameter("butxoa");
		gh.xoa(ms);
	}
else if(request.getParameter("butxoaAll")!=null){
	gh.xoaAll();
}
if(gh.ds.size()==0)//Neu trong gio het hang
	   response.sendRedirect("htsach");
else
	   response.sendRedirect("htgio");
%>

</body>
</html>
