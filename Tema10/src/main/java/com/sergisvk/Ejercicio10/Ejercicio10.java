package com.sergisvk.Ejercicio10;
import com.sergisvk.util.Lib;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ejercicio10 {
    private Scanner lector = new Scanner(System.in);
    private Empresa empresa = new Empresa();

    public Ejercicio10() {
        int opcionMenu;
        Lib.limpiarPantalla();
        do {
            opcionMenu = menu();
            switch (opcionMenu) {
                case 0:
                    System.out.println("Hasta la proxima!");
                    break;
                case 1:
                    op1();
                    break;
                case 2:
                    op2();
                    break;
                case 3:
                    op3();
                    break;
                case 4:
                    op4();
                    break;
                case 5:
                    op5();
                    break;
                case 6:
                    consultas();
                    break;
            }
            Lib.limpiarPantalla();
        } while (opcionMenu != 0);

    }

    /**
     * Menú principal de usuario
     *
     * @return un número entre 0-6
     */
    private int menu() {
        int opcion;
        do {
            System.out.println("*********************");
            System.out.println("* GESTIÓN EMPLEADOS *");
            System.out.println("*********************");
            System.out.println("1. Nuevo empleado");
            System.out.println("2. Nuevo hijo");
            System.out.println("3. Modificar sueldo");
            System.out.println("4. Borrar empleado");
            System.out.println("5. Borrar hijo");
            System.out.println("6. Consultas");
            System.out.println("---------------------");
            System.out.println("0. Salir");
            opcion = lector.nextInt();
            lector.nextLine();
        } while (opcion < 0 || opcion > 6);
        return opcion;
    }

    /**
     * Agregar un nuevo empleado a la lista
     */
    public void op1() {
        String dni;
        String nombre;
        String apellidos;
        GregorianCalendar fechaNac = new GregorianCalendar();
        float sueldo;
        boolean haveHijo;
        char aux;
        int numHijos;
        System.out.println("== NUEVO EMPLEADO ==");
        System.out.println("DNI: ");
        dni = lector.nextLine();
        if (empresa.isEmpleado(dni)) {
            System.out.println("El empleado ya esta registrado");
        } else {
            System.out.print("Nombre: ");
            nombre = lector.nextLine();
            System.out.print("Apellidos: ");
            apellidos = lector.nextLine();
            System.out.print("Sueldo: ");
            sueldo = lector.nextFloat();
            lector.nextLine();
            System.out.println("Cuando nacistes?");

            do {
                System.out.print("Tienes hijos?: ");
                aux = lector.nextLine().charAt(0);
            } while (aux != 'S' && aux != 's' && aux != 'n' && aux != 'N');
            haveHijo = aux == 'S' || aux == 's';
            if (haveHijo) {
                System.out.println("Cuantos hijos tienes?: ");
                numHijos = lector.nextInt();
                lector.nextLine();
                if (empresa.buscarEmpleado(dni).setHijo(numHijos)) {
                    System.out.println("Hijo/s añadidos con exito");
                } else {
                    System.out.println("ERROR Al añadir hijo/s");
                }
            }
            empresa.addEmpleado(dni, nombre, apellidos, fechaNac, sueldo, haveHijo);
        }
    }

    /**
     * opción de añadir hijos a un emplado ya registrado
     */
    public void op2() {
        String dni;
        int numHijos;
        System.out.println("NUEVO HIJO");
        System.out.println(" ");
        System.out.print("DNI: ");
        dni = lector.nextLine();
        if (empresa.isEmpleado(dni)) {
            System.out.println("Cuantos hijos quieres añadir?: ");
            numHijos = lector.nextInt();
            empresa.buscarEmpleado(dni).setHijo(numHijos);
            System.out.println("Hijos añadidos con exito!");
        } else {
            System.out.println("El dni no esta registrado");
        }
    }

    /**
     * Modifica el sueldo del empleado,
     */
    public void op3() {
        String dni;
        float sueldo;
        System.out.println("MODIFICAR SUELDO");
        System.out.println(" ");
        System.out.print("DNI: ");
        dni = lector.nextLine();

        if (empresa.isEmpleado(dni)) {
            System.out.print("Cual es el nuevo sueldo?: ");
            sueldo = lector.nextFloat();
            empresa.modificarSueldo(dni, sueldo);
            System.out.println("Sueldo modificado con exito!");
        } else {
            System.out.println("El dni no esta registrado");
        }
    }

    public void op4() {
        String dni;
        System.out.println("BORRAR EMPLEADO");
        System.out.println(" ");
        System.out.print("DNI: ");
        dni = lector.nextLine();
        if (empresa.isEmpleado(dni)) {
            empresa.removeEmpleado(dni);
            System.out.println("Empleado borrado con exito!");
        } else {
            System.out.println("El dni no esta registrado");
        }

    }

    /**
     * Borrar un hijo de un empleado anteriormente ya registrado
     */
    public void op5() {
        String dni;
        String nombre;
        System.out.println("BORRAR HIJO");
        System.out.println();
        System.out.print("DNI: ");
        dni = lector.nextLine();
        if (empresa.isEmpleado(dni)) {
            System.out.print("Cual es el nombre del hijo que quieres borrar?: ");
            nombre = lector.nextLine();
            empresa.removeHijoEmpleado(dni, nombre);
            System.out.println("Hijo de empleado borrado con exito!");
        } else {
            System.out.println("El dni no esta registrado");
        }
    }

    private void consultas(){
        int opcion;
        int i;
        do {
            opcion = menuConsultas();
            switch (opcion) {
                case 0:
                    System.out.println("Hasta la proxima!");
                    break;
                case 1:
                    //Busqueda por NIF
                    break;
                case 2:
                    //Busqueda por num
                    break;
                case 3:
                    //Busqueda por rango edad
                    break;
                case 4:
                    //Busqueda por sueldo
                    break;
                case 5:
                    //buscar por hijos menores edad
                    break;
            }
            Lib.limpiarPantalla();
        } while (opcion != 0);
    }

    private int menuConsultas() {
        int opcion;
        do {
            System.out.println("*********************");
            System.out.println("* CONSULTAS DE LOS EMPLADOS *");
            System.out.println("*********************");
            System.out.println("1. Buscar por NIF");
            System.out.println("2. Buscar por número");
            System.out.println("3. Buscar por rango de edad");
            System.out.println("4. Buscar por rango de sueldo");
            System.out.println("5. Buscar por hijos menor de edad");
            System.out.println("---------------------");
            System.out.println("0. Salir");
            opcion = lector.nextInt();
            lector.nextLine();
        } while (opcion < 0 || opcion > 5);
        return opcion;

    }
}