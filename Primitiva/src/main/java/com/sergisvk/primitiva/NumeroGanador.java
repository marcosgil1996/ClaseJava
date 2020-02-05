package com.sergisvk.primitiva;

public class NumeroGanador extends Primitiva{
    private int complementario;
    private int reintegro;

    public NumeroGanador() {
        Bombo bombo = new Bombo(50);
        complementario = bombo.sacarBola();
        Bombo bombo_reintegro = new Bombo(9);
        reintegro = bombo_reintegro.sacarBola();
    }

    public int getComplementario() {
        return complementario;
    }

    public int getReintegro() {
        return reintegro;
    }

    @Override
    public int getNumero(int numero) {
        if (numero == 6) {
            return  complementario;
        } else if(numero == 7) {
            return reintegro;
        } else {
            return super.getNumero(numero);
        }
    }






}
