package com.sergisvk.tema8.Ejercicio7;

import java.util.Calendar;

public class Paciente {
    private long sip; //tarjeta saniataria
    private int edad;
    private String nombre;

    public Paciente(long sip, int edad, String nombre, String sintomatologia, boolean sexo, Calendar fechaYHoraEntrada) {
        this.sip = sip;
        this.edad = edad;
        this.nombre = nombre;
        this.sintomatologia = sintomatologia;
        this.sexo = sexo;
        this.fechaYHoraEntrada = fechaYHoraEntrada;
    }

    private String sintomatologia;

    private boolean sexo;

    public Calendar getFechaYHoraEntrada() {
        return fechaYHoraEntrada;
    }

    public void setFechaYHoraEntrada(Calendar fechaYHoraEntrada) {
        this.fechaYHoraEntrada = fechaYHoraEntrada;
    }

    private Calendar fechaYHoraEntrada;

    public long getSip() {
        return sip;
    }

    public void setSip(long sip) {
        this.sip = sip;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSintomatologia() {
        return sintomatologia;
    }

    public void setSintomatologia(String sintomatologia) {
        this.sintomatologia = sintomatologia;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "sip=" + sip +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", sintomatologia='" + sintomatologia + '\'' +
                ", fechaYHoraEntrada=" + fechaYHoraEntrada +
                '}';
    }


}
