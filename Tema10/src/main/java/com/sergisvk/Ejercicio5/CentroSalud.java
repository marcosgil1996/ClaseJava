package com.sergisvk.Ejercicio5;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class CentroSalud {
    private ArrayList<Paciente> pacientes;
    private Paciente paciente;

    public CentroSalud(){
        pacientes = new ArrayList<>();
    }

    public CentroSalud(int numero){
        pacientes = new ArrayList<>(numero);
    }

    public void addPaciente(String nombre, GregorianCalendar fechaNac, char sexo, float altura, float peso){
        pacientes.add(paciente = new Paciente(nombre, fechaNac, sexo, altura, peso));
    }

    public int[] menorMayor(){
        int[] menorMayor = new int[2];
        long mayor = Long.MIN_VALUE;
        long menor = Long.MAX_VALUE;
        for (int i = 0 ; i < pacientes.size() ; i++){
            if(pacientes.get(i).getFechaNacimiento().getTimeInMillis()> mayor){
                mayor = pacientes.get(i).getFechaNacimiento().getTimeInMillis();
                menorMayor[1] = i;
            }
            if(pacientes.get(i).getFechaNacimiento().getTimeInMillis() < menor){
                menor = pacientes.get(i).getFechaNacimiento().getTimeInMillis();
                menorMayor[0] = i;
            }
        }
        return menorMayor;
    }

    public int[] porSexo(){
        int[] hombreOMujer = new int[2];
        for (Paciente value : pacientes) {
            if (value.getSexo() == 'M') {
                hombreOMujer[0] += 1;
            } else {
                hombreOMujer[1] += 1;
            }
        }
        return hombreOMujer;
    }

    public void imprimirPacientes(){
        System.out.println("**** MENORES DE EDAD **** ");
        System.out.printf(" Edad: %d Sexo: %s\n", pacientes.get(menorMayor()[0]).getEdad(), pacientes.get(menorMayor()[0]).getSexo());
        System.out.printf("%d Sexo: %s\n", pacientes.get(menorMayor()[1]).getEdad(), pacientes.get(menorMayor()[1]).getSexo());
        System.out.print("\n");
        System.out.println("**** MAYORES DE EDAD");
        System.out.print("Cantidad de pacientes por sexo:\n");
        System.out.printf("Hombres: %d\tMujeres: %d", porSexo()[0], porSexo()[1]);
        System.out.print("\n");
        for (Paciente value : pacientes) {
            System.out.printf("Paciente número %d: %s.\n", value.getId(), value.getIMCMessage());
        }
    }
}
