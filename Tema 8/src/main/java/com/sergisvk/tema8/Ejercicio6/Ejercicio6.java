package com.sergisvk.tema8.Ejercicio6;
import com.sergisvk.tema8.Lib;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * Clase principal
 */
public class Ejercicio6 {
    public  static Scanner lector;
    private Bici[]  bicis;
    private int contadorBicis;


    public Ejercicio6() {
        lector = new Scanner(System.in);
        int opcion;
        do {
            opcion = menuPrincipal();
            switch (opcion) {
                case 1:
                    newBicicleta(); //llamada al método de nueva bicicleta
                    break;
                case 2:
                    venderBicileta(); //llamada al método de venta
                case 3:
                    menuConsultas(); //llamada al método para que enseñe el menú de coonsultas
                    break;
                case 4:

                case 0:
                    System.out.println("Hasta pronto!");
                    break;
            }
        } while(opcion != 0);
    }

    /**
     *
     */
    private void newBicicleta(){
         String stock;
        int referencia;
        boolean valido = false;
        String marca;
        double pesoKg;
        double pulgadas;
        String fechaFabricacionString;
        GregorianCalendar fechaFabricacion = null;
        boolean motor; //falta por añadir
        int precio;


        Lib.limpiarPantalla();

        if(contadorBicis <bicis.length){
            System.out.println("*** NUEVO BICICLETA***");
            do {
                System.out.println("Introduce la Referencia: ");
                referencia = Integer.parseInt(lector.nextLine());
                valido = referencia < 10000 && referencia > 0;
                if (!valido){
                    System.out.println("La referencia debe de estar comprendido en el rango [0-10000]");
                    Lib.limpiarPantalla();
                }
                //if () buscar porReferencia y si  esta dublicado se añade
            }while (!valido);

            // Se gruarda la  Marca de la Bicicleta
            do{
                System.out.println("La marca de la Bici: ");
                marca = lector.nextLine();
                valido = marca.length() >2;
                if(!valido){
                    System.out.println("La marca debe de contener su más de 2 caracteres");
                    Lib.limpiarPantalla();
                }
            }while (!valido);

            //Se guarda el Peso en Kg
            System.out.println("Peso en Kg");
            pesoKg = lector.nextDouble();

            //Se guarda las pulgas de la rueda
            System.out.println("Tamaño de la rueda en pulgadas: ");
            pulgadas = lector.nextDouble();

            //Si tiene motor
             do{
                 System.out.println("Introduce la fecha de fabricación (dd-MM-yyyy): ");
                 fechaFabricacionString = lector.nextLine();
                 SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                 try{
                     Date date = sdf.parse(fechaFabricacionString);
                     fechaFabricacion = new GregorianCalendar();
                     fechaFabricacion.setTime(date);
                     valido = true;
                 }catch (ParseException | java.text.ParseException pe) {
                     valido = false;
                     System.out.println("El formato de la fecha del fabricación no es válida. Recuerde (dd-MM-yyyy)");
                     Lib.pausa();
                 }
             }while (!valido);

            do {
                System.out.println("Precio: ");
                precio = Integer.parseInt(lector.nextLine());
                valido = precio < 10000 && precio > 0;
                if (!valido){
                    System.out.println("El precio debe de estar comprendido en el rango [0-10000]");
                    Lib.limpiarPantalla();
                }
            }while (!valido);

            bicis[contadorBicis] = new Bici(referencia, marca, precio, pesoKg, pulgadas);
            contadorBicis ++;
            System.out.println("Se ha introducido una nueva bicicleta en el sistema ");
        }else {
            System.out.println("Imposible añadir la nueva bicicleta en el stock");
            System.out.println("El array de bicicletas está lleno");
        }
        Lib.pausa();
    }


    /**
     *
     */
    private void venderBicileta(){
        int referencia;
        String pos;
        Lib.limpiarPantalla();
        System.out.println("**VENDER BICICLETAS**");
        System.out.println("Nº de Referencia de la bicicleta: ");
        referencia = Integer.parseInt(lector.nextLine());
        //pos = buscarBicisPorReferencia(referencia);
        if (pos >= 0) {
            bicis[pos] = null;
            contadorBicis --;
            System.out.println("Bicicleta Vendida y borrada del catálogo");
        }else{
            System.out.println("No exite ninguna bicicleta con esa referencia en el catálogo");
        }
        Lib.pausa();
    }
    private void desplazar(Bici[] bicis, int pos){
        int i = pos;
        boolean fin = false;
        while (i < bicis.length && !fin){
            fin = bicis[i] == null;
            if(!fin){
                bicis[i-1] = bicis[i];
                bicis[i] = null;
            }
            i++;
        }
    }



    private void stock(){

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
    private int menuConsultas() {
        int opcion = -1;
        do {
            Lib.limpiarPantalla();
            System.out.println("***************");
            System.out.println("** CONSULTAS **");
            System.out.println("****************");
            System.out.println("1. Consultar por referencia..");
            System.out.println("2. Consultar por marca..");
            System.out.println("3. Consultar modelo...");
            System.out.println("----------------");
            System.out.println("0. Volver al menú principal\n");
            System.out.println("Elija una opción: ");
            opcion = Integer.parseInt(lector.nextLine());
            if(opcion < 0 || opcion > 5) {
                System.out.println("Elija una opción del menú [0-3]");
                Lib.pausa();
            }
        } while (opcion < 0 || opcion > 5);
        return opcion;
    }
}
