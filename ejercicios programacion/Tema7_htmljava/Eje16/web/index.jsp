<%-- 
    Realiza una aplicación que muestre la tirada aleatoria de tres dados de póker. Utiliza
imágenes de dados reales.
    Author     : zombie_wolf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejecircio 16</title>
    </head>
    <body>
        <%  
            String[] cara = {"cara1.jpg", "cara2.jpg", "cara3.jpg", "cara4.jpg", "cara5.jpg", "cara6.jpg"};
            for(int i=0;i<3;i++){
                
            
                out.print("<img src=\"" + cara[(int)(Math.random()*6)] +"\">");


                
            }    
        %>    
    </body>
</html>
