<%-- 
    Document   : conversion
    
    Author     : zombie_wolf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>conversion</title>
    </head>
    <body>
        <%
            String linea= request.getParameter("moneda");
            double x= Double.parseDouble(request.getParameter("money"));
            double total;
            if(linea.equals("peseta")){
                total= x*166.386;
                
             
                out.println("Tienes "+total+" pesetas");
        %> 
            <img src="100Pesetas.jpg">
        <%   }else{
               total= x/166.386;
                
               
               out.println("Tienes "+total+" euros"); 
        %>
            <img src="500euros.jpg">
        <%     }  
            
            
            
            %>
            
            
    </body>
</html>
