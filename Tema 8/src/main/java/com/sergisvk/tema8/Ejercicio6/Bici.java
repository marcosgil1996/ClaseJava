package com.sergisvk.tema8.Ejercicio6;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Bici {

    private String referencia;
    private boolean motor;
    private  String modelo;
    private float tamanyo;
    private int anyo;
    private float pulgadas;
    private int stock;
    private GregorianCalendar fechaFabricacion;

    public Bici(int referencia, String marca, int precio, double pesoKg, double pulgadas){


    }
    private String marca;

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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getTamanyo() {
        return tamanyo;
    }

    public void setTamanyo(float tamanyo) {
        this.tamanyo = tamanyo;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public GregorianCalendar getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(GregorianCalendar fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }




}


