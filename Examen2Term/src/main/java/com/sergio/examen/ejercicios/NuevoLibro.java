package com.sergio.examen.ejercicios;

import java.util.GregorianCalendar;

public class NuevoLibro {
    private String titulo;
    private int ISB;
    private String Autor;
    private GregorianCalendar fechaDeVer;

    public NuevoLibro(String titulo, int ISB, String autor, GregorianCalendar fechaDeVer) {
        this.titulo = titulo;
        this.ISB = ISB;
        Autor = autor;
        this.fechaDeVer = fechaDeVer;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getISB() {
        return ISB;
    }

    public void setISB(int ISB) {
        this.ISB = ISB;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public GregorianCalendar getFechaDeVer() {
        return fechaDeVer;
    }

    public void setFechaDeVer(GregorianCalendar fechaDeVer) {
        this.fechaDeVer = fechaDeVer;
    }

}
