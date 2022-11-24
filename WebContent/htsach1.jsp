<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="bo.sachbo"%>
<%@page import="bean.sachbean"%>
<%@page import="bean.loaibean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bo.loaibo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
    <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    
    <ul class="nav navbar-nav">
      <li class="active"><a href="htsach">trang chu</a></li>
      
      <li><a href="htgio">gio hang</a></li>
       <li><a href="#">thanh toan</a></li>
        <li><a href="#">lich su mua hang</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li>
      <%if(session.getAttribute("dn")==null){ %>
      <a href="#">
      <span class="glyphicon glyphicon-user"></span> 
       Sign Up</a>
       <%}else {%>
          <a href="#">
      <span class="glyphicon glyphicon-user"></span>Log out</a>
       <%}%>
       </li>
      <li>
      <% if(session.getAttribute("dn")==null){ %>
      <a href="ktdn">
      <span class="glyphicon glyphicon-log-in"></span>
       Login</a>
      <%}else{ %>
         <a href="#"><span class="glyphicon glyphicon-log-in"></span>
           Hi:<%=session.getAttribute("dn") %>
         </a>
         <%} %>
      </li>
    </ul>
  </div>
</nav>
    
    <table width="1000" align="center">
   <tr>
      <td width="200" valign="top">
      <table class="table table-hover">
         <c:forEach var="l" items="${dsloai}">
       <tr><td>
       <a href="htsach?ml=${l.getMaLoai()}">
       ${l.getTenLoai()}
       </a>  
       </td>
       </tr>
       </c:forEach>
       </table> 
      </td>
      <td width="600" valign="top"> 
         <table>
      <%
       
         ArrayList<sachbean> dssach =(ArrayList<sachbean>) request.getAttribute("dssach");
        int n=dssach.size();
        for(int i=0;i<n;i++){
        	sachbean s = dssach.get(i);
       %>
         <tr>
         <td>
            <img src="<%=s.getAnh() %>"> <br>
            <%=s.getTensach() %> <br>
            <%=s.getTacgia() %> <br>
            <%=s.getGia() %> <br>
             <a href="giohang?ms=<%=s.getMasach()%>&ts=<%=s.getTensach()%>&gia=<%=s.getGia()%>">
                <img src=mua.jpg>
             </a>
         </td>
         <%i++;
         if(i<n){
         s=dssach.get(i);%>
         <td>
            <img src="<%=s.getAnh() %>"> <br>
            <%=s.getTensach() %> <br>
            <%=s.getTacgia() %> <br>
            <%=s.getGia() %> <br>
           <a href="giohang?ms=<%=s.getMasach()%>&ts=<%=s.getTensach()%>&gia=<%=s.getGia()%>">
                <img src=mua.jpg>
           </a>
         </td>
         <%} %>
         </tr>
       <%} %>
       </table>
        
       </td>
      <td width="200" valign="top"> 
        <form action="htsach" method="post">
 		 <input  name="txttk" type="text" value="" placeholder="Nhap tt"> <br>
  		 <input name="butt" type="submit" value="Search">
		</form>
     </td>
   </tr>
  
</table>
</body>

</body>
</html>