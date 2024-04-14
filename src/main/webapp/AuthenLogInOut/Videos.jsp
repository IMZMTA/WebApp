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
    <title>Videos</title>
</head>
<body>

    <%
        response.setHeader("Cache-Control","no-cache, no-store, must-validate"); //http 1.1

        response.setHeader("Pragma","no-cache"); //http - 1.0
        response.setHeader("Expires",0); //Proxy server

        if(session.getAttribute("username")==null){
            response.sendRedirect("Login.jsp");
        }
    %>

    <h1>Videos</h1>
</body>
</html>
