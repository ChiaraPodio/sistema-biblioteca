/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author 54349
 */
public class Libro {

    private static int id = 0;
    private int identificador;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int cantidadDisponible;
    private Genero genero;

    public Libro(String titulo, String autor, int anioPublicacion, int cantidadDisponible, Genero genero) {
        setId();
        this.setIdentificador();
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setAnioPublicacion(anioPublicacion);
        this.setCantidadDisponible(cantidadDisponible);
        this.setGenero(genero);

    }

    public static void setId() {
        id++;
    }
    
     public int getIdentificador() {
        return identificador;
    }

    private void setIdentificador() {
        this.identificador = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    

}

