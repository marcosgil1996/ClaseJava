package com.sergisvk.tema8.pilascolas.ejercicio1;

public class Pila {

    private static final int INITIAL_SIZE = 10;
    private int[] datos;
    private int nElmentos;

    public Pila(){
        this(INITIAL_SIZE);
    }

    public Pila(int size){
        datos = new int[size];
        nElmentos = 0;
    }

    public int size(){
        return nElmentos;
    }

    public boolean empyt(){
        return nElmentos != 0;
    }
    public int pop(){
        int resultado = Integer.MIN_VALUE;
        if(!empyt()){
            resultado = datos[nElmentos - 1];
        }
        return resultado;
    }

    public int top(){
        int resultado = Integer.MIN_VALUE;
        if(!empyt()){
            resultado = datos[nElmentos - 1];
        }
        return resultado;
    }

}
