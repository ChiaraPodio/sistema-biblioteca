/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import biblioteca.Lector;
import biblioteca.Prestamo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 54349
 */
public class GestionLectores {

    private static List<Lector> listaLectores = new ArrayList<>();

    public static void agregarLector(Lector lector) {
        listaLectores.add(lector);
    }

    public static void mostrarListaLectores(DefaultTableModel modeloTabla) {
        modeloTabla.setRowCount(0);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (Lector pasoLector : listaLectores) {
            //System.out.println(String.format("ID del lector: %d, Nombre: %s %s, cel: %d, email: %s, Fecha de registro: %s", 
            //        pasoLector.getIdentificador(), pasoLector.getNombre(), pasoLector.getApellido(), pasoLector.getCelular(), pasoLector.getEmail(), pasoLector.getFechaRegistro().format(formato)));

            modeloTabla.addRow(new Object[]{pasoLector.getIdentificador(), pasoLector.getNombre(), pasoLector.getApellido(), pasoLector.getCelular(), pasoLector.getEmail(), pasoLector.getFechaRegistro().format(formato)});
        }
    }

    public static void mostrarLibrosPrestadosDelLector(int id, DefaultTableModel modeloTabla) {
        System.out.println(String.format("Los libros pendientes de devolución del lector %s %s son:", GestionLectores.buscarLectorPorId(id).getNombre(), GestionLectores.buscarLectorPorId(id).getApellido()));
        for (Prestamo pasoPrestamo : GestionPrestamos.getListaPrestamos()) {
            if ((pasoPrestamo.getLector().getIdentificador() == id) && (pasoPrestamo.getFechaDevolucion().isAfter(LocalDate.now()))) {
              //  System.out.println(String.format("ID: %d, Título: %s, Autor: %s, Año de Publicación: %d, Cantidad Disponible: %d, Género: %s",
               //         pasoPrestamo.getLibro().getIdentificador(), pasoPrestamo.getLibro().getTitulo(), pasoPrestamo.getLibro().getAutor(), pasoPrestamo.getLibro().getAnioPublicacion(), pasoPrestamo.getLibro().getCantidadDisponible(), pasoPrestamo.getLibro().getGenero().name().toLowerCase()));
            
                modeloTabla.addRow(new Object[]{pasoPrestamo.getIdentificador(),pasoPrestamo.getLibro().getTitulo(), pasoPrestamo.getLibro().getAutor(), pasoPrestamo.getLibro().getAnioPublicacion(), pasoPrestamo.getLibro().getCantidadDisponible(), pasoPrestamo.getLibro().getGenero().name().toLowerCase()});
            }
        }
    }

    public static Lector buscarLectorPorId(int id) {
        for (Lector pasoLector : listaLectores) {
            if (pasoLector.getIdentificador() == id) {
                return pasoLector;
            }
        }
        return null;
    }

    public static List<Lector> getListaLectores() {
        return listaLectores;
    }

    public static void setListaLectores(List<Lector> listaLectores) {
        GestionLectores.listaLectores = listaLectores;
    }

}
