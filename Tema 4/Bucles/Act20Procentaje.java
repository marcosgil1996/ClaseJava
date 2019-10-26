/**
 * Escribe un programa que permita determinar si utilizar los números aleatorios 
 * de la clase Random son apropiados. El programa tiene que simular que se lanza 
 * una moneda al aire 1.000.000 de veces. A continuación debe imprimir por pantalla
 *  el porcentaje de caras y el porcentaje de crucesque han salido.
 */

import java.util.Random;
import java.io.*;

public class Ejer20Porcentaje {

    public static void main(String Args[]) {
    
        final int NLANZAMIENTOS = 1000000;
        int moneda = 0;
        int cara = 0;
        int cruz = 0;
        float resultadoCara = 0f;
        float resultadoCruz = 0f;


        Random rnd = new Random(); // se crea la el sistema radom
        
        /* Lanza la moneda un millón de veces, añade un ounto a un contador cada vez
        /* que sale cara o cruz. */

        for(int i = 1; i <= NLANZAMIENTOS; i++){
            moneda = rnd.nextInt(2 - 1 + 1) + 1;

            if (moneda == 1) {
            cara++;
            }
            else
            cruz++;
        }
        
        // Asocia los resultados a variables float para mostrar el porcentaje

        resultadoCara = cara;
        resultadoCruz = cruz;

        // Mostrar resultado al usuario
        
        System.out.println("/// RESULTADOS ///");
        System.out.println("Total monedas lanzadas: " + (cara+cruz));
        System.out.println("Total caras: " + cara);
        System.out.println("Total cruces: " + cruz);
        System.out.println("Porcentaje de caras: " + ((double)cara/ NLANZAMIENTOS)  * 100 );
        System.out.println("Porcentaje de cruces: " + ((double)cruz / NLANZAMIENTOS) * 100 );
        }
    }
