package com.sergisvk.tema8.Ejercicio2;

public class Asignatura {

    private String nombre;
    private int codigo;
    private String curso;

    public Asignatura(String nombre, int codigo,String curso){
        this.nombre = nombre;
        this.codigo = codigo;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCurso() {
        return curso;
    }
}
