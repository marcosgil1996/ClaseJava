package com.sergisvk.Ejercicio3;
import java.util.ArrayList;

public class Pila <T> implements IPila<T> {
    private ArrayList<T> lista;

    public Pila(){
        lista = new ArrayList<>();
    }
    public Pila(int numero){
        lista = new ArrayList<>(numero);
    }

    @Override
    public T push(T e) {
        lista.add(e);
        return e;
    }

    @Override
    public T pop() {

    }

    @Override
    public int size() {
        return lista.size();
    }

    @Override
    public T top() {
        return lista.get(T);
    }
    @Override
    public boolean isEmpty() {
        return lista.isEmpty();
    }
}
