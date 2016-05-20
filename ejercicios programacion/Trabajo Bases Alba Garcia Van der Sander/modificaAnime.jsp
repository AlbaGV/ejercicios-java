<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <!-- Bootstrap -->
      <link href="css/bootstrap.min.css" rel="stylesheet">
      <title>Myanimelist-Alba Garcia Van der Sander</title>
  </head>
  <body>
    <% request.setCharacterEncoding("UTF-8"); %>
    <div class="container">
      <br><br>
      <div class="panel panel-info">
        <div class="panel-heading text-center">Modificación de Anime</div>
          <form method="get" action="grabaAnimeModificado.jsp">
            <div class="form-group"> 
              <label>&nbsp;&nbsp;Nº de anime:&nbsp;</label><input type="text" size="5" name="Idanime" value="<%= request.getParameter("Idanime") %>" readonly>
            </div>
            <div class="form-group">
            <label>&nbsp;&nbsp;Nombre:&nbsp;</label><input type="text" size="35" name="nombre" value="<%= request.getParameter("nombre") %>">
            </div>
            <div class="form-group">
             <label>&nbsp;&nbsp;Capitulo:&nbsp;</label><input type="text" size="5" name="capitulo" value="<%= request.getParameter("capitulo") %>">
             <label>&nbsp;&nbsp;Nota:&nbsp;</label><select name="nota" value="<%= request.getParameter("nota") %>">
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
             </select>
            </div>
            <div class="form-group">
             <label>&nbsp;&nbsp;Estado:&nbsp;</label><select name="estado"  value="<%= request.getParameter("estado") %>">
                      <option>Viendo</option>
                      <option>Abandonado</option>
                      <option>Completado</option>
                      <option>Pausado</option>
                      <option>Ver proximamente</option>
             </select>
            </div>
            <div class="form-group">
             <label>&nbsp;&nbsp;Tipo:&nbsp;</label><select name="tipo" value="<%= request.getParameter("tipo") %>">
                      <option>TV</option>
                      <option>Pelicula</option>
                      <option>Especial</option>
                      <option>OVA</option>
                      <option>ONA</option>
             </select>
            </div>
            <hr>
            &nbsp;&nbsp;<a href="index.jsp" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span>Cancelar</a>
            <button type="submit" class="btn btn-success"><span class="glyphicon glyphicon-ok"></span>Aceptar</button><br><br>
          </form>

      </div>
      <div class="text-center">&copy; Alba Garcia Van der Sander</div>
    </div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
