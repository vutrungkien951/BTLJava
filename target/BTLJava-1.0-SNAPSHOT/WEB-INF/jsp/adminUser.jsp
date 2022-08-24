<%-- 
    Document   : adminUser
    Created on : 23 Aug 2022, 19:59:55
    Author     : kien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title><fmt:message key="admin.user.title" /></title>
<div class="container">
    <h1 class="text-center"><fmt:message key="admin.userList" /></h1>
    <table class="table table-bordered">
        <thead>
            <tr>
                <th>ID</th>
                <th>Email</th>
                <th>Address</th>
                <th>Phone number</th>
                <th></th>
            </tr>
        </thead>
        <tbody id="storeOwnerUsers">
            
        </tbody>
    </table>
</div>
<script src="<c:url value="/js/users.js" />"></script>
<script>
    <c:url value="/api/store-owner" var="endpoint" />

    window.onload = function () {
        loadStoreOwnerUser('${endpoint}');
    }
</script>