package com.sergisvk.Ejercicio1;
import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

     public Ejercicio1(){
         int[] numTotales = new int[10];
         int j = 0;
         numTotales[j]=(int)(aleatorio(0,50));
         System.out.print("Array antes de organizarlo%s%n"+ Arrays.toString(numTotales));
         numTotales = separaParesImpares(numTotales);
         System.out.println("Array depues de organizarlo en pares al princio y impares al final" + Arrays.toString(numTotales));

     }

    public static int aleatorio(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min +1 ) + min;
    }

    static int[] separaParesImpares(int[] listado){
        int[] nuevo=new int[listado.length];
        int i, posicionNuevoIzq=0, posicionNuevoDer=listado.length-1;

        for (i=0;i < listado.length;i++){
            if (listado[i]%2==0){
                nuevo[posicionNuevoIzq]=listado[i];
                posicionNuevoIzq++;
            } else {
                nuevo[posicionNuevoDer]=listado[i];
                posicionNuevoDer--;
            }
        }
        return nuevo;
    }
}


