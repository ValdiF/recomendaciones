package hito.recomendaciones.servlets;

import hito.recomendaciones.logica.LogicaDB;
import hito.recomendaciones.model.Usuario;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ControlUserServlet", value = "/ControlUserServlet")
public class ControlUserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    public ControlUserServlet() {
        super();

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("usuario");
        String psw = request.getParameter("psw");

        HttpSession sesion= request.getSession();
        sesion.setAttribute("usuario", nombre);

        if(nombre==null) {
            nombre="";
            psw="";
        }

        RequestDispatcher rd = null;

        LogicaDB logica = new LogicaDB();
        List<Usuario> usuarios = logica.todosLosUsuarios();
        boolean aceptado= false;

            for (Usuario u : usuarios) {
                if(u.getId().equals(nombre) && u.getPsw().equals(psw)) {

                    aceptado=true;
                }
            }

        if(aceptado){
            rd=request.getRequestDispatcher("aceptado.jsp");
        }else{
            rd=request.getRequestDispatcher("denegado.jsp");
        }

        rd.forward(request, response);

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
