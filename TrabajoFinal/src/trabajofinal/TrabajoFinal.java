/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajofinal;

import biblioteca.*;
import entornografico.empleados.VentanaPrincipal;
import logica.*;
/**
 *
 * @author 54349
 */
public class TrabajoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
        Empleado empleado1 = new Empleado("chiarapodio", "123456", "Encargado", "Chiara", "Podio", 123456, "kikipodio@gmail.com");
        Empleado empleado2 = new Empleado("marcosrodriguez", "123456", "Ayudante", "Marcos", "Rodríguez", 789101, "rodriguezmar@gmail.com");
        
        GestionEmpleados.agregarEmpleado(empleado1);
        GestionEmpleados.agregarEmpleado(empleado2);
        
        Libro libro1 = new Libro("Ficciones", "Jorge Luis Borges", 1944, 7, Genero.NOVELA);
        Libro libro2 = new Libro("Historias de Diván", "Gabriel Rolón", 2007, 9, Genero.PSICOLOGIA);
        Libro libro3 = new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", 1997, 12, Genero.FANTASIA);
        Libro libro4 = new Libro ("Hábitos Atómicos", "James Clear", 2018, 5, Genero.PSICOLOGIA);
        Libro libro5 = new Libro ("Pasión y traición", "Florencia Canale", 2018, 5, Genero.HISTORIA);
        Libro libro6 = new Libro ("Rayuela", "Julio Cortázar", 1963, 7, Genero.NOVELA);
        Libro libro7 = new Libro ("Orgullo y prejuicio", "Jane Austen", 1813, 8, Genero.NOVELA);
        Libro libro8 = new Libro ("El Resplandor", "Stephen King", 1977, 5, Genero.TERROR);
        Libro libro9 = new Libro ("El capital del silo XXI", "Thomas Piketty", 2013, 3, Genero.ECONOMIA);
        Libro libro10 = new Libro ("El origen de las especies", "Charles Darwin", 1859, 7, Genero.CIENCIASNATURALES);
        
        
        GestionLibros.agregarLibro(libro1); 
        GestionLibros.agregarLibro(libro2); 
        GestionLibros.agregarLibro(libro3); 
        GestionLibros.agregarLibro(libro4); 
        GestionLibros.agregarLibro(libro5);
        GestionLibros.agregarLibro(libro6);
        GestionLibros.agregarLibro(libro7); 
        GestionLibros.agregarLibro(libro8);
        GestionLibros.agregarLibro(libro9);
        GestionLibros.agregarLibro(libro10);
        
        Lector lector1 = new Lector("José", "Fernández", 777777, "josefern@gmail.com");
        Lector lector2 = new Lector("Roberto", "López", 111111, "roberlop@gmail.com");
        Lector lector3 = new Lector("Lucas", "Santos", 333333, "santoslucas@gmail.com");
        Lector lector4 = new Lector("Juan", "Pérez", 375849, "juanperez@gmail.com");
        Lector lector5 = new Lector("Ricardo", "Sosa", 89949, "sosaricardo@gmail.com");
        
        GestionLectores.agregarLector(lector1);
        GestionLectores.agregarLector(lector2);
        GestionLectores.agregarLector(lector3);
        GestionLectores.agregarLector(lector4);
        GestionLectores.agregarLector(lector5);
        
        
        GestionPrestamos.agregarPrestamo(lector1, libro3);
        GestionPrestamos.agregarPrestamo(lector1, libro6);
        GestionPrestamos.agregarPrestamo(lector2, libro1);
        GestionPrestamos.agregarPrestamo(lector3, libro5);
        GestionPrestamos.agregarPrestamo(lector4, libro2);
        GestionPrestamos.agregarPrestamo(lector4, libro4);
        GestionPrestamos.agregarPrestamo(lector5, libro9);
        GestionPrestamos.agregarPrestamo(lector5, libro10);
        GestionPrestamos.agregarPrestamo(lector5, libro8);
        
       
    }   
    
    
}
