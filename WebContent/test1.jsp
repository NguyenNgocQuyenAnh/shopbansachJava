<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <form action="test1.jsp" method="post">
 <input name="txttk" type="text"> <br>
  <input name="butt" type="submit" value="Tong">
<%
  String nn = request.getParameter("txttk");
  // neu chua tao bien session
  if(session.getAttribute("ss")==null)
	  session.setAttribute("ss",(int) 0);
  if(nn !=null){
	  int n = Integer.parseInt(nn);
	 // b1 : gan bien session cho bien
	 int s=(int)session.getAttribute("ss");
	 // b2: thay doi bien
	  s = s+n;
	 //b3: luu bien vao session
	 session.setAttribute("ss", s);
	 out.print("Tong:"+s);
  }
%>
</body>
</html>