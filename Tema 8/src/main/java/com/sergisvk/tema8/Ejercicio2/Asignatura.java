package com.sergisvk.tema8.Ejercicio2;

public class Asignatura {
    private int codigo;
    private String nombre;
    private int curso;

    public Asignatura(int codigo, String nombre, int curso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.curso = curso;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Asignatura: " + codigo + ". Código: " + codigo + ". Curso: " + curso;
    }
}
