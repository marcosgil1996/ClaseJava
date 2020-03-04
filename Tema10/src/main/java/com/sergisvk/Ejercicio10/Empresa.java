package com.sergisvk.Ejercicio10;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Empresa {

    private ArrayList<Empleado> empleados;

    public Empresa(int numEmpleados) {
        this.empleados = new ArrayList<>(numEmpleados);
    }
    public Empresa(){
        this.empleados =new ArrayList<>();
    }

    public boolean addEmpleado(String nombre, String apellidos, String fechaNacimiento, GregorianCalendar dni, float sueldo, boolean tieneHijos){
        if (isEmpleado(dni)){
          return false;
        }else {
            empleados.add(new Empleado(dni,nombre,apellidos,fechaNacimiento,sueldo,tieneHijos));
            return true;
        }
    }


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
