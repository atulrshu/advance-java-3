<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hello World JSP
This project contain code for About JSP too.
<p>
<strong>
<%= new java.util.Date() %>
</strong>
</p>

<p>
<strong>
<%= pageContext.getServletContext().getContextPath() %>
</strong>
</p>

${pageContext.servletContext.contextPath}

</body>
</html>