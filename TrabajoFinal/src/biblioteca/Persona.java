/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author 54349
 */
public class Persona {

    protected static int id = 0;
    protected int identificador;
    protected String nombre;
    protected String apellido;
    protected int celular;
    protected String email;

    public Persona(String nombre, String apellido, int celular, String email) {
        setId();
        this.setIdentificador();
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setCelular(celular);
        this.setEmail(email);
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

