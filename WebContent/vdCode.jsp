<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <table border="1">
   <%for(int i=1;i<=100;i++) {%>
      <tr><td>5x<%=i %>=<%=5*i %></td></tr>
    <%} %>   
    </table>
</body>
</html>