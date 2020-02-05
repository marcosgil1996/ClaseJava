package com.sergisvk.primitiva;
import com.sergisvk.util.Matrices;

import java.util.Arrays;

public class Primitiva {

    private int[] primitiva;

    public Primitiva(){
        primitiva = new int[6];
        Bombo bombo = new Bombo(49);
        for (int i = 0; i < primitiva.length ; i++) {
            primitiva[i] = bombo.sacarBola();
        }
    }

    public int getNumero(int numero){
        if (numero >5 || numero <0){
            System.out.println("Elige un número que esté comprendido entre [1-4]");
        }else {
            return primitiva[numero];
        }
        return numero;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Primitiva other = (Primitiva) obj;
        return Arrays.equals(this.primitiva, other.primitiva);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Arrays.hashCode(this.primitiva);
        return super.hashCode();
    }

    @Override
    public String toString() {
        return Matrices.toText(primitiva);
    }
}
