package hito.recomendaciones.logica;

import com.mysql.cj.xdevapi.Session;
import hito.recomendaciones.model.Usuario;
import hito.recomendaciones.model.Videojuego;
import jakarta.persistence.*;
import org.hibernate.query.SemanticException;

import java.util.List;

public class LogicaDB {
    private EntityManager em;

    // constructores

    public LogicaDB() {
        super();
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("recomendaciones");
        this.em = factory.createEntityManager();
        System.out.println("hemos obtenido el entity mananger");

    }

    public EntityManager getEm() {
        return em;
    }

    public List<Videojuego> todosLosVideojuegos() {

        TypedQuery<Videojuego> query = em.createNamedQuery("Videojuego.findAll", Videojuego.class);

        return query.getResultList();

    }

    public List<Usuario> todosLosUsuarios() {

        TypedQuery<Usuario> query = em.createNamedQuery("Usuario.findAll", Usuario.class);

        return query.getResultList();

    }

    public List<Videojuego> VideojuegosUser(String id) {
        List<Videojuego> videojuegos = null;
        try {
            Query query = em.createNativeQuery("SELECT * FROM VIDEOJUEGO WHERE LOGIN='"+id+"' ", Videojuego.class);

            videojuegos = query.getResultList();
        } catch (SemanticException se) {
            se.getMessage();
        }
        return videojuegos;
    }



}
