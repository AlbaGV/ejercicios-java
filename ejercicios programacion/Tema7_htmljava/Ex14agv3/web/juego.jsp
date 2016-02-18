<%-- 
    
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Juego</title>
    </head>
    <body>
        <%  
            String[] rasca = {"rasca1.jpg", "rasca2.jpg", "rasca3.jpg", "rasca4.jpg", "rasca5.jpg", "rasca6.jpg"};
            
            int num =   (int)(Math.random()*6);
            int num2 = Integer.parseInt(request.getParameter("numero"));
            
            out.println("<img src=\"" + rasca[num] +"\">");
            
            if((num+1)==num2){
                %>
                     <form method="post" action="win.jsp">
         
                
                        <input type="submit" value="Continuar">
                     </form>
                <%
            }else{
                %>
                    <form method="post" action="lose.jsp">
         
                
                        <input type="submit" value="Continuar">
                    </form> 
                <%
            }

                
               
        %> 
    </body>
</html>
