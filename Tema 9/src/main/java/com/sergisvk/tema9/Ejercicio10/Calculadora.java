package com.sergisvk.tema9.Ejercicio10;
import com.sergisvk.tema9.Lib;
import java.util.Scanner;

public class Calculadora {

    private Scanner lector; //Se declara el lector

    public Calculadora(){

        lector = new Scanner(System.in); //Hacemos la llamada al Lector para poder recibir datos por pantalla

        System.out.println("Bienvenido a la calculadora, espere unos segundos mientras se carga. . .");
        Lib.esperar(3); // Esperamos a iniciar el programa (congela el programa)
        int opcion;
        double num1,num2; //declaraciones de los dos números
        double resultado = 0;

        do {
            opcion = menuPrincipal();
            switch (opcion){
                case 1:
                    try {
                        System.out.println("Has seleccionado suma \n Inserte el primer número: ");
                        num1 = lector.nextDouble();
                        lector.nextLine();
                        System.out.println("Inserte el segundo número: ");
                        num2 = lector.nextDouble();
                        lector.nextLine();
                        resultado = num1 + num2;
                    }catch (NumberFormatException a){
                        System.out.println("Debes de introducir un número");
                        Lib.pausa();
                    }
                    System.out.println("El resultado es "+ resultado);
                    resultado = 0;
                    Lib.pausa();

                    break;
                case 2:
                    try {
                        System.out.println();
                        System.out.println("Has seleccionado resta \n Inserte el primer número: ");
                        num1 = lector.nextDouble();
                        lector.nextLine();
                        System.out.println("Inserte el segundo número: ");
                        num2 = lector.nextDouble();
                        lector.nextLine();
                        resultado = num1 - num2;
                    }catch (NumberFormatException b){
                        System.out.println("Debees de introducir un número");
                    }
                    System.out.println("El resultado es "+ resultado);
                    resultado = 0;
                    Lib.pausa();
                    break;
                case 3:
                    try {
                        System.out.println();
                        System.out.println("Has seleccionado multiplicación \n Inserte el primer número: ");
                        num1 = lector.nextDouble();
                        lector.nextLine();
                        System.out.println("Inserte el segundo número: ");
                        num2 = lector.nextDouble();
                        lector.nextLine();
                        resultado = num1 * num2;
                    }catch (NumberFormatException b){
                        System.out.println("Debees de introducir un número");
                    }
                    System.out.println("El resultado es "+ resultado);
                    resultado = 0;
                    Lib.pausa();
                    break;
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
    Menú de elección, devuelve un número con la opción elegida por el usuario
    */
    private  int menuPrincipal(){
        int opcion = -1;
        do{
            System.out.println("CALCULADORA TERMINAL");
            System.out.println("- - - - - - - - - - - - ");
            System.out.println("ELIGE UNA OPCIÓN");
            System.out.println(" 1. SUMAR \n 2. RESTAR \n 3. MULTIPLICAR \n 4. DIVIDIR \n 5. RESTO DIVISIÓN");
            System.out.println("- - - - - - - - - - - - ");
            System.out.println("0. SALIR");
            opcion = Integer.parseInt(lector.nextLine());
            if(opcion < 0 || opcion >5){
                System.out.println("Elija una opcion del menú de [0-5]");
                Lib.pausa();
            }
        }while (opcion != 0);
        return opcion;
    }







}
