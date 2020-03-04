package com.sergisvk.Ejercicio10;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Empleado {

    private String nombre;
    private String apellidos;
    private GregorianCalendar fechaNacimiento;
    private float sueldo;
    private boolean tieneHijo;
    private ArrayList<Hijo> arrayListHijos;
    private String dni;

    /**
     * En este contructor se guarda toda la información relacionda con el Empleado
     * @param dni DNI/ NIF
     * @param nombre del empleado
     * @param apellidos primer apellido + segundo apellido
     * @param fechaNacimiento apartir de la fecha de nacimiento tambien se puede sacar la edad
     * @param sueldo cuanto va a cobrar el emplado a final de mes
     * @param tieneHijo Si tiene hijo, no tiene y si por errar se añade se elimina
     */
    public Empleado(String dni, String nombre, String apellidos, GregorianCalendar fechaNacimiento, float sueldo, boolean tieneHijo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.sueldo = sueldo;
        this.tieneHijo = tieneHijo;
        this.arrayListHijos = new ArrayList<>();
    }

    public Empleado(GregorianCalendar dni, String nombre, String apellidos, String fechaNacimiento, float sueldo, boolean tieneHijos) {
    }

    /**
     * El setHijo añade al empleado si tiene un hijo además de guardarlo
     * @param numHijo cuantos hijos tiene el empleado
     * @return true sí tiene un hijo además de añadirlo y su no tiene devuelve false
     */
    public boolean setHijo(int numHijo){
        String nombre;
        int edad;
        Scanner lector = new Scanner(System.in);
        for (int i = 0; i < numHijo ; i++) {
            System.out.println("Hijo " +(i+1));
            System.out.println("Nombre:" );
            nombre = lector.nextLine();
            System.out.println("Edad: ");
            edad = lector.nextInt();
            lector.nextLine();

            setTieneHijo(true);
            arrayListHijos.add(new Hijo(nombre, edad));
        }
        return true;
    }

    /**
     * la característica del remove hijo es eliminar los hijos del empleado
     * @param nombre del hijo
     * @return true sí ha eliminado el hijo en poseeión y false sí ha hecho el remove pero no tiene ningúno
     */
    public boolean removeHijo(String nombre){
        for (int i = 0; i < arrayListHijos.size() ; i++) {
            if (arrayListHijos.get(i).getNombre().toLowerCase().equals(nombre.toLowerCase()));
            arrayListHijos.remove(i);
            return true;
        }
        return false;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isTieneHijo() {
        return tieneHijo;
    }

    public void setTieneHijo(boolean tieneHijo) {
        this.tieneHijo = tieneHijo;
    }

    public ArrayList<Hijo> getArrayHijos() {
        return arrayListHijos;
    }

    public void setArrayHijos(ArrayList<Hijo> arrayHijos) {
        this.arrayListHijos = arrayHijos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }


}
