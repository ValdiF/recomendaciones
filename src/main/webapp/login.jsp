<%--
  Created by IntelliJ IDEA.
  User: Campus FP
  Date: 23/11/2022
  Time: 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>
  <form action="ControlUserServlet" method="post">
    <label>Usuario</label>
    <input type="text" name="usuario">
    <label >Contraseña</label>
    <input type="password" name="psw">
    <input type="submit" value="Enviar">
  </form>
</body>
</html>
