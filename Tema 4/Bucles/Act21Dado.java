/**
 * Escribe un programa que permita determinar la probabilidad con la que aparece 
 * cada uno de los valores al lanzar un dado. Para hacerlo, se lanzará el dado 1.000.000 veces
 *  y se visualizará cuántas veces ha aparecido cada número y el porcentaje que representa del total.
 */

 import java.util.Random;

import org.graalvm.compiler.api.replacements.Fold;

import java.io.*;

public class Ejer21Dado{
    
    public static void main(String[] args) {
        
        final int NLANZAMIENTOS = 1000000;
        int  dado = 0;
        int cara1, cara2, cara3, cara4, cara5, cara6;
        float resultado1 = 0f;
        float resultado2 =0f;
        float resultado3 = 0f;
        float resultado4 = 0f;
        float resultado5 = 0f;
        float resultado6 = 0f;

        Random rnd = new Random(); // se crea la el sistema radom
        
        // Nuumeros de veces que se comprueba

        for(int i = 1; i <= NLANZAMIENTOS; i++){
            dado = rnd.nextInt(6 - 1 + 1) + 1;

            switch(dado) {
                case 1;
                resultado1++;

            }
        
            cruz++;
        }
    }
    
}