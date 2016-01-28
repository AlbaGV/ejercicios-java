<%-- 
    Ejercicio 4 Realiza una aplicación que calcule la media de tres notas.
    Author     : zombie_wolf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 4</title>
    </head>
    <body>
        <form method="post" action="media.jsp">
          Introduzca notas:<br/>
          <input type="text" name="nota1"><br/>
          <input type="text" name="nota2"><br/>
          <input type="text" name="nota3"><br/>
          <input type="submit" value="OK">
        </form>
    </body>
</html>
