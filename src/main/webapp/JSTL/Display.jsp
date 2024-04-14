<%--
  Created by IntelliJ IDEA.
  User: mdtau
  Date: 24-02-2024
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>JSTL - JSP Template Library</title>
</head>
<body>
    Hello World
    <%
        String name = request.getAttribute("label").toString();
        out.println(name);
    %>

    ${label} <br>

    ${student.name} <br>

    ${studs} <br>

    <c:out value="Nazzo" /> <br>

    <c:forEach items="${studs}" var="s">
        ${s} <br>
    </c:forEach> <br>

    <sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/javaser" user="root" password="root@123" />

    <sql:query var="rs" dataSource="${db}">Select * from students</sql:query>

    <c:forEach items="${rs.rows}" var="row">
        <c:out value="${row.Id}"/> :
        <c:out value="${row.Name}"/> :
        <c:out value="${row.Password}"/> :
        <c:out value="${row.Email}"/> :
        <c:out value="${row.Country}"/> <br>
    </c:forEach>

    <c:set var="str" value="Nazish is a worst man"/>
    Length : ${fn:length(str)} <br>

    <c:forEach items="${fn:split(str, ' ')}" var="s">
        ${s} 
    </c:forEach> <br>

    Index : ${fn:indexOf(str, " is")}<br>
    Is there : ${fn:contains(str, "JSP")}<br>

    <c:if test="${fn:endsWith(str, 'man')}">
        You are right buddy
    </c:if><br>

    ${fn:toLowerCase(str)}<br>

</body>
</html>
