<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <table>
      <form action="a" method="post" id="form">
          <input name="searchtt" type="text">
          <div class="g-recaptcha" data-sitekey="6LcCCy4jAAAAAMdk-yEptTV2-ETV08VBA55tI8kU"></div>
          <div id="error"></div>
          <input name="but1" type="submit" value="search"><br>
       </form>
        <script src="https://www.google.com/recaptcha/api.js" async defer></script>
          <script>
          window.onload = function (){
				let isValid = false;
				const form = document.getElementById("form");
				const error = document.getElementById("error");
				
				form.addEventListener("submit", function (event){
					event.preventDefault();
					const response = grecaptcha.getResponse();
					if (response){
						form.submit();
					} else {
						error.innerHTML = "Please check";
					}
				});
			}
          </script>
       </table>
        
</body>
</html>