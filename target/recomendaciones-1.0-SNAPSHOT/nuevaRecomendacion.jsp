<%--
  Created by IntelliJ IDEA.
  User: Campus FP
  Date: 25/11/2022
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Añadir recomendaciones</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<% String login= request.getParameter("login");%>

<form action="ControlInsertServlet" method="post">
  <label>Nombre del videojuego</label>
  <input type="text" name="login" value="<%=login%>" disabled>
  <label>Nombre del videojuego</label>
  <input type="text" name="titulo" required>
  <label>URL - imagen</label>
  <input type="text" name="url" required>
  <label>Fecha</label>
  <input type="date" name="fecha" required>
  <label>Recomendación</label>
  <textarea name="recomendacion"  maxlength="300" required></textarea>
  <input type="submit" value="Enviar">
</form>
</body>
</html>
