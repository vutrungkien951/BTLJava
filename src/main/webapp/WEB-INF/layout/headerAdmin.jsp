<%-- 
    Document   : headerAdmin
    Created on : 23 Aug 2022, 19:05:22
    Author     : kien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <div class="container-fluid">
        <ul class="navbar-nav">
            <c:url value="/" var="home"/>
            <li class="nav-item">
                <a class="nav-link active" href="${home}"><fmt:message key="index.title"/></a>
            </li>
            <li class="nav-item">
                <c:url  value="/admin/users" var="userUrl"/>
                <a class="nav-link" href="${userUrl}"><fmt:message key="admin.user"/></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#"><fmt:message key="label.category"/></a>
            </li>
        </ul>
        <ul class="navbar-nav">
            <div class="dropdown">
                <button class="btn btn-dark dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">
                    <i class="fas fa-envelope fa-fw"></i>
                    <!-- Counter - Messages -->
                    <span class="badge badge-danger badge-counter">7</span>
                </button>
                <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
                    <li><a class="dropdown-item" href="#">Action</a></li>
                    <li><a class="dropdown-item" href="#">Another action</a></li>
                    <li><a class="dropdown-item" href="#">Something else here</a></li>
                </ul>
            </div>
            <c:url value="/logout" var="logout"/>
            <a href="${logout}" class="btn btn-light"><fmt:message key="label.logout"/></a>
        </ul>
    </div>
</nav>