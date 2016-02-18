<%-- 
    Document   : final
    Created on : 02-feb-2016, 9:09:58
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
        <%
            String linea= request.getParameter("jugada");
            String[] cpu = {"piedra.png", "papel.png", "tijera.png"};
            int [] cpu2 = {1, 2, 3};
            int var=0;
            int num =   (int)(Math.random()*3);
           
            out.print("Jugador: ");
            if(linea.equals("piedra")){
                var=1;
                out.println("<img src=\"" + cpu[0] +"\"><br>");
            }else if(linea.equals("papel")){
                var=2;
                out.println("<img src=\"" + cpu[1] +"\"><br>");
            }else if(linea.equals("tijera")){
                var=3;
                out.println("<img src=\"" + cpu[2] +"\"><br>");
            } 
            
            out.print("Ordenador: ");
            out.println("<img src=\"" + cpu[num] +"\">");
            
            if(cpu2[num]==var){
                out.print("<h1>Es Empate!!</h1>");
                
                
            }else if(cpu2[num]==1 && var==3){
                out.print("<h1>Gana ordenador!!</h1>");
                
                
            }else if(cpu2[num]==1 && var==2){
                out.print("<h1>Gana jugador!!</h1>");
                
                
            }else if(cpu2[num]==2 && var==1){
                out.print("<h1>Gana ordenador!!</h1>");
                
                
            }else if(cpu2[num]==2 && var==3){
                out.print("<h1>Gana jugador!!</h1>");
                
                
            }else if(cpu2[num]==3 && var==1){
                out.print("<h1>Gana jugador!!</h1>");
                
                
            }else if(cpu2[num]==3 && var==2){
                out.print("<h1>Gana ordenador!!</h1>");
                
                
            }
            

            
            
        %>    
    </body>
</html>
