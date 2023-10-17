<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url var="add_book_url" value="/book/add"/>
<form:form action="${add_book_url}" method="post" modelAttribute="book">
    <form:label path="name">Book Name: </form:label>
    <form:input type="text" path="name"/>
    <input type="submit" value="Save"/>
    <form:errors path="name" cssClass="error" />
</form:form>