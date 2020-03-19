package com.sergisvk.Ejercicio01;
import java.util.Arrays;
import java.util.Random;

public class Ejercicio01 {


     public Ejercicio01(){
         int[] numTotales = new int[10];
         int j = 0;
         numTotales[j]=(int)(aleatorio(0,50));
         System.out.print("Array antes de organizarlo"+ Arrays.toString(numTotales));
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
    /*
    public  ArrayList<Integer> toArrayLista(int[] array){
         int posPar =0;
         int posImpar = array.length -1;
         ArrayList<Integer> listaArray = new ArrayList<Integer>(array.length);
        for (int i = 0; i < 10 ; i++) {
            if (array[i] % 2 == 0){
                listaArray.add(posPar, array[i]);
                posPar ++;
            }else{
                listaArray.add(posImpar, array[i]);
                posImpar ++;
            }
        }
    }

     */
}


