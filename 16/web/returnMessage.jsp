<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" import="java.sql.*"%>
<html>
<head>
    <title>MVC(JSP+JavaBean+Servlet)入门实例--中国网页设计</title>
</head>

<body>
<%
    String message=new String ( request.getParameter("message").getBytes("ISO8859-1"),"GBK" ); %>
<%=message %>
</body>
</html>