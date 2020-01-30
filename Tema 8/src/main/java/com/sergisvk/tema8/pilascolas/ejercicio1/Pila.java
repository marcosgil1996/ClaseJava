package com.sergisvk.tema8.pilascolas.ejercicio1;

//El primero en entrar es el último en salir

import java.util.Arrays;

public class Pila {

    private int max_Array;
    private int[] datos;
    private int nElmentos;

    public Pila(int max_Array){
        this.max_Array= max_Array;
        datos = new int[max_Array];
        nElmentos = 0;
    }
    public Pila(){
        this.max_Array =10;
        datos = new int[max_Array];
        nElmentos = 0;
    }

    public int size(){
        return nElmentos;
    }
    public boolean empyt(){
        return nElmentos == 0;
    }

    public int pop(){
        int resultado = Integer.MIN_VALUE;
        if(empyt()){
            resultado = datos[nElmentos - 1];
            nElmentos --;
        }
        return resultado;
    }

    public int top(){
        int resultado = Integer.MIN_VALUE;
        if(empyt()){
            resultado = datos[nElmentos - 1];
            nElmentos --;
        }
        return resultado;
    }

    public void push(String num){

    }

    public int

    @Override
    public String toString() {
        return "Pila{" +
                "max_Array=" + max_Array +
                ", datos=" + Arrays.toString(datos) +
                ", nElmentos=" + nElmentos +
                '}';
    }

    public void push() {
    }
}
