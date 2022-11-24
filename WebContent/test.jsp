<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="test.jsp" >
	<input name="but1" type="number" >
	<input name ="number" type="submit" value="hiển thị bảng cửu chương">
	<% String s=request.getParameter("but1");  
			Integer a=null;
			if(s==null)   out.print("Nhap so di bae");
			else 
	 		if(s!=null)   a =Integer.parseInt(s);{
	 		%>
	 <table border="2">
	 	<% if(a!=null)
	 	  for(int i=1;i<=9;i++) { %> 
	 		<tr><td><%=a%>x<%=i %>=<%=a*i%></td>
	 		</tr>
	 		<%} %> <%} %>
	 		</table>
	 </form>		
	 		  
	 
	  			
	   
