<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="Food sale" />
        <meta name="author" content="VuTrungKien" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="<c:url value="/css/styles.css" />" rel="stylesheet" />
        <!-- Core theme JS-->
        <script src="<c:url value="/js/scripts.js" />"></script>
        <!--Icon-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@6.1.2/css/fontawesome.min.css" integrity="sha384-X8QTME3FCg1DLb58++lPvsjbQoCT9bp3MsUU3grbIny/3ZwUJkRNO8NPW6zqzuW9" crossorigin="anonymous">
        <link rel="icon" type="image/x-icon" href="<c:url value="/images/Loan.ico" />" />
        <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
        <link rel="stylesheet" href="<c:url value="/css/index.css" />">
    </head>
    <body>
        <tiles:insertAttribute name="header" />
        <tiles:insertAttribute name="content" />
        <tiles:insertAttribute name="footer" />
    </body>
</html>