<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="service.PersonService"
		import="util.JDBCUtils"
		import="domain.Person"
		import="java.sql.*"
%>
<!DOCTYPE html>
<html>
<head><meta charset="UTF-8"><title>DAO模式测试</title></head>
<body>
<!----- 1.首先创建Person的对象  ------>
<jsp:useBean id="user" class="domain.Person"></jsp:useBean>

<!-----1.为user对象设置值 ------>
<jsp:setProperty property="*" name="user"/>
<%

	PersonService ps=new PersonService();
	Person existUser=ps.login(user);
	if(existUser!=null){
		out.println(existUser.getName()+"，恭喜你登录成功！<br>");
%>
	<h3>登录用户信息</h3>
	名字：<%=existUser.getName() %><br>
	密码：<%=existUser.getPassword() %><br>
	生日：<%=existUser.getBirthDate() %><br>
<%	
	} else{
	out.println("用户名或密码错误，请重新输入！");
	out.println(user.getName());
	response.setHeader("refresh", "5;url=index.html");	//重定向回登录页面	
%>
	
	<h3>如果系统没有自动跳转，请点击<a href="index.html">此链接</a>！</h3>
<%	
}
%>
</body>
</html>