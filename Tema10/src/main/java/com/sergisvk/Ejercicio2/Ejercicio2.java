package com.sergisvk.Ejercicio2;
import java.util.ArrayList;
import java.util.HashMap;

public class Ejercicio2  implements IEstadisticas {
    private int NUM_ARRAY = 20;
    private ArrayList<Double> array = new ArrayList<>(NUM_ARRAY);

    public Ejercicio2(){

        //El número más repetido es el 2, el más pequeño es el 1 y el más grande es el 3
        array.add(2.0);
        array.add(2.0);
        array.add(3.0);
        array.add(1.0);

        //Imprimimos los resultados
        System.out.println("El minimo es: " + minimo());
        System.out.println("El máximo es:" + maximo());
        System.out.println("El sumatorio es:" + sumatorio());
        System.out.println("La media es:" + media());
        System.out.println("La moda es: "+ moda());
    }

    /**
     *
     * @return devuelve el mímino de los valores intruccidos
     */
    @Override
    public double minimo() {
        double min = Double.MAX_VALUE;
        for (Double aDouble : array) {
            if (aDouble < min) {
                min = aDouble;
            }
        }
        return min;
    }

    /**
     *
     * @return devuelve el valor más grades de todos los valores introduccidos
     */
    @Override
    public double maximo() {
        double max = Double.MIN_VALUE;
        for (Double aDouble : array) {
            if (aDouble > max) {
                max = aDouble;
            }
        }
        return max;
    }

    /**
     *
     * @return el sumatorio de todos los numeros introduccidos
     */
    @Override
    public double sumatorio() {
        double sumatorio=0;

        for (Double aDouble : array) {
            sumatorio += aDouble;
        }
        return sumatorio;
    }

    /**
     *
     * @return devuelve la media de los numeros introduccidos
     */
    @Override
    public double media() {
        return sumatorio()/array.size();
    }

    /**
     *
     * @return devolverá el número más repetido
     */
    @Override
    public double moda() {
        HashMap<Double,Integer>nuevoHasMap = new HashMap<>();
        double contadorKey = 0;
        int contadorValue = Integer.MIN_VALUE;
        for (int i = 0; i <array.size() ; i++) {

        }


    }
}
