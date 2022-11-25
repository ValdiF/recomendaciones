<%@ page import="hito.recomendaciones.model.Videojuego" %>
<%@ page import="java.util.List" %>
<%@ page import="hito.recomendaciones.logica.LogicaDB" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Index</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>


<div class="container">
    <h2>Realiza una acción</h2>
    <a href="registro.jsp">
        <button type="button" class="btn btn-info">Registrarse</button>
    </a>
    <a href="login.jsp">
        <button type="button" class="btn btn-primary">Login</button>
    </a>
</div>

<div class="py-5">
    <div class="container">
        <div class="row hidden-md-up">
            <%

                LogicaDB logica = new LogicaDB();
                List<Videojuego> videojuegos = logica.todosLosVideojuegos();

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