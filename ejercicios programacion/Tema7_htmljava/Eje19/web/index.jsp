<%-- 
    Crea el juego “Apuesta y gana”. El usuario debe introducir inicialmente una cantidad de
dinero. A continuación aparecerá por pantalla una imagen de forma aleatoria. Si sale una
calavera, el usuario pierde todo su dinero y termina el juego. Si sale medio limón, el usuario
pierde la mitad del dinero y puede seguir jugando con esa cantidad o puede dejar de jugar.
Si sale el gato chino de la suerte, el usuario multiplica por dos su dinero y puede seguir
jugando con esa cantidad o puede dejar de jugar.
    Author     : zombie_wolf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 19</title>
    </head>
    <body>
        <form method="post" action="game.jsp">
          Introduzca el dinero:<br/>
          <input type="text" name="x">$<br/>
          
          <input type="submit" value="OK">
        </form>
    </body>
</html>
