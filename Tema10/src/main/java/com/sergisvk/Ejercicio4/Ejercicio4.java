package com.sergisvk.Ejercicio4;

public class Ejercicio4 {
    public Ejercicio4(){
        Cola<Integer> cola = new Cola<>();
        System.out.println("IsEmpty: "+cola.isEmpty());
        System.out.println("\nSize: "+cola.size());
        System.out.println("\nPeek: "+cola.peek());

        System.out.println("\nAñadir: 1, 2");
        cola.add(1);
        cola.add(2);

        System.out.println(cola.toString());

        System.out.println("\nBorrar: "+cola.remove()+", "+cola.remove());
        System.out.println(cola.toString());

        System.out.println("\nAñade: 6, 9, 8");
        cola.add(6);
        cola.add(9);
        cola.add(8);
        System.out.println(cola.toString());

        System.out.println("\nIsEmpty: "+cola.isEmpty());
        System.out.println("\nSize: "+cola.size());
        System.out.println("\nPeek: "+cola.peek());
    }
}

