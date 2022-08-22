<%-- 
    Document   : signup
    Created on : 18 Aug 2022, 16:43:50
    Author     : kien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<title><fmt:message key="label.signup" /></title>
<div class="container">
    <h1 class="text-center text-danger"><fmt:message key="label.signup" /></h1>
    <c:url value="/signup" var="action"/>

    <fmt:message key='signup.email.placeHolder' var="email"/>
    <fmt:message key='signup.password.placeHolder' var="userPassword"/>
    <fmt:message key='signup.phone.placeHolder' var="phone"/>
    <fmt:message key='signup.address.placeHolder' var="address"/>

    <form:form action="${action}" 
               method="POST"
               modelAttribute="user"
               enctype="multipart/form-data">
        <form:errors path="*" elements="div class='alert alert-danger'"/>
        <div class="mb-3 mt-3">
            <label for="email" class="form-label"><fmt:message key="signup.email" /></label>
            <form:input type="email" class="form-control" id="email" placeholder="${email}" path="userEmail" />
            <form:errors path="userEmail" cssClass="text-danger" />
        </div>
        <div class="mb-3">
            <label for="pwd" class="form-label"><fmt:message key="signup.password.placeHolder" /></label>
            <form:input type="password" class="form-control" id="password" placeholder="${userPassword}" path="userPassword" />
            <form:errors path="userPassword" cssClass="text-danger" />
        </div>
        <!--phone number, gender-->
        <div class="mb-3 mt-3">
            <label for="phone" class="form-label"><fmt:message key="signup.phone" /></label>
            <form:input type="text" class="form-control" id="phoneNumber" placeholder="${phone}" path="userPhoneNumber" pattern="[0-9]{1,12}"/>
            <form:errors path="userPhoneNumber" cssClass="text-danger" />
        </div>
        <div class="mb-3 mt-3">
            <label for="gender" class="form-label"><fmt:message key="signup.gender" /></label>
            <form:select path="gender" id="gender">
                <form:option value="Nam"><fmt:message key="signup.gender.male" /></form:option>
                <form:option value="Nữ"><fmt:message key="signup.gender.female" /></form:option>
            </form:select>
        </div>
        <div class="mb-3 mt-3">
            <label for="birthday"><fmt:message key="signup.birthDay" /></label>
            <form:input type="date" id="birthday" path="birthDate" />
        </div>
        <div class="mb-3 mt-3">
            <label for="address" class="form-label"><fmt:message key="signup.address" /></label>
            <form:input type="text" class="form-control" id="address" placeholder="${address}" path="userAddress" />
            <form:errors path="userAddress" cssClass="text-danger" />
        </div>
        <div class="mb-3 mt-3">
            <label for="userRole" class="form-label"><fmt:message key="signup.userRole" /></label>
            <form:select path="userRole" id="userRole">
                <option value="USER"><fmt:message key="signup.userRole.user" /></option>
                <option value="STORE_OWNER"><fmt:message key="signup.userRole.storeOwner" /></option>
            </form:select>
        </div>
        <div class="mb-3 mt-3">
            <label for="avatar" class="form-label"><fmt:message key="signup.image" /></label>
            <form:input type="file" class="form-control" id="userImage" path="img" />
        </div>
        <button type="submit" class="btn btn-primary"><fmt:message key="label.signup" /></button>
    </form:form>  
</div>
