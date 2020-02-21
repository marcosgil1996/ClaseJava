package com.sergisvk.tema9.Ejercicio5;

public class Alumnos {
    private String nom;
    private int edad;
    private float estatura;

    public Alumnos(String nom, int edad, float estatura) {
        this.nom = nom;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String getNom() {
        return nom;
    }

    public int getEdad() {
        return edad;
    }

    public float getEstatura() {
        return estatura;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nom='" + nom + '\'' +
                ", edad=" + edad +
                ", estatura=" + estatura +
                '}';
    }
}

