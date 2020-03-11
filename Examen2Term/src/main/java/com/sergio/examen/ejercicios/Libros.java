package com.sergio.examen.ejercicios;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Libros {

    private ArrayList<Libros> libros;

    public Libros(int numLibros) {
        this.libros = new ArrayList<>(numLibros);
    }
    public Libros(){
        this.libros =new ArrayList<>();
    }

    public boolean addLibro(String titulo, int ISBN, GregorianCalendar fechaDeVer ){
        if (isLibro(ISBN)){
            return false;
        }else {
            libros.add(new titulo, ISBN, fechaDeVer);
            return true;
        }
    }


    public void removeLibro(String ISBN){
        if(isLibro(ISBN)){
            libros.remove(buscarLibro(ISBN));
        }
    }
    public boolean eliminarLibro(int ISBN, String nombreLibro){
        if(isLibro(ISBN)) {
            buscarLibro(ISBN).removeLibro(nombreLibro);
            return true;
        }
        return false;
    }

    public Libros buscarLibro(int ISBN){
        for (Libros libro : libros) {
            if (libro.getISBN.toLowerCase().equals(ISBN.toLowerCase())) {
                return libro;
            }
        }
        return null;
    }
    public boolean isLibro(String ISBN){
        for (Libros libro : libros) {
            if (libro.getISBN().toLowerCase().equals(ISBN.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public boolean modificarLibro(int ISBN, String titulo){
        if(isLibro(ISBN)){
            buscarLibro(ISBN).setTitulo(titulo);
            return true;
        }
        return false;
    }

}
