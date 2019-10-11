/*A una cantidad de dinero indicada, representa con la menor cantidad de monedas posible
 *Ejercicio 6-4
 *@author: Rafa
 *@version: 1
*/

import java.util.Scanner;

public class Act6Monedas {

    public static void main(String Args[]) {

	    Scanner scan = new Scanner(System.in);
        
        /* Se declara la variable que almacenará la cantidad de dinero, el
         valor de las monedas y un contador de cantidad de cada una.*/

	    double dinero;
    
        final double MONEDADOS = 2.0;
        double cantidadDos = 0;

        final double MONEDAUNO = 1.0;
        double cantidadUno = 0;

        final double MONEDACINCUENTA = 0.50;
        double cantidadCincuenta = 0;

        final double MONEDAVEINTE = 0.20;
        double cantidadVeinte = 0;

        final double MONEDADIEZ = 0.10;
        double cantidadDiez = 0;

        final double MONEDACINCO = 0.05;
        double cantidadCinco = 0;

        final double MONEDADOSCENT = 0.02;
        double cantidadDosCent = 0;

        final double MONEDAUNOCENT = 0.01;
        double cantidadUnoCent = 0;

	    System.out.println("Introduce una cantidad de dinero:");
	    dinero = scan.nextDouble(); //
	    scan.reset();
	
	    // Se itera, restando la cantidad de cada moneda a dinero y añadiendo una unidad de esa moneda.
    
        for (;dinero >= MONEDADOS; ++cantidadDos){
            dinero = dinero - 2.0;
            
        }

        for (;dinero >= MONEDAUNO; ++cantidadUno){
            dinero = dinero - 1.0;
        }

        for (;dinero >= MONEDACINCUENTA; ++cantidadCincuenta){
            dinero = dinero - 0.50;
        }

        for (;dinero >= MONEDAVEINTE; ++cantidadVeinte){
            dinero = dinero - 0.20;
        }

        for (;dinero >= MONEDADIEZ; ++cantidadDiez){
            dinero = dinero - 0.10;
        }

        for (;dinero >= MONEDACINCO; ++cantidadCinco){
            dinero = dinero - 0.05;
        }

        for (;dinero >= MONEDADOSCENT; ++cantidadDosCent){
            dinero = dinero - 0.02;
        }

        for (;dinero >= MONEDAUNOCENT; ++cantidadUnoCent){
            dinero = dinero - 0.01;
        }

        // Muestra el resultado por pantalla
        
        System.out.println("Monedas de 2 euros = " + cantidadDos);
        System.out.println("Monedas de 1 euro = " + cantidadUno);
        System.out.println("Monedas de 50 céntimos de euro = " + cantidadCincuenta);
        System.out.println("Monedas de 20 céntimos de euro = " + cantidadVeinte);
        System.out.println("Monedas de 10 céntimos de euro = " + cantidadDiez);
        System.out.println("Monedas de 5 céntimos de euro = " + cantidadCinco);
        System.out.println("Monedas de 2 céntimos de euro = " + cantidadDosCent);
        System.out.println("Monedas de 1 céntimos de euro = " + cantidadUnoCent);
    }
}