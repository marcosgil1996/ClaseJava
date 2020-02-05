package com.sergisvk.primitiva;
import com.sergisvk.util.Lib;

import java.util.ArrayList;

public class Bombo {

    private ArrayList<Integer> bolas; //Declaramos el Array que contiene el objeto String


    public Bombo(int bolas) {
        this.bolas = new ArrayList<>();
        for (int i = 0; i < Math.abs(bolas); i++) {
            this.bolas.add(i);
        }
    }

    /**
     * Saca una bola del bombo.
     *
     */
    public int sacarBola() {
        int pos = Lib.aleatorio(0, bolas.size() - 1);
        Integer bola = bolas.get(pos);
        bolas.remove(pos);
        return bola;
    }



}
