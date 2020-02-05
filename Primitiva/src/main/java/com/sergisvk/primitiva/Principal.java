// Realizamos los imports necesarios para realziar el proyecto
package com.sergisvk.primitiva;
import com.sergisvk.util.Lib;
import java.util.Scanner;

public class Principal {

    private Scanner lector; //Se declara el lector

    public Principal(){

        lector = new Scanner(System.in); //Hacemos la llamada al Lector para poder recibir datos por pantalla

        System.out.println("Bienvenido a la primitiva, espere unos segundos mientras se carga. . .");
        Lib.esperar(3); // Esperamos a iniciar el programa

        //Daremos la opción al usuario a elegir
        elecccionUsuario();

        int opcion;
        do {
            opcion = menuPrincipal();
            switch (opcion){
                case 1:
                    System.out.println("Has seleccionado juego único");


                    break;
                case 2:
                    System.out.println("Has seleccionado ¡jugar hasta ganar!");
                    // La consola mostrar números hasta que encuentre el número ganador

                    break;
                case 3:
                    System.out.println("Has seleccionado ¡Jugar hasta ganar! Sin reintegro");
                    //La consola mostrar todas las posibles convinaciones hasta que encuentre el número ganador
                case 4:
                    System.out.println("Hasta seleccionado jugar en ciclos de 10.000");
                case 5:
                    System.out.println("Jugar hasta obtener un premio de Categoría ESPECIAL");
                    //En esta opción el jugar jugará hasta que obtenga un premio de categoría ESPECIAL
                case 0:
                    System.out.println("¡Hasta pronto!");
                    Lib.limpiarPantalla();
                    // Cierre del programa
                    break;
            }
        }while (opcion !=0);
        Lib.limpiarPantalla();
        lector.close();
    }


    /*
    Menú Principal donde se muestras los principales modos de juego
    */
    private  int menuPrincipal(){
        int opcion = -1;
        do{
            System.out.println("******* SELECCCIONE EL MODO DE JUEGO *********");
            System.out.println("1. JUEGO ÚNICO");
            System.out.println("2. JUEGA HASTA TENER UN PREMIO");
            System.out.println("3. JUEGA HASTA TENER UN PREMIO (SIN REINTEGRO)");
            System.out.println("4. CICLOS DE 10.000 SORTEOS");
            System.out.println("5. JUGAR HASTA OBTENER PREMIO CATEGORÍA ESPECIAL");
            System.out.println("************************************************");
            System.out.println("0. SALIR \n");
            opcion = Integer.parseInt(lector.nextLine());
            if(opcion<0 || opcion >5){
                System.out.println("Elija una opcion del menú [0-5] ");
                Lib.pausa();
            }
        }while (opcion !=0);
        return opcion;
    }

    /*
    Menú de elección de números
    */
    private  int menuElecccion(){
        int opcion = -1;
        do{
            System.out.println(" ---- ELECION DE NÚMEROS ----");
            System.out.println("1. Elige los números");
            System.out.println("2. La consola por usted");
            System.out.println("------------------------------");
            System.out.println("0. Salir");
            opcion = Integer.parseInt(lector.nextLine());
            if(opcion < 0 || opcion >2){
                System.out.println("Elija una opcion del menú de [0-3]");
                Lib.pausa();
            }
        }while (opcion != 0);
        return opcion;
    }

    private void elecccionUsuario(){
        lector = new Scanner(System.in);
        int opcion;
        do {
            opcion = menuElecccion();
            switch (opcion){
                case 1:
                    System.out.println("Has seleccionado elegir los números");
                    // Has seleccionado juego único
                    usuarioElige();

                    break;
                case 2:
                    System.out.println("¡La consola elige!");
                    // La consola mostrar números hasta que encuentre el número ganador
                    Aleatorio();

                    break;
                case 0:
                    System.out.println("¡Hasta pronto!");
                    // Cierre del programa
                    Lib.esperar(3);

                    break;
            }
        }while (opcion !=0);
        Lib.limpiarPantalla();

    }

    private void usuarioElige(){
        System.out.println("Escribe un número entre [0-49], no repitas números");

    }

    private void Aleatorio(){
        Lib.aleatrioSinRepetir();
    }


}
