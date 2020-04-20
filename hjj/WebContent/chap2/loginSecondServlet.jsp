<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
  	<meta charset="UTF-8">
    <title>SecondServlet的登录页</title>
  </head> 
  <body>
   <form name = "form1" action="../SecondServlet" method="post">
   		<p>用户名：<input type="text" name="name" value=""><br>     
     	<p>年    龄:<input type="text" name ="age"> <br><br>
      	<input type = "submit" value = "提交">
      	<input type = "reset" value = "重置">    
    </form>
    
   </body>
 </html>