package hito.recomendaciones.servlets;

import hito.recomendaciones.logica.LogicaDB;
import hito.recomendaciones.model.Usuario;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.Date;
import java.util.List;

@WebServlet(name = "ControlInsertServlet", value = "/ControlInsertServlet")
public class ControlInsertServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ControlInsertServlet() {
        super();

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sesion= request.getSession();
        String usuario = (String) sesion.getAttribute("usuario");

        String nombre = request.getParameter("titulo");
        String url = request.getParameter("url");
        String fecha = request.getParameter("fecha");
        String recomendacion = request.getParameter("recomendacion");

        LogicaDB logica = new LogicaDB();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
