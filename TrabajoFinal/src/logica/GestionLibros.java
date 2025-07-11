/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import biblioteca.Libro;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 54349
 */
public class GestionLibros {
    private static List<Libro> listaLibros = new ArrayList<>();
    
    public static void agregarLibro(Libro libro) {
        for (Libro pasoLibro : listaLibros) {
            if (pasoLibro.equals(libro)) {
                libro.setCantidadDisponible(libro.getCantidadDisponible() + 1);
                return;
            }
        }
        listaLibros.add(libro);
    }
    
    public static boolean borrarLibro(int id) {
        for (Libro pasoLibro : listaLibros) {
            if (pasoLibro.getIdentificador()==id) {
                listaLibros.remove(pasoLibro);
                return true;
            }
        }
        return false;
    }
    
    public static void mostrarLibrosDisponibles(DefaultTableModel modeloTabla) {
        modeloTabla.setRowCount(0);
        for (Libro pasoLibro : listaLibros) {
            if (pasoLibro.getCantidadDisponible() > 0) {
              //  System.out.println(String.format("ID: %d, Título: %s, Autor: %s, Año de Publicación: %d, Cantidad Disponible: %d, Género: %s",
              //          pasoLibro.getIdentificador(), pasoLibro.getTitulo(), pasoLibro.getAutor(), pasoLibro.getAnioPublicacion(), pasoLibro.getCantidadDisponible(), pasoLibro.getGenero().name().toLowerCase()));
            modeloTabla.addRow(new Object[]{pasoLibro.getIdentificador(), pasoLibro.getTitulo(), pasoLibro.getAutor(), pasoLibro.getAnioPublicacion(), pasoLibro.getCantidadDisponible(), pasoLibro.getGenero().name().toLowerCase()});

            }
        }
    }
    
     public static Libro buscarLibroPorId(int id) {
        for (Libro pasoLibro : listaLibros) {
            if (pasoLibro.getIdentificador() == id) {
                return pasoLibro;
            }
        }
        return null;
    }
     
      public static List<Libro> getListaLibros() {
        return listaLibros;
    }

    public static void setListaLibros(List<Libro> listaLibros) {
        GestionLibros.listaLibros = listaLibros;
    }
}
