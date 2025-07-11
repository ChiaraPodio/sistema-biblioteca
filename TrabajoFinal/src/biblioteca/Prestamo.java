/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.time.LocalDate;

/**
 *
 * @author 54349
 */
public class Prestamo {

    private static int id = 0;
    private int identificador;
    private Lector lector;
    private Libro libro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(Lector lector, Libro libro) {
        setId();
        this.setIdentificador();
        this.setLector(lector);
        this.setLibro(libro);
        setFechaPrestamo(fechaPrestamo);
        setFechaDevolucion(fechaDevolucion);
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

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = LocalDate.now();
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = LocalDate.now().plusDays(15);
    }

}

