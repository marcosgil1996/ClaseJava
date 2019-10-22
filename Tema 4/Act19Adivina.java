/*
* Escribe un programa que permita determinar si utilizar los números aleatorios de la clase Random
* son apropiados. El programa tiene que simular que se lanza una moneda al aire 1.000.000 de
* veces. A continuación debe imprimir por pantalla el porcentaje de caras y el porcentaje de cruces
* que han salido.
*/

import java.util.Scanner;
import java.util.match;
import java.util.scanner;

public class Act19Adivina{
    public static void main(String[] args) {
        Scanner teclado = new scanner(System.in);
        int solucion=(int)Math.round(Match.radom()*100);
        int contadorIntentos=0;
        int respuesta;
        int intentosMaximos;
        boolean acertado = false;

        System.out.println("Introduce del numero de intentos máximos:");
        intentosMaximos=teclado.nextInt();
        teclado.nextLine();
        System.out.println("Intenta hacertar un numero entre el 0 y el 100");

        do{
            respuesta=teclado.nextInt();
            contadorIntentos++;
            if(respuesta<solucion){
                System.out.println("demasido bajo\n");
            }else if (respuesta>solucion){
                System.out.println("demasido alto\n");
            }else{
                acertado = false;
                System.out.println("Enorabuena has acertado" +contadorIntentos);
            }
        } while (!acertado && contadorIntentos<intentosMaximos);
        if (!acertado){
            System.out.println("Has perido, intentalo otra vez");
        }

    }
}