package com.sergisvk.Ejercicio10;

import java.util.ArrayList;

public class Busquedas {
    private ArrayList<Empleado> empleados;

    public Busquedas(){
        empleados = new ArrayList<>(100);
    }

    /**
     *
     * @param nif
     * @return
     */
    public String buscarPorNif(String nif){

        for (Empleado empleado : empleados) {
            if (nif.equals(empleado.getDni())) {
                return empleado.toString();
            }

        }
        return "error";
    }

    /**
     *
     * @param max con la mayor edad
     * @param min con la menor edad
     * @return
     */
    public String buscarRangoEdad(int max, int min){
        boolean encontrado = false;
        StringBuilder string = new StringBuilder();
        string.append(String.format("%-15s %-15s %-12s %-16s %-12s \n","Nombre","Apellido","DNI","Fecha Nacimiento", "Sueldo"));

        for (Empleado empleado : empleados) {
            if (empleado.getEdad() <= max && empleado.getEdad() >= min) {
                string.append(empleado.toString());
                encontrado = true;
            }
        }
        if (encontrado){
            return string.toString();
        }else{
            return "Error";
        }
    }
}
