package com.sergisvk.Ejercicio10;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa(int numeroEmpleados) {
        this.empleados = new ArrayList<>(numeroEmpleados);
    }
    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    /**
     * Permite añadir un nuevo empleado a la empresa
     * @param dni
     * @param nombre
     * @param apellidos
     * @param fechaNac
     * @param sueldo
     * @param haveHijo
     * @return
     */
    public boolean addEmpleado(String dni, String nombre, String apellidos, GregorianCalendar fechaNac, float sueldo, boolean haveHijo){
        if(isEmpleado(dni)){
            return false;
        } else {
            empleados.add(new Empleado(dni, nombre, apellidos, fechaNac, sueldo, haveHijo));
            return true;
        }
    }

    /**
     * Permite eliminar un empleado d
     * @param dni
     * @return
     */
    public boolean removeEmpleado(String dni){
        if(isEmpleado(dni)){
            empleados.remove(buscarEmpleado(dni));
            return true;
        }
        return false;
    }
    public boolean removeHijoEmpleado(String dni, String nombre){
        if(isEmpleado(dni)){
            buscarEmpleado(dni).removeHijo(nombre);
            return true;
        }
        return false;
    }

    public Empleado buscarEmpleado(String dni){
        for(int i = 0 ; i < empleados.size() ; i++){
            if (empleados.get(i).getDni().toLowerCase().equals(dni.toLowerCase())){
                return empleados.get(i);
            }
        }
        return null;
    }
    public boolean isEmpleado(String dni){
        for(int i = 0 ; i < empleados.size() ; i++){
            if (empleados.get(i).getDni().toLowerCase().equals(dni.toLowerCase())){
                return true;
            }
        }
        return false;
    }

    public boolean modificarSueldo(String dni, float sueldo){
        if(isEmpleado(dni)){
            buscarEmpleado(dni).setSueldo(sueldo);
            return true;
        }
        return false;
    }
}
