package com.sergisvk.util;

import java.util.*;

public class Lib {
    public static Scanner lector = new Scanner(System.in);

    public static void limpiarPantalla() {
        System.out.print("\u001B[H\u001B[2J");
        System.out.flush();
    }

    /**
     *  Le da tiempo al usuario para poder leer o realizar las acciones necesarias
     */
    public static void pausa() {
        System.out.println("Pulsa INTRO para continuar...");
        lector.nextLine();
    }

    public static int aleatorio() {
        Random r = new Random();
        return r.nextInt();
    }

    public static int aleatorio(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min +1 ) + min;
    }

    public static double aleatorio(double min, double max) {
        Random r = new Random();
        return min + r.nextDouble() * (max - min);
    }

    public static float aleatorio(float min, float max) {
        Random r = new Random();
        return min + r.nextFloat() * (max - min);
    }

    public static void aleatrioSinRepetir(){
        // Metemos en una lista los números del 1 al 49.
        List<Integer> numbers = new ArrayList<>(49);
        for (int i=1;i<50;i++){
            numbers.add(i);
        }

        // Instanciamos la clase Random
        Random random = new Random();

        // Mientras queden numeros
        while (numbers.size()>1){
            // Elegimos un índice al azar, entre 0 y el número
            int randomIndex = random.nextInt(numbers.size());

            // Damos al jugador (sacamos el número por pantalla)
            System.out.println("No repitas numeros "+numbers.get(randomIndex));

            // Y eliminamos la carta del mazo (la borramos de la lista)
            numbers.remove(randomIndex);
            // Conjunto de números ya usados
            Set<Integer> alreadyUsedNumbers = new HashSet<>();

            // Vamos a generar 10 números aleatorios sin repetición
            while (alreadyUsedNumbers.size()<10) {

                // Número aleatorio entre 0 y 40, excluido el 40.
                int randomNumber = random.nextInt(40);

                // Si no lo hemos usado ya, lo usamos y lo metemos en el conjunto de usados.
                if (!alreadyUsedNumbers.contains(randomNumber)){
                    System.out.println("Not Repeated Random Number "+randomNumber);
                    alreadyUsedNumbers.add(randomNumber);
                }
            }
        }
    }

    public static void esperar(int segundos){
        try {
            Thread.sleep(segundos * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

