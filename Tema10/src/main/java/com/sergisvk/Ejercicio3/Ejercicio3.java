package com.sergisvk.Ejercicio3;

public class Ejercicio3 {
    public Ejercicio3() {
        Pila<String> pila = new Pila(10);

        System.out.println("Push: " + pila.push("Reunión a las 12"));
        System.out.println("Push: " + pila.push("Recuerda Sergio"));
        System.out.println("Pop: " + pila.pop());
        System.out.println("Size: " + pila.size());
        System.out.println("Top: " + pila.top());
        System.out.println("isEmpty: " + pila.isEmpty());
    }
}