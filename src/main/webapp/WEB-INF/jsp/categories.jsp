<%-- 
    Document   : categories
    Created on : 21 Aug 2022, 17:58:39
    Author     : kien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<title><fmt:message key="label.category"/></title>
<div class="row container">
    <h2 class="text-center"><fmt:message key="categories.all" /></h2>
    <div class="col-lg-3">
        <ul class="list-group">
            <c:forEach items="${categories}" var="c">
                <c:url value="/categories/${c.id}/products" var="cUrl"/>
                <li class="list-group-item"><a href="${cUrl}" target="_blank">${c.categoryName}</a></li>
                    </c:forEach>
        </ul> 
    </div>
    <div class="col-lg-9 col-sm-12">
        <div class="row">
            <c:forEach items="${categories}" var="c">
                <c:url value="/categories/${c.id}/products" var="cUrl"/>
                <div class="card col-lg-3 col-sm-9">
                    <a href="${cUrl}" target="_blank">
                        <img class="card-img-top" src="${c.image}" alt="${c.categoryName}">
                        <div class="card-body">
                            <h4 class="card-title">${c.categoryName}</h4>
                        </div>
                    </a>
                </div>
            </c:forEach>
        </div>
    </div>
</div>