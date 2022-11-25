package hito.recomendaciones.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "videojuego")
@NamedQuery(name="Videojuego.findAll", query="SELECT v FROM Videojuego v")
public class Videojuego {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDVIDEOJUEGO", nullable = false)
    private Integer id;

    @Column(name = "NOMBREVIDEOJUEGO", length = 100)
    private String nombrevideojuego;

    @Column(name = "FECHAESTRENO")
    private LocalDate fechaestreno;

    @Column(name = "PORTADA", length = 1000)
    private String portada;

    @Column(name = "RECOMENDACION", length = 300)
    private String recomendacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LOGIN")
    private Usuario login;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombrevideojuego() {
        return nombrevideojuego;
    }

    public void setNombrevideojuego(String nombrevideojuego) {
        this.nombrevideojuego = nombrevideojuego;
    }

    public LocalDate getFechaestreno() {
        return fechaestreno;
    }

    public void setFechaestreno(LocalDate fechaestreno) {
        this.fechaestreno = fechaestreno;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }

    public Usuario getLogin() {
        return login;
    }

    public void setLogin(Usuario login) {
        this.login = login;
    }

}