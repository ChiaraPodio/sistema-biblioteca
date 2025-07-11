/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author 54349
 */
public class Lector extends Persona {

    private LocalDate fechaRegistro;

    public Lector(String nombre, String apellido, int celular, String email) {
        super(nombre, apellido, celular, email);
        setFechaRegistro(fechaRegistro);
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = LocalDate.now();
    }

   

}

