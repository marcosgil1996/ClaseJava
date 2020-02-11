package com.sergisvk.tema9.ejercicio1;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

    public Ejercicio1(){

        int[] a = leeNumeros();

    }

    public int[] leeNumeros(){
        Scanner lector = new Scanner(System.in);
        int MAX_CAPACIDAD = 10;
        int[] numeros = new int[MAX_CAPACIDAD];
        int contador = 0;
        boolean salir = false;
        boolean isFull = false;

        Arrays.fill(numeros, 1);

        do {
            try {
                System.out.println("Introduce un número");
                numeros[contador] = lector.nextInt();
                contador++;
                lector.nextLine();
                if (numeros[contador] < 0){
                    salir = true;
                }
                isFull = contador == numeros.length -1;
                if (isFull){
                    System.out.println("Ya no caben más numeros");
                }
            }catch (InputMismatchException e1){
                System.out.println("Solo puede introducir letras");
                lector.nextLine();
            }
        }while (!salir && !isFull);
        return numeros;
    }




}
