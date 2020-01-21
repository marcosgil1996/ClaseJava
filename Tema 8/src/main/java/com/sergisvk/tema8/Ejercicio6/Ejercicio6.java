package com.sergisvk.tema8.Ejercicio6;
import com.sergisvk.tema8.Lib;
import java.util.Scanner;


public class Ejercicio6 {
    public  static Scanner lector;
    private Bici[]  Bicis;

    public Ejercicio6(int maxAlumnos, int nGrupos) {
        lector = new Scanner(System.in);
        int opcion;
        do {
            opcion = menuPrincipal();
            switch (opcion) {
                case 1:
                    //bicis nuevas
                    break;
                case 2:

                case 3:

                    break;
                case 0:
                    System.out.println("Hasta pronto!");
                    break;
            }
        } while(opcion != 0);
    }
    private void newBicileta(){
         String stock;





    }

    /**
     * Menú principal
     * @return opciones del menú hacia el main
     */
    private int menuPrincipal() {
        int opcion = -1;
        do {
            Lib.limpiarPantalla();
            System.out.println("*********************");
            System.out.println("** GESTIÓN BICICLETAS **");
            System.out.println("*********************");
            System.out.println("1. Nueva bicicleta...");
            System.out.println("2. Venta de bicicletas...");
            System.out.println("3. Consultas...");
            System.out.println("---------------------");
            System.out.println("0. Salir\n");
            System.out.println("Elija una opción: ");
            opcion = Integer.parseInt(lector.nextLine());
            if(opcion < 0 || opcion > 3) {
                System.out.println("Elija una opción del menú [0-3]");
                Lib.pausa();
            }
        } while (opcion < 0 || opcion > 3);
        return opcion;
    }

}
