<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Calendar c= Calendar.getInstance(); 
int ngay = c.get(Calendar.DATE);
int thang= c.get(Calendar.MONTH)+1;
int nam =  c.get(Calendar.YEAR);
%>
<div align="right">
Hom nay, ngay <%=ngay%> thang <%=thang%> nam <%=nam%>
</div>
<hr>
Chon ngay:
<form action="htkq.jsp" method="post">
   Chon ngay:
    <select name="sngay">
              <%for(int i=1 ; i<=31; i++) {%>
                  <option <%=(ngay==i?"selected":"") %>><%=i%></option>
             <% }%>
    </select>
    Chon thang:
    <select name="sthang">
         <%for(int i=1 ; i<=12; i++) {%>
                  <option <%=(thang==i?"selected":"") %>
                  value="<%=i*i %>" 
                  ><%=i%></option>
         <% }%>
    </select>
    Chon nam:
    <select name="snam">
        <%for(int i=nam-10 ; i<=nam; i++) {%>
                  <option <%=(nam==i?"selected":"") %>><%=i%></option>
             <% }%>
    </select>
    <input name="but1" type="submit" value="xem ket qua">
</form>
</body>
</html>

