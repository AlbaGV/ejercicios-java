

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>juego</title>
    </head>
    <body>
        <%
            String[] cara = {"calavera.png", "mediolimon.jpg", "gatochinosuerte.gif"};
            double x= Double.parseDouble(request.getParameter("x"));
            int num=(int)(Math.random()*3);
            out.println("Te ha salido: ");
            out.println("<img src=\"" + cara[num] +"\">");
            
            out.print("Por lo cual te quedan ");
            if(num==0){
               
                out.println("0 $ has perdido el juego");
        %>
            <form method="post" action="index.jsp">
                Pulse para empezar de nuevo:<br/>


                <input type="submit" value="OK">
            </form>
        <%        
            }else if(num==1){
                x /=2;
               out.println("Te quedan: "+x+" $"); 
            
        %>
            <form method="post" action="game.jsp">
         
                <input type="hidden" name="x">
                <input type="submit" value="Continuar">
            </form>
            <form method="post" action="end.jsp">
         
                <input type="hidden" name="x">
                <input type="submit" value="Dejar">
            </form>
        <%
          }else if(num==2){
            x *=2;
            out.println("Te quedan: "+x+" $"); 
 
        %>
           
            <form method="post" action="game.jsp">
         
                <input type="hidden" name="x">
                <input type="submit" value="Continuar">
            </form>
            <form method="post" action="end.jsp">
         
                <input type="hidden" name="x">
                <input type="submit" value="Dejar">
            </form> 
        <%
            
        %>
            }
    </body>
</html>
