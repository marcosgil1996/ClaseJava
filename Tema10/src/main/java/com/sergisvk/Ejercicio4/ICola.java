package com.sergisvk.Ejercicio4;

public interface ICola<T> {
    boolean add(String e);
    T remove();
    int size();
    T peek();
    boolean isEmpty();
}
