<%-- 
    Document   : header
    Created on : 11 Aug 2022, 07:19:48
    Author     : kien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<nav class="navbar navbar-expand-lg navbar-light bg-light"> 
    <div class="px-4 px-lg-5" id="pagetop">
<!--        <a class="navbar-brand" href="<c:url value="/" />">LOAN</a>     -->
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
                <li class="nav-item"><a class="nav-link active" aria-current="page" href="<c:url value="/" />"><fmt:message key="index.title" /></a></li>
                <li class="nav-item"><a class="nav-link" href="#!"><fmt:message key="label.about" /></a></li>
                <li class="nav-item"><a class="nav-link" href="<c:url value="/categories" />"><fmt:message key="label.category" /></a></li>
                <li class="nav-item dropdown">
                    <div class="dropdown">
                        <button type="button" class="btn btn-secondary dropdown-toggle" data-bs-toggle="dropdown">
                            <fmt:message key="label.select.lange" />
                        </button>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="?lang=en"><fmt:message key="label.lang.en" /></a></li>
                            <li><a class="dropdown-item" href="?lang=vn"><fmt:message key="label.lang.vn" /></a></li>
                        </ul>
                    </div>
                </li>
            </ul>
            <c:url value="/" var="action" />
            <form class="d-flex" action="${action}">
                <input class="form-control me-auto margin-2sides" name="kw" type="text" placeholder="<fmt:message key="label.search.textbox" />" />
                <button class="btn btn-secondary margin-2sides" type="submit"><fmt:message key="label.search" /></button>
            </form>
            <form class="d-flex">
                <button class="btn btn-outline-dark" type="submit">
                    <i class="bi-cart-fill me-1"></i>
                    <fmt:message key="label.cart" />
                    <span class="badge bg-dark text-white ms-1 rounded-pill">0</span>
                </button>
            </form>
            <a href="<c:url value="/login"/>" class="btn btn-primary margin-2sides"><fmt:message key="label.login" /></a>
            <a href="<c:url value="/signup" />" class="btn btn-primary"><fmt:message key="label.signup" /></a>
        </div>
    </div>
</nav>
