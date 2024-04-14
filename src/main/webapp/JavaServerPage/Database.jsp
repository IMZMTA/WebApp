<%--
  Created by IntelliJ IDEA.
  User: mdtau
  Date: 24-02-2024
  Time: 12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Database Connection</title>
</head>
<body>
    <%
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaser", "root", "root@123");

            Statement st = con.createStatement();
            String query = "Select * from students";
            ResultSet rs = st.executeQuery(query);
            rs.next();
            out.println(rs.getString(1)+" " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5));
            System.out.println(con);
        }catch (Throwable e){
            out.println( e);
        }

    %>
</body>
</html>
