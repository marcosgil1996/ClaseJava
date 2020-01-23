package com.sergisvk.tema8.Ejercicio7;
import com.sergisvk.tema8.Lib;

import java.util.Scanner;

public class Ejercicio7 {

    private Scanner lector;
    private Hospital hospital;
    private  Paciente paciente;
    private Config config;

    public Ejercicio7(int maxPacientes){
        lector = new Scanner(System.in);
        int opcion;

        do{
            opcion = menuPrincipal();
            switch (opcion) {
                case 1:
                    nuevoPaciente();
                    break;
                case 2:
                    //Atender paciente
                    break;
                case 3:
                    consultas(); //Redirige al menú consultas
                    break;
                case 4:
                    //Alta médica
                    break;
                case 0:
                    System.out.println("Hasta la proxima");
            }
        }while (opcion !=0);
    }

    private int menuPrincipal() {
        int opcion = -1;
        do {
            Lib.limpiarPantalla();
            System.out.println("***************************");
            System.out.println("** HOSPITAL DE URGENCIAS **");
            System.out.println("***************************");
            System.out.println("1. Nuevo paciente...");
            System.out.println("2. Atender paciente...");
            System.out.println("3. Consultas...");
            System.out.println("4. Alta médica..");
            System.out.println("---------------------------");
            System.out.println("0. Salir\n");
            System.out.println("Elija una opción: ");
            opcion = Integer.parseInt(lector.nextLine());
            if(opcion < 0 || opcion > 4) {
                System.out.println("Elija una opción del menú [0-4]");
                Lib.pausa();
            }
        } while (opcion < 0 || opcion > 4);
        return opcion;
    }
    private void nuevoPaciente(){

    }

    private int menuConsultas(){
        int opcion = -1;
        do {
            Lib.limpiarPantalla();
            System.out.println("***************************");
            System.out.println("** CONSULTAS DEL HOSPITAL **");
            System.out.println("***************************");
            System.out.println("1. Busqueda del SIP..");
            System.out.println("2. Fecha...");
            System.out.println("3. Estadísticas...");
            System.out.println("---------------------------");
            System.out.println("0. Salir\n");
            System.out.println("Elija una opción: ");
            opcion = Integer.parseInt(lector.nextLine());
            if(opcion < 0 || opcion > 3) {
                System.out.println("Elija una opción del menú [0-4]");
                Lib.pausa();
            }
        } while (opcion < 0 || opcion > 3);
        return opcion;
    }
    private void consultas(){
        int opcion;
        int i;
        do {
            opcion = menuConsultas();
            switch (opcion){
                case 1:
                    //SIP
                    break;
                case  2:
                    //Fecha
                    break;
                case 3:
                    //Estadística
            }
        }while (opcion != 0);
    }






}
