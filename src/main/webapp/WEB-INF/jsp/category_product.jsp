<%-- 
    Document   : category_product
    Created on : 22 Aug 2022, 10:17:43
    Author     : kien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="row container">
    <h2 class="text-center"><fmt:message key="categories.product" /></h2>
    <div class="col-lg-12 col-sm-12">
        <div class="row">
            <c:forEach items="${categories}" var="c">
                <c:url value="/categories/${c.id}/products" var="cUrl"/>
                <div class="card col-lg-2 col-sm-4">
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