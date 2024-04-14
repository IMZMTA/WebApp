<%--
  Created by IntelliJ IDEA.
  User: mdtau
  Date: 26-02-2024
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Log In</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/Login">
        Enter username : <input type="text" name="uname"><br>
        Enter password : <input type="password" name="pass"><br>
        <input type="submit" value="Login">
    </form>
</body>
</html>
