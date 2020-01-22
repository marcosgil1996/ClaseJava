package com.sergisvk.tema8.Ejercicio7;

import java.util.GregorianCalendar;

public class Ejercicio7 {
    private String Nombre;
    private int edad;
    private String sintomologia;
    private long sip;
    private GregorianCalendar fechaFabricacion;
    private boolean sexo;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSintomologia() {
        return sintomologia;
    }

    public void setSintomologia(String sintomologia) {
        this.sintomologia = sintomologia;
    }

    public long getSip() {
        return sip;
    }

    public void setSip(long sip) {
        this.sip = sip;
    }

    public GregorianCalendar getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(GregorianCalendar fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }


}
