package com.sergisvk.tema9.ejercicio2;

import sun.awt.image.ImageAccessException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public Ejercicio2(){
        double[] numeros;

    }

    public static double[] pideArraryDouble(int tamanyoArray){
        Scanner teclado= new Scanner(System.in);
        double[] numero = new double[tamanyoArray];

        int cont = 0;
        int contExpecciones =0;


        System.out.println("Introdce un número real");
        try {
            numero[cont] = teclado.nextDouble();
            cont++;
        } catch (InputMismatchException a) {
            System.out.println("ERRROR introduce un número");
        }

        return numero;
    }

}
