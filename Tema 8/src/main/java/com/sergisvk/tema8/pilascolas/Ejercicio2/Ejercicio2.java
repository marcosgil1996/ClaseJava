package com.sergisvk.tema8.pilascolas.Ejercicio2;

import com.sergisvk.tema8.pilascolas.Ejercicio1.Pila;

public class Ejercicio2 {
    public static void main(String[] args) {
        Pila pila = new Pila();
        Analizador a = new Analizador(pila, "20 4 *");
        System.out.println(a.resultado());
    }
}
