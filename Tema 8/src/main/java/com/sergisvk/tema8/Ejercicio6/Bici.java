package com.sergisvk.tema8.Ejercicio6;

import com.sergisvk.tema8.Lib;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Bici{
    private String referencia;
    private String marca;
    private String modelo;
    private float peso;
    private float tamanyo;
    private boolean motor;
    private GregorianCalendar fechaFabricacion;
    private float precio;
    private int stock;

    public Bici(String referencia, String marca, String modelo, float peso, float tamanyo, boolean motor, GregorianCalendar fechaFabricacion, float precio, int stock) {
        this.referencia = referencia;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.tamanyo = tamanyo;
        this.motor = motor;
        this.fechaFabricacion = fechaFabricacion;
        this.precio = precio;
        this.stock = stock;
    }

    public String getReferencia() {
        return referencia;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPeso() {
        return peso;
    }

    public float getTamanyo() {
        return tamanyo;
    }

    public boolean isMotor() {
        return motor;
    }

    public GregorianCalendar getFechaFabricacion() {
        return fechaFabricacion;
    }

    public float getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public boolean vender(int cantidad) {
        if(stock >= cantidad) {
            stock = stock - cantidad;
            return true;
        }
        return false;
    }

    public void comprar(int cantidad) {
        if(cantidad > 0) {
            stock += cantidad;
        }
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return String.format("%-10s",referencia) +
                String.format("%-14s",marca) +
                String.format("%-12s",modelo) + "\t" +
                String.format("%8s",String.format("%.2f",peso) + " Kg") +
                String.format("%9s",String.format("%.1f",tamanyo) + "\"") +
                (motor ? String.format("%6s", "Sí") : String.format("%6s", "No")) +
                String.format("%14s", sdf.format(fechaFabricacion.getTime())) +
                String.format("%14s",String.format("%.2f", precio) + " €") + "\t" +
                "("+stock+" unidades disponibles)";
    }
}
