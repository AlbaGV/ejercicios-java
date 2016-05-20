<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <title>Myanimelist - Alba Garcia Van der Sander</title>
  </head>

  <body>
		<div class="container">
			<br><br>			
      <div class="panel panel-primary">
        <div class="panel-heading text-center"><h2>Myanimelist</h2></div>
        <%
          Class.forName("com.mysql.jdbc.Driver");
          Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/myanimelist","root", "root");
          Statement s = conexion.createStatement();

          ResultSet listado = s.executeQuery ("SELECT * FROM anime");
        %>

        <table class="table table-striped">
        <tr><th>Nº de anime</th><th>Nombre</th><th>Capitulo</th><th>Nota</th><th>Estado</th><th>Tipo</th></tr>
        <form method="get" action="grabaAnime.jsp">
          <tr><td><input type="text" name="Idanime" size="5"></td>
              <td><input type="text" name="nombre" size="30"></td>
              <td><input type="text" name="capitulo" size="5"></td>
              <td><select  name="nota">
                      <option>1</option>
                      <option>2</option>
                      <option>3</option>
                      <option>4</option>
                      <option>5</option>
                      <option>6</option>
                      <option>7</option>
                      <option>8</option>
                      <option>9</option>
                      <option>10</option>
              </select></td>
              <td><select name="estado" >
                      <option>Viendo</option>
                      <option>Abandonado</option>
                      <option>Completado</option>
                      <option>Pausado</option>
                      <option>Ver proximamente</option>
       
              </select></</td>
              <td><select  name="tipo">
                      <option>TV</option>
                      <option>Pelicula</option>
                      <option>Especial</option>
                      <option>OVA</option>
                      <option>ONA</option>
       
              </select></</td>
              <td><button type="submit" value="Añadir" class="btn btn-primary"><span class="glyphicon glyphicon-plus"></span> Añadir</button></td><td></td></tr>           
        </form>
        <%
          while (listado.next()) {
            out.println("<tr><td>");
            out.println(listado.getString("Idanime") + "</td>");
            out.println("<td>" + listado.getString("nombre") + "</td>");
            out.println("<td>" + listado.getString("capitulo") + "</td>");
            out.println("<td>" + listado.getString("nota") + "</td>");
            out.println("<td>" + listado.getString("estado") + "</td>");
            out.println("<td>" + listado.getString("tipo") + "</td>");
        %>
        <td>
        <form method="get" action="modificaAnime.jsp">
					<input type="hidden" name="Idanime" value="<%=listado.getString("Idanime") %>">
          <input type="hidden" name="nombre" value="<%=listado.getString("nombre") %>">
          <input type="hidden" name="capitulo" value="<%=listado.getString("capitulo") %>">
          <input type="hidden" name="nota" value="<%=listado.getString("nota") %>">
          <input type="hidden" name="estado" value="<%=listado.getString("estado") %>">
          <input type="hidden" name="tipo" value="<%=listado.getString("tipo") %>">
					<button type="submit"  class="btn btn-info"><span class="glyphicon glyphicon-pencil"></span> Modificar</button>
				</form>
				</td>
				<td>
        <form method="get" action="borraAnime.jsp">
          <input type="hidden" name="Idanime" value="<%=listado.getString("Idanime") %>"/>
          <button type="submit" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span> Eliminar</button>
        </form>
        </td></tr>
        <%
          } // while   

          conexion.close();
        %>

        </table>
      </div>
      <div class="text-center">&copy; Alba Garcia Van der Sander</div>
    </div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>