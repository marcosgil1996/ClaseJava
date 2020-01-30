package com.sergisvk.tema8.pilascolas.ejercicio2;

import com.sergisvk.tema8.pilascolas.ejercicio1.Pila;


public class NotacionPolaca {

    private Pila Pila;
    private String operacion;

    public NotacionPolaca() {
        Pila = pila;
        this.operacion = operacion;
    }

    public void ressultado(){
        String[] operacion;
        double valor1;
        double valor2;
        double resultado;

        operacion = this.operacion.split(" ");
        for (int i = 0; i < operacion.length ; i++) {
            if (isNumeric(operacion[i])){
                this.Pila.push(operacion[i]);
            }else{
                valor1 = Pila.pop();
                valor2 = Pila.pop();
            }

        }
        System.out.println(this.Pila.pop());
    }

    public static double operacion(String operacion, double valor1, double valor2){
        switch (operacion){
            case "+":
                return valor2 =+ valor1;
            case "-":
                return valor2 - valor1;
            case "*":
                return valor1 *valor2;
            case "/":
                return valor2 / valor1;
            case"%":
                return valor2 % valor1;
            default:
                return Integer.MIN_VALUE;
        }
    }

    public boolean isNumeric(String stc){
        try{
            double d = Double.parseDouble(stc);
        }catch (NumberFormatException nfe){
            return  false;
        }
        return  true;
    }

}
