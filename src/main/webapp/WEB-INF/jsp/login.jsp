<%-- 
    Document   : login
    Created on : 18 Aug 2022, 14:08:49
    Author     : kien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<title><fmt:message key="label.login" /></title>
<h1 class="text-center text-danger"><fmt:message key="label.login" /></h1>
<div class="container">
    <c:url value="/login" var="action" />
    <form action="${action}" method="POST">
        <c:if test="${param.error != null}">          
            <p>  
                <fmt:message key="login.error.invalidUsernamePasswordMsg"/>
            </p>  
        </c:if>  
        <c:if test="${param.logout != null}">         
            <p>  
                <fmt:message key="login.error.logoutMsg"/> 
            </p>  
        </c:if>
        <div class="mb-3 mt-3">
            <label for="username" class="form-label"><fmt:message key="login.username" /></label>
            <input type="text" class="form-control" id="username" placeholder="<fmt:message key="login.username.placeHolder" />" name="username">
        </div>
        <div class="mb-3">
            <label for="password" class="form-label"><fmt:message key="login.password" /></label>
            <input type="password" class="form-control" id="password" placeholder="<fmt:message key="login.password.placeHolder" />" name="password">
        </div>
        <input type="hidden"                          
               name="${_csrf.parameterName}"  
               value="${_csrf.token}"/>  
        <button type="submit" class="btn btn-primary"><fmt:message key="label.login" /></button>
    </form> 
</div>