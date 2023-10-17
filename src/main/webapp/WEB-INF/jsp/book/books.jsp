<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url var="add_book_url" value="/book/find"/>
<table id="books" data-url="${add_book_url}">
    <thead>
    <tr>
        <th>Name</th>
        <th>createAt</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.name}</td>
            <td>${book.createdAt}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>