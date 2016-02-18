<%-- 
    Document   : end
    Created on : 01-feb-2016, 20:40:36
    Author     : zombie_wolf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Final</title>
    </head>
    <body>
        <h1>Te has quedado con:</h1><br>
        <%
            out.print(request.getParameter("x")+" $");
        %>    
    </body>
</html>
