package com.sergio.examen.ejercicios;
import com.sergio.examen.util.Lib;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Programa1 {
    private Scanner lector = new Scanner(System.in);

    public Programa1() {
        int opcionMenu;
        Lib.limpiarPantalla();
        do {
            opcionMenu = menu();
            switch (opcionMenu) {
                case 0:
                    System.out.println("Hasta la proxima!");
                    break;
                case 1:
                    newLibro();
                    break;

            }
            Lib.limpiarPantalla();
        } while (opcionMenu != 0);

    }

    private int menu() {
        int opcion;
        do {
            System.out.println("*********************");
            System.out.println("* COLECCIÓN DE LIBROS *");
            System.out.println("*********************");
            System.out.println("1. Añadir nuevo libro");
            System.out.println("2. Mostrar listado");
            System.out.println("---------------------");
            System.out.println("0. Salir");
            opcion = lector.nextInt();
            lector.nextLine();
        } while (opcion < 0 || opcion > 6);
        return opcion;
    }

    public void newLibro(){
        String titulo;
        int ISBN;
        String fechaDeVer;
        System.out.println("* NUEVO LIRBO *");
        System.out.println(" ");
        System.out.println("Introduce el ISBN: ");
        ISBN = lector.nextInt();
        lector.nextLine();
        if (Libros.isLibro(ISBN)){
            System.out.println("El libro ya está registrado: ");
        }else {
            System.out.println("Titulo del libro:");
            titulo = lector.nextLine();
            System.out.println("Fecha de nacimiento: ");
            fechaDeVer =lector.nextLine();
        }
    }

    public static boolean validarfecha(String fechaNac){
        SimpleDateFormat fomatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        return true;
    }



}
