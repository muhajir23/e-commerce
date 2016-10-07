<%-- 
    Document   : main
    Created on : Oct 4, 2016, 5:15:18 AM
    Author     : cyber23
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            RequestDispatcher rd = request.getRequestDispatcher("/menupakaian");
            rd.forward(request, response);
        %>
    </body>
</html>
