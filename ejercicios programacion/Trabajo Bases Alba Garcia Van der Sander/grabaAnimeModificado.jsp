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
    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/myanimelist","root", "root");
      Statement s = conexion.createStatement();

      request.setCharacterEncoding("UTF-8");
      
      String actualizacion = "UPDATE anime SET "
                           + "nombre='" + request.getParameter("nombre")
                           + "', capitulo=" + Integer.valueOf(request.getParameter("capitulo"))
                           + ", nota=" + Integer.valueOf(request.getParameter("nota"))
                           + ", estado='" + request.getParameter("estado")
                           + "', tipo='" + request.getParameter("tipo")
                           + "' WHERE Idanime=" + Integer.valueOf(request.getParameter("Idanime"));
      s.execute(actualizacion);
     
      out.println("Anime actualizado correctamente.");
      
      conexion.close();
    %>
    <br>
    <a href="index.jsp" class="btn btn-primary"><span class="glyphicon glyphicon-home"></span> Página principal</button>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>