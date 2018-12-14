<%@page contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>

    <head></head>
    <body>
        HelloWorld!<br/>
        ${requestScope.user}
        <fmt:formatDate value="${requestScope.user.registerDate}"/>
    </body>
</html>