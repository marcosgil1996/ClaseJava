package com.sergisvk.tema8.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static final int MAX_ALUMNOS = 500;
    private static Scanner teclado;

    public static void main(String[] arg){

        Alumno[] asignatura = new Alumno[MAX_ALUMNOS];
        int nAlumnos = 0;


    }

    /**
     * Verificación del menú de alumnos con llamada a otros métodos
     */
    public static void imprirConultas(){

        boolean validar = false;
        int opcion;
        System.out.println("*****************");
        System.out.println("****GESTION ALUMNOS****");
        System.out.println("***************");
        System.out.println("1º NUEVO ALUMNO \n 2º BAJA DE ALUMNOS\n 3º CONSULTAS ");
        System.out.println("-------------------");
        System.out.println("0 SALIR");

        do {
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 0:
                    System.out.println("Cierre del programa");
                case 1:
                    System.out.println("Creando nuevo alumno. . .\n");
                    break;
                case 2:
                    System.out.println("Has selecionado la opcioón de baja de alumno\n");
                    break;
                case 3:
                    System.out.println("Entrando en la opcion de consultas\n");
                    break;
                default:
                    System.out.println("");
                    validar = true;
            }

        }while (validar == true);
    }

    /**
     * Verificicación del Submenú con llamadas a otros métodos
     */
    public static void imprimirSubmenu(){
        boolean validar = false;
        int opcion;
        System.out.println("*****************");
        System.out.println("*** CONSULTAS ***");
        System.out.println("*****************");
        System.out.println("1. Grupo\n 2. Por Edad\n 3. Por NIA\n 4. Por Apellidos\n");
        System.out.println("*****************");
        System.out.println("0 Volver al menú ");

        opcion = teclado.nextInt();
        teclado.nextLine();
        switch (opcion){
            case 1:
                System.out.println("Buscando las consultas por GRUPO . . ."); //llamada al método del grupo
                break;
            case 2:
                System.out.println("Buscando las consultas por EDAD . . ."); //llamda al método de edad
                break;
            case 3:
                System.out.println("Buscando las consultas por NIA . . ."); //llamada al método de Consultas de NIA
                break;
            case 4:
                System.out.println("Buscando consultas por Apellidos . . ."); //llamada al método de consultas por Apellidos
            default:


        }

    }


}
