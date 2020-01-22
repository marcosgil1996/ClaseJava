package com.sergisvk.tema8.Ejercicio6;

import java.util.Calendar;

public class Bici {
    private String marca;
    private String referencia;
    private boolean motor;
    private int anyo;
    private float pulgadas;

    public Bici(int referencia, String marca, int precio, double pesoKg, double pulgadas){
        this.referencia = "A0000";
        this.marca = "Unknown";
        this.motor = false;
        this.anyo = Calendar.getInstance().get(Calendar.YEAR);

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }
}


