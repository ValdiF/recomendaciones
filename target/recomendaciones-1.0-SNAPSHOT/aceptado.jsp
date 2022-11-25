<%@ page import="hito.recomendaciones.logica.LogicaDB" %>
<%@ page import="hito.recomendaciones.model.Videojuego" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Campus FP
  Date: 23/11/2022
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Usuario</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<%
    String user= request.getParameter("usuario");
%>

    <h1>Bienvenido, <%= user%></h1>
    <div class="container">
        <h2>Realiza una acción</h2>
        <a href="nuevaRecomendacion.jsp">
            <button type="button" class="btn btn-info">Añadir una recomendación</button>
        </a>
        <a href="login.jsp">
            <button type="button" class="btn btn-primary">Cerrar sesión</button>
        </a>
    </div>

    <div class="py-5">
        <div class="container">
            <div class="row hidden-md-up">
                <%

                    LogicaDB logica = new LogicaDB();
                    List<Videojuego> videojuegos = logica.VideojuegosUser(user);

                    for (Videojuego v : videojuegos) { %>
                <div class="col-md-4">
                    <div class="card">
                        <img src="<%=v.getPortada()%>" class="card-img-top" alt="Portada" width="200rem">
                        <div class="card-block">
                            <h4 class="card-title"><%=v.getNombrevideojuego()%>
                            </h4>
                            <h6 class="card-subtitle text-muted"><%=v.getLogin().getId().toUpperCase().charAt(0) + v.getLogin().getId().substring(1, v.getLogin().getId().length()).toLowerCase()%>
                            </h6>
                            <p class="card-text p-y-1"><%=v.getRecomendacion()%>
                                </br>
                                <%=v.getFechaestreno()%>
                            </p>
                            <a href="#" class="card-link">link</a>

                        </div>

                    </div>
                </div>
                <% } %>
            </div>
        </div>
    </div>
</body>
</html>
