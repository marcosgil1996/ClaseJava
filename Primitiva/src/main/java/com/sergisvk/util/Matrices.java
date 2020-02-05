package com.sergisvk.util;

public class Matrices {

    /**
     * Convierte una matriz en una cadena
     *
     * @param matriz palbra
     * @return cadena de String
     */
    public static String toText(int[] matriz) {

        StringBuilder cadena = new StringBuilder();

        for (int palabra : matriz) {

            cadena.append(palabra).append(" ");

        }

        return cadena.toString();

    }
}
