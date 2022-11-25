package hito.recomendaciones.model;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "usuario")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LOGIN", nullable = false, length = 12)
    private String id;

    @Column(name = "PSW", length = 40)
    private String psw;

    @OneToMany(mappedBy = "login")
    private Set<Videojuego> videojuegos = new LinkedHashSet<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public Set<Videojuego> getVideojuegos() {
        return videojuegos;
    }

    public void setVideojuegos(Set<Videojuego> videojuegos) {
        this.videojuegos = videojuegos;
    }

}