package com.sergisvk.tema9.Ejercicio5;
import com.sergisvk.tema9.utils.Lib;
import com.sergisvk.tema9.utils.Log;

public class Ejercicio5 {
    public Ejercicio5() {
        String nombre;
        int edad = 0;
        float estatura = 0;
        int alumnosRestantes = 0;
        boolean validado = false;
        Alumnos[] alumnos;
        int i = 0;
        do {
            System.out.println("*** GESTIÓN DE ALUMNOS ***");
            System.out.print("Número de alumnos: ");
            try {
                alumnosRestantes = Integer.parseInt(Lib.lector.nextLine());
                validado = alumnosRestantes > 0;
            } catch (NumberFormatException nfe) {
                Log.e("Introduzca el número de alumnos");
            }
        } while (!validado);
        alumnos = new Alumnos[alumnosRestantes];
        while (alumnosRestantes > 0) {
            System.out.print("Nombre: ");
            nombre = Lib.lector.nextLine();
            do {
                try {
                    System.out.print("Edad: ");
                    edad = Integer.parseInt(Lib.lector.nextLine());
                    validado = edad > 0 && edad < 120;
                    if(!validado) {
                        Log.e("La edad debe ser un número entre 0 y 120");
                    }
                } catch (NumberFormatException nfe) {
                    validado = false;
                    Log.e("La edad debe ser un número entre 0 y 120");
                }
            } while (!validado);
            do {
                try {
                    System.out.print("Estatura: ");
                    estatura = Float.parseFloat(Lib.lector.nextLine());
                    validado = estatura > 0.3 && estatura < 2.5;
                    if(!validado) {
                        Log.e("La estatura debe ser un número real entre 0.3 y 2.5");
                    }
                } catch (NumberFormatException nfe) {
                    validado = false;
                    Log.e("La estatura debe ser un número real entre 0.3 y 2.5");
                }
            } while (!validado);
            alumnos[i] = new Alumnos(nombre, edad, estatura);
            alumnosRestantes--;
            i++;
        }

        Alumnos alumnoMayor = alumnos[0];
        System.out.println(alumnoMayor.toString());
        for(i = 1; i < alumnos.length; i++) {
            System.out.println(alumnos[i].toString());
            if(alumnos[i].getEdad() > alumnoMayor.getEdad()) {
                alumnoMayor = alumnos[i];
            }
        }

        System.out.println("El alumno mayor es " + alumnoMayor.toString());
    }
}
