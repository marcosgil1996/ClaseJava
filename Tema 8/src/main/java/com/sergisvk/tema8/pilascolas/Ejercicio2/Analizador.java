package com.sergisvk.tema8.pilascolas.Ejercicio2;

import com.sergisvk.tema8.pilascolas.Ejercicio1.Pila;

public class Analizador {
    private Pila pila;
    private String operacion;

    //Constructor que inicializa los atributos
    public Analizador(Pila pila, String operacion){
        this.pila = pila;
        this.operacion = operacion;

    }

    public double resultado() {
        String[] operacion;
        double valor1;
        double valor2;
        double resultado;

        operacion = this.operacion.split(" ");
        for (int i = 0; i <operacion.length ; i++) {
            if(isNumeric(operacion[i])){
                this.pila.push(Double.parseDouble(operacion[i]));
            } else {
                valor1= pila.pop();
                valor2= pila.pop();
                resultado= operacion(operacion[i],valor1,valor2);
                this.pila.push(resultado);
            }
        }
        return this.pila.top();
    }

    public static double operacion(String operacion, double valor1, double valor2) {
        switch (operacion){
            case "+":
                return valor2 + valor1;
            case "-":
                return valor2 - valor1;
            case "/":
                return valor2 / valor1;
            case "*":
                return valor2 * valor1;
            default:
                return Integer.MIN_VALUE;
        }


    }

    public boolean isNumeric (String posicion ){
        try {
            double d = Double.parseDouble(posicion);
        } catch (NumberFormatException nfe){
            return false;
        }
        return true;
    }
}

