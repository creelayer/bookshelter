<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>View Books</title>
    <link href="<c:url value="/css/main.css"/>" rel="stylesheet" type="text/css">
    <script src="<c:url value="/js/jquery-3.7.1.min.js"/>" ></script>
    <script src="<c:url value="/js/book.js"/>" ></script>
</head>
<body>

<jsp:include page="form.jsp"/>
<b id="book-shelter">Book Shelter</b>
<jsp:include page="books.jsp"/>

</html>