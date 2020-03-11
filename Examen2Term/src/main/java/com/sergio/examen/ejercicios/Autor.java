package com.sergio.examen.ejercicios;

public class Autor {
    private String nombre;
    private String apellidos;
    private int identificador;

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

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Autor(String nombre, String apellidos, int identificador) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificador = identificador;
    }






}
