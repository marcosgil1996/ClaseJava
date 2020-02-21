package com.sergisvk.Ejercicio3;
import java.util.ArrayList;

public abstract class Pila <P> implements IPila<String> {
    private ArrayList<P>arrayList;

    public Pila(){
        arrayList = new ArrayList<>();
    }
    public Pila(int numero){
        arrayList = new ArrayList<>(numero);
    }

    @Override
    public String push(String e) {
        arrayList.add((P) e);
        return e;
    }

    @Override
    public String pop(String P) {
        P cadena = arrayList.get(arrayList.size()-1);
        arrayList.remove(arrayList.size()-1);
        return (String) cadena;
    }

    @Override
    public int size() {
        return arrayList.size();
    }

    @Override
    public String top() {
        return (String) arrayList.get(arrayList.size()-1);
    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }
}
