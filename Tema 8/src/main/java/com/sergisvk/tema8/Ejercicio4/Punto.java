package com.sergisvk.tema8.Ejercicio4;

public class Punto {
    public double getX() {
        return x;
    }
    
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto(){
        x = 0;
        y = 0;
    }

    public static void calcularDistancia(double punto){

    }
    public void setX(double x) {
        this.x = x;
    }


    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

}
