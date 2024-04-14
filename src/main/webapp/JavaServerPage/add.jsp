<%--
  Created by IntelliJ IDEA.
  User: mdtau
  Date: 21-02-2024
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %> <!--Directive Tag ( import )-->
<html>
<head>
    <title>Add Java Server Page</title>
</head>
<body bgcolor="#8b0000">

<%
    int i,j,k=0;

    try{
        i = Integer.parseInt(request.getParameter("n1"));
        j = Integer.parseInt(request.getParameter("n2"));
        k = i + j;

    } catch(NumberFormatException e){
        out.println("Invalid input. Please enter valid integers.");
    }
    out.println("Output: " + k);
%>  <!--Scriplet Tag (inside service method)-->
<%! int a = 5;%> <!--declaration Tag (outside service method)-->
<%= a %> <!-- //Expression Tag (directly inside out.println)-->
</body>
</html>
