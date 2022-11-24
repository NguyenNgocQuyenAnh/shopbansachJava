
<%@page import="bean.giohangbean"%>
<%@page import="bo.giohangbo"%>
<%@page import="bean.sachbean"%>
<%@page import="bo.sachbo"%>
<%@page import="bean.loaibean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bo.loaibo"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
      <li class="active"><a href="htsach">Trang chủ</a></li>
      
      <li><a href="htgio">Giỏ hàng</a></li>
      <li><a href="#">Thanh toán</a></li>
      <li><a href="#">Lịch sử mua hàng</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li>
      <%if(session.getAttribute("dn")==null){ %>
      <a href="ktdn">
      <span class="glyphicon glyphicon-log-in"></span>
       Login
       </a>
       <%}else{ %>
       <a href="#">
	      <span class="glyphicon glyphicon-log-in"></span>
	       Hi: <%=session.getAttribute("dn") %>
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
      <% ArrayList<loaibean> dsloai = (ArrayList<loaibean>)request.getAttribute("dsloai");
        for(loaibean l: dsloai){
      %>
          <tr>
           <td>
            <a href="htsach?ml=<%=l.getMaloai()%>"> 
              <%=l.getTenloai() %>
             </a>
          </td>
          </tr>
          <%} %>
       </table>
        </td>
      <td width="600" valign="top">
      
  <form action="suaxoa" method="post">
      <table class="table table-hover">
         <th></th>
         <th style="font-weight: bold; color: green ;">Mã sách</th>
         <th style="font-weight: bold; color: green">Tên Sách</th>
         <th style="font-weight: bold; color: green">Giá</th>
         <th style="font-weight: bold; color: green">số lượng</th>
         <th></th>
         <th style="font-weight: bold; color: green">Thành Tiền</th>
      <%  giohangbo gh=
       		(giohangbo)session.getAttribute("gio");
      	if(gh!=null){
      	  for(giohangbean s: gh.ds){
      %>
          <tr>
          <td>
			 <input type="checkbox" name="check" 
			 value="<%=s.getMasach() %>">
 			</td>
           <td>  <%=s.getMasach()%>  </td>
           <td> <%=s.getTensach()%>  </td>
           <td> <%=s.getGia() %>     </td>
           <td>  <%=s.getSoluong()%>  </td>
           <td>
           
            
       <input type="number" min="0" name="t<%=s.getMasach() %>">
           <button name="butsua" value="<%=s.getMasach() %>" class="btn-link" type="submit">
           		Update
           	</button>
           	 <button name="butxoa" value="<%=s.getMasach() %>" class="btn-link" type="submit">
           		Delete
           	</button>
 
           </td>
           <td>  <%=s.getThanhtien() %>
          </td>
         
      <%}   }%>
       </table>
     <table>
          <tr>
           <td> <h2 style="font-size: 25; font-weight: bold; color: Blue">Tổng Tiền:</h2></td>
           <td> <h2><%=gh.Tongtien() %></h2></td>
           
          </tr>
     </table>
      <button name="butcheck" value="haha" class="btn-link" type="submit">
           		Delete 
      </button>
        <button name="butxoaAll" value="haha" class="btn-link" type="submit">
           		Delete All
      </button>
      <a href="thanhtoan">Thanh Toán</a>
  </form>
       </td>
      <td width="200" valign="top">
      <form action="htsach" method="post">
 		 <input class="form-control" name="txttk" type="text" value="" placeholder="Nhap tt"> <br>
  		 <input class="btn-primary" name="butt" type="submit" value="Search">
		</form>
       
       </td>
   </tr>

</table>
</body>
</html>
