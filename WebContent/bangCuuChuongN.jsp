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
    int n = 0;
    String so = request.getParameter("txtn");
    if(so!=null){
    	int s = Integer.parseInt(so);
    	if(request.getParameter("but")!=null){ 
    	    for(int i = 1 ; i<=10 ; i++) {%>
    	        <%=s%>x<%=i%>=<%=s*i%> <hr>
    	<% } %>
   <% }%>
 <%} %>

     <form action="bangCuuChuongN.jsp" method="post" >
        Nhập n: <input name="txtn" type="number" value=<%=n %>> ><br>
        <input name ="but" type="submit" value="hiển thị bảng cửu chương">
     </form>
     
</body>
</html>