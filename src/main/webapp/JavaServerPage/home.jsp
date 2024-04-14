<%--
  Created by IntelliJ IDEA.
  User: mdtau
  Date: 24-02-2024
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*"%>
<%@ page import="java.util.ArrayList" errorPage="Error.jsp" %> <!-- page directive used to import java packages, define language -->
<%@ include file="add.jsp"%> <!-- used to import another jsp page -->
<%--<%@ taglib prefix="c" uri="uri" %> <!-- used for custom tag -->--%>

<html>
<head>
    <title>JSP Directive</title>
</head>
<body>
    <%
//    try{
//        int m =9/0;
//    }catch (Exception e){
//        out.println("Error ocurred :" + e.getMessage());
//    }
        int n =9/0;
    %>
</body>
</html>
