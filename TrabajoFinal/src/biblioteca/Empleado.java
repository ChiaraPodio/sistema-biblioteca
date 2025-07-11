/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author 54349
 */
public class Empleado extends Persona {

    private String usuario;
    private String contrasenia;
    private String cargo;

    public Empleado(String usuario, String contrasenia, String cargo, String nombre, String apellido, int celular, String email) {
        super(nombre, apellido, celular, email);
        this.setUsuario(usuario);
        this.setContrasenia(contrasenia);
        this.setCargo(cargo);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}

