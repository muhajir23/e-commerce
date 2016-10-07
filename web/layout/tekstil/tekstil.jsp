<%-- 
    Document   : tekstil
    Created on : Oct 4, 2016, 5:12:36 AM
    Author     : cyber23
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../../bootstrap/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="../../bootstrap/navbarsubmenu.css"/>
        <script src="../../bootstrap/jquery.js"></script>
        <script src="../../bootstrap/js/bootstrap.min.js"></script>
        
        <script language='javascript'>
            function validAngka(a)
            {
                if (!/^[0-9.]+$/.test(a.value))
                {
                    a.value = a.value.substring(0, a.value.length - 1000);
                }
            }
        </script>
        
    </head>
    <body>
        <jsp:include page="../../parts-web/umum/navbar.html"/>
        <% String crud = request.getParameter("crud");
        if (crud == null){ %>
            <jsp:include page="../../parts-web/tekstil/midMain.jsp"/>            
        <% } else if (crud.equalsIgnoreCase("update")){ 
            %><jsp:include page="../../parts-web/tekstil/midUpdate.jsp"/><%            
        }%>
    </body>
</html>
