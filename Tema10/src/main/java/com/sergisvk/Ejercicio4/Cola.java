package com.sergisvk.Ejercicio4;

import java.util.ArrayList;

public class Cola<T> implements ICola<T>{

    private ArrayList<T>cola;
    private

    public Cola(){
        cola = new ArrayList<>();
    }

    public String toString(){
        return cola.toString();
    }

    @Override
    public boolean add(T e) {
        cola.add(0, e);
        return true;
    }

    @Override
    public T remove() {
        return cola.remove(0);
    }

    @Override
    public int size() {
        return cola.size();
    }

    @Override
    public T peek() {
        if(!cola.isEmpty()){
            return cola.get(0);
        } else {
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        return cola.isEmpty();
    }

}
