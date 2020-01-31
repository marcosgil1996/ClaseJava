package com.sergisvk.tema8.pilascolas.Ejercicio1;

public class Pila {
    private static final int INITIAL_SIZE = 10;
    private double[] datos;
    private int nElementos;

    /**
     * Constructor para crear una pila vacía que tiene una longitud inicial.
     */
    public Pila(){
        this(INITIAL_SIZE);
    }

    /**
     * Constructor para crear una pila vacía con la longitud que nos indiquen.
     * @param size Longitud del array.
     */
    public Pila(int size) {
        datos = new double[size];
        nElementos = 0;
    }

    /**
     * Método que devuelve el número de elementos de la pila.
     * @return El número de elementos de la pila.
     */
    public int size(){
        return nElementos;
    }

    /**
     * Método booleano que devuelve true si la pila está vacía y false en caso contrario.
     * @return True o false para saber si hay algún elemento en la pila.
     */
    public boolean empty(){
        return nElementos == 0;
    }

    /**
     * Método que lee y saca el elemento superior de la pila.
     * @return El elemento superior de la pila.
     */
    public double pop(){
        double resultado = 0;
        if(!empty()){
            resultado = datos[nElementos-1];
            nElementos--; //Con esta línea se realiza la extracción del elemento.
        }
        return resultado;
    }

    /**
     * Método que lee el elemento superior de la pila sin sacarlo.
     * @return El elemento superior de la pila.
     */
    public double top(){
        double resultado = 0;
        if(!empty()){
            resultado = datos[nElementos-1];
        }
        return resultado;
    }

    /**
     * Método que crea otro array igual pero duplicando/doblando el tamaño cuando el primero exceda su límite.
     * @param datos El contenido del array.
     * @return El array duplicado.
     */
    public double[] duplicarArray(double[] datos){
        double[] segundoArray = new double[datos.length*2];
        System.arraycopy(datos, 0, segundoArray, 0, datos.length);
        return segundoArray;
    }

    /**
     * Métpdp que añade un elemento a la pila.
     * @param introducirArray Datos para introducir en el array.
     */
    public void push(double introducirArray){
        if (nElementos==datos.length){
            datos = duplicarArray(datos);
        }
        datos[nElementos] = introducirArray;
        nElementos++;
    }

    /**
     * Método que imprime el array por pantalla.
     */
    public void imprimirArray(){
        for (int i = 0; i <nElementos ; i++) {
            System.out.println(datos[i]);
        }
    }
}

