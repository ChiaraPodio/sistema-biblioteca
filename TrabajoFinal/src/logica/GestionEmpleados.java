/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import biblioteca.Empleado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 54349
 */
public class GestionEmpleados {

    private static List<Empleado> listaEmpleados = new ArrayList<>();

    public static boolean iniciarSesion(String usuario, String contrasenia) {
        for (Empleado pasoEmpleado : listaEmpleados) {
            if (pasoEmpleado.getUsuario().equals(usuario) && pasoEmpleado.getContrasenia().equals(contrasenia)) {
                return true;
            }
        }
        return false;
    }

    public static void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

    public static boolean borrarEmpleado(String usuario, String contrasenia) {
        for (Empleado pasoEmpleado : listaEmpleados) {
            if ((pasoEmpleado.getUsuario().equals(usuario)) && (pasoEmpleado.getContrasenia().equals(contrasenia))) {
                listaEmpleados.remove(pasoEmpleado);
                return true;
            }
        }
        return false;
    }

    public static List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public static void setListaEmpleados(List<Empleado> listaEmpleados) {
        GestionEmpleados.listaEmpleados = listaEmpleados;
    }

}
