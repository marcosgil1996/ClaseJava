package com.sergio.examen.ejercicios;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Libro {
    private String titulo;
    private String autor;
    private int ISBN;
    private GregorianCalendar fechaDeActualizacion;
    private ArrayList<NuevoLibro> nuevoLibros;

    //constructor
    public Libro(GregorianCalendar fechaDeActualizacion, String titulo, String autor, int ISBN,boolean nuevoLibro) {
    }

    /**
     *
     * @param titulo de libro
     * @param autor persona que escribe el libro
     * @param ISBN numero de referencia del libro
     * @param fechaDeActualizacion ultima actualización del libro
     */
    public Libro(String titulo, String autor, int ISBN, GregorianCalendar fechaDeActualizacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.fechaDeActualizacion = fechaDeActualizacion;
        this.nuevoLibros = new ArrayList<>();
    }

    //getters y setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getISBN() {
        return ISBN;
    }

    public void setISB(int ISB) {
        this.ISBN = ISB;
    }
    public GregorianCalendar getFechaDeActualizacion() {
        return fechaDeActualizacion;
    }

    public void setFechaDeActualizacion(GregorianCalendar fechaDeActualizacion) {
        this.fechaDeActualizacion = fechaDeActualizacion;
    }

    public boolean nuevoLibro(int numLibro){
        String titulo;
        int ISBN;
        Scanner lector = new Scanner(System.in);
        for (int i = 0; i < numLibro ; i++) {
            System.out.println("Libro " +(i+1));
            System.out.println("Titulo:" );
            titulo = lector.nextLine();
            System.out.println("ISB: ");
            ISBN = lector.nextInt();
            lector.nextLine();

            //setTieneHijo(true);
            //arrayListHijos.add(new Hijo(nombre, edad));
        }
        return true;
    }

}



