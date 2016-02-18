<%-- 
  
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Media</title>
    </head>
    <body>
       Tu nota es:
       <% 
           double x= Double.parseDouble(request.getParameter("nota1"));
           double y= Double.parseDouble(request.getParameter("nota2"));
           double z= Double.parseDouble(request.getParameter("nota3"));
           double notafinal= (x+y+z)/3;    
           out.print(notafinal);      
       %>
               
    </body>
</html>
