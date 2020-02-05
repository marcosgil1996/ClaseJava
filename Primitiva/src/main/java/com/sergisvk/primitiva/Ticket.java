package com.sergisvk.primitiva;

public class Ticket {

    //Declaración de las variables principales
    private int idSorteo;
    private int serieNumero;
    private int reintegro;

    private static void Reintegro(int reintegro){
        if (reintegro <0 || reintegro >9){
            System.out.println("El número del reintegro no es correcto");
        }

    }

    public Ticket(){

    }

    public Ticket(int idSorteo, int serieNumero, int reintegro) {
        this.idSorteo = idSorteo;
        this.serieNumero = serieNumero;
        this.reintegro = reintegro;
    }

    //Mostrar
    @Override
    public String toString() {
        return String.format("Sorteo: %d, S/N: %d, Primitiva: %s, Reintegro: %d",idSorteo, serieNumero,
                super.toString(), reintegro);
    }

    //Getters y Setters de idSorteo, serieNumero,reintegro
    public int getIdSorteo() {
        return idSorteo;
    }

    public void setIdSorteo(int idSorteo) {
        this.idSorteo = idSorteo;
    }

    public int getSerieNumero() {
        return serieNumero;
    }

    public void setSerieNumero(int serieNumero) {
        this.serieNumero = serieNumero;
    }

    public int getReintegro() {
        return reintegro;
    }

    public void setReintegro(int reintegro) {
        this.reintegro = reintegro;
    }




}
