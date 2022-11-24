<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
   <table>
      <tr>
        <td>
           <a href="vdRequest.jsp?masv=sv1"> Nguyễn văn Tèo </a> <hr>
            <a href="vdRequest.jsp?masv=sv2"> Lê Văn Tý </a> <hr>
            <a href="vdRequest.jsp?masv=sv3"> Quách Mộng Mơ </a> <hr>
        </td>
        <td>
          <%
           String msv = request.getParameter("masv");
           if(msv==null)
        	   out.print("chay dau tien");
           else
           if(msv.equals("sv1"))
        	   out.print("thong tin cua sv: nguyen van teo");
           else if(msv.equals("sv2"))
        	   out.print("thong tin cua sv: nguyen thi thu hanh");
           else
        	   out.print("thong tin cua sv: nguyen ngoc quyen anh");
        %>
        </td>
        </tr>
         
          
   </table>
</body>
</html>
