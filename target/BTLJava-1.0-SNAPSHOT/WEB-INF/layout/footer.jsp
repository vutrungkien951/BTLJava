<%-- 
    Document   : footer
    Created on : 11 Aug 2022, 07:21:14
    Author     : kien
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<footer class="footer">
    <div class="container">
        <div class="row">
            <div class="footer-col">
                <img class="img-fluid" src="<c:url value="/images/Loan.png"/>" alt="Logo Loan" >
            </div>

            <div class="footer-col">
                <h4>LOAN</h4>
                <ul>
                    <li><a href="#"><fmt:message key="label.footer.aboutUs" /></a></li>
                    <li><a href="#"><fmt:message key="label.footer.ourServices" /></a></li>
                    <li><a href="#"><fmt:message key="label.footer.privacyPolicy" /></a></li>
                    <li><a href="#"><fmt:message key="label.footer.faq" /></a></li>
                </ul>
            </div>

            <div class="footer-col">
                <h4><fmt:message key="label.footer.contactUs" /></h4>
                <div class="social-links">
                    <a href="#"><i class="fab fa-facebook-f"></i></a>
                    <a href="#"><i class="fab fa-twitter"></i></a>
                    <a href="#"><i class="fab fa-instagram"></i></a>
                    <a href="#"><i class="fab fa-linkedin-in"></i></a>
                </div>
            </div>
        </div>
    </div>
</footer>