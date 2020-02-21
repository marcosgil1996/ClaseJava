package com.sergisvk.tema9.Ejercicio2;

import java.util.InputMismatchException;
import com.sergisvk.tema9.utils.Log;
import com.sergisvk.tema9.utils.Lib;
import java.util.Arrays;


public class Ejercicio2 {

    public static final int N_ELEMENTOS = 10;
    public Ejercicio2() {
        solicitarNumeros();
    }

    public void solicitarNumeros() {
        double[] v = new double[N_ELEMENTOS];
        boolean validado = true;
        int n_ime = 0;
        int n_nfe = 0;
        for(int i = 1; i <= 10; i++) {
            do {
                try {
                    System.out.print("Indica el número " + i + ": ");
                    v[i-1] = Double.parseDouble(Lib.lector.nextLine());
                    validado = true;
                } catch (InputMismatchException ime) {
                    validado = false;
                    n_ime++;
                    Log.e(ime.getMessage());
                } catch (NumberFormatException nfe) {
                    validado = false;
                    n_nfe++;
                    Log.e(nfe.getMessage());
                }
            } while(!validado);
        }

        System.out.println("NumberFormatException: " + n_nfe);
        System.out.println("InputMismatchException: " + n_ime);
        System.out.println("Números: " + Arrays.toString(v));
    }
}

