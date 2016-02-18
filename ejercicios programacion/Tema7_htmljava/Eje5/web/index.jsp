<%-- 
   Eje 7 Combina las dos aplicaciones anteriores en una sola de tal forma que en la página principal
se pueda elegir pasar de euros a pesetas o de pesetas a euros. Adorna la página con alguna
foto o dibujo.
    Author     : zombie_wolf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 7</title>
    </head>
    <body>
        <form method="post" action="conversion.jsp">
          Introduzca el dinero:<br/>
          <input type="text" name="money"><br/>
          Introduzca a que desea cambiar</br>
          <select name="moneda">
              <option value="peseta">Pesetas</option>
              <option value="euro">Euros</option>
          </select>
          <input type="submit" value="OK">
        </form>
    </body>
</html>
