package com.sergisvk.Ejercicio6;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio6 {
    private Scanner lector = new Scanner(System.in);
    private HashMap<String, String> palabras = new HashMap<>();

    public Ejercicio6(){
        System.out.println("*** DICCCIONARIO ESPAÑOl - INGLÉS ***");
        int opcionMenu;
        do {
            opcionMenu = menu();
            switch (opcionMenu) {
                case 1:
                    pedirPalabras();
                    break;
                case 2:
                    traducirPalabra();
                    break;
                case 0:
                    System.out.println("Hasta la proxima!");
                    break;
            }
        } while (opcionMenu != 0);
    }


    private int menu(){
        int opcion;
        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("==============");
            System.out.println("1. Introducir palabras.");
            System.out.println("2. Traducir palabra.");
            System.out.println("==============");
            System.out.println("0. Salir de la aplicación");
            System.out.println("Introduce una opcion: ");
            opcion = lector.nextInt();
            lector.nextLine();
        }while (opcion < 0 || opcion > 2);
        return opcion;
    }

    private void pedirPalabras (){
        String ingles, castellano ;
        int numero = 0;

        try {
            System.out.println("Cuentas palabras quieres traduccir: ");
            numero = lector.nextInt();
        }catch (NumberFormatException a){
            System.out.println("Introduce número: ");
        }
        lector.nextLine();
        for (int i = 0; i < numero ; i++) {
            System.out.println("Inserta una palabra Inglés"+" "+(i+1)+":");
            ingles = lector.nextLine();

            System.out.println("Inserta una palabra Español"+" "+(i+1)+":");
            castellano = lector.nextLine();
            palabras.put(castellano, ingles);
        }
        System.out.println("\n");
    }

    private void traducirPalabra(){
        System.out.println("Inserta la palabra a buscar (en español): ");
        String ingles = lector.nextLine();
        if(palabras.containsKey(ingles)){
            System.out.println(palabras.get(ingles)+"\n");
        } else {
            System.out.println("La palabra no existe.");
        }
        System.out.println("\n");
    }

}
