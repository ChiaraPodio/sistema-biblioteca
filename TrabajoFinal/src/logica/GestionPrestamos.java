/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import biblioteca.Lector;
import biblioteca.Libro;
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
public class GestionPrestamos {

    private static List<Prestamo> listaPrestamos = new ArrayList<>();

    public static int agregarPrestamo(Lector lector, Libro libro) {

        if (libro.getCantidadDisponible() > 0) {
            Prestamo prestamo = new Prestamo(lector, libro);
            listaPrestamos.add(prestamo);
            libro.setCantidadDisponible(libro.getCantidadDisponible() - 1);
            return prestamo.getIdentificador();
        } else {
          //  System.out.println("No hay unidades dispoinibles del libro");
          return 0;
        }
    }

    public static boolean registrarDevolucion(int id) {
        for (Prestamo pasoPrestamo : listaPrestamos) {
            if (pasoPrestamo.getIdentificador() == id) {
                pasoPrestamo.setFechaDevolucion(LocalDate.now());
                pasoPrestamo.getLibro().setCantidadDisponible(pasoPrestamo.getLibro().getCantidadDisponible() + 1);
                return true;
            }
        }
        return false;
    }

    public static void mostrarPrestamosDeLibrosNoDevueltos(DefaultTableModel modeloTabla) {
         modeloTabla.setRowCount(0);
        for (Prestamo pasoPrestamos : listaPrestamos) {
            if (pasoPrestamos.getFechaDevolucion().isAfter(LocalDate.now())) {
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
               // System.out.println(String.format("ID Préstamo: %d, ID Lector: %d, Apellido Lector: %s, ID Libro: %d, Tìtulo Libro: %S, Fecha Préstamo: %s ",
               //         pasoPrestamos.getIdentificador(), pasoPrestamos.getLector().getIdentificador(), pasoPrestamos.getLector().getApellido(),pasoPrestamos.getLibro().getIdentificador(), pasoPrestamos.getLibro().getTitulo(), pasoPrestamos.getFechaPrestamo().format(formato)));
            modeloTabla.addRow(new Object[]{pasoPrestamos.getIdentificador(), pasoPrestamos.getLector().getIdentificador(), pasoPrestamos.getLector().getApellido(),pasoPrestamos.getLibro().getIdentificador(), pasoPrestamos.getLibro().getTitulo(), pasoPrestamos.getFechaPrestamo().format(formato)});
            }
        }
    }

    public static List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public static void setListaPrestamos(List<Prestamo> listaPrestamos) {
        GestionPrestamos.listaPrestamos = listaPrestamos;
    }

}
