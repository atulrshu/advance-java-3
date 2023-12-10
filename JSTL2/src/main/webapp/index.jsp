<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<c:out value="Hello World JSTL" />

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

<p>
${pageContext.servletContext.contextPath}
</p>

<p>
Using c:out
<c:out value="${pageContext.servletContext.contextPath}" />
</p>

<p>
<c:url value="/test" />
</p>

</body>
</html>