import java.util.Scanner; //importamos la clase Scanner

public class Practica{
    public static void main(String[] args) {
        //Variables que vamos a gastar
        int opcion; //opciones del menú
        int primerNumero, segundoNumero; //los valores que dará el usuario cuan vaya ha realizar las operaciones
        boolean salir= true; //
        double resultado;

        //Invocamos el scanner
        Scanner teclado = new Scanner(System.in);
        
        while (salir) {
            
            //Menú Principal y interfaz de la calculadora
            System.out.println("CALCULADORA TERMINAL");
            System.out.println("- - - - - - - - - - - - ");
            System.out.println("ELIGE UNA OPCIÓN");
            System.out.println(" 1. SUMAR \n 2. RESTAR \n 3. MULTIPLICAR \n 4. DIVIDIR \n 5. RESTO DIVISIÓN");
            System.out.println("- - - - - - - - - - - - ");
            System.out.println("0. SALIR");
            opcion = teclado.nextInt(); //Pedimos al scanner que nos lea la elección de usuario
            teclado.nextLine(); // Salto de línea
            
            switch (opcion) {
                case 0:
                    System.out.println("Cerrando la calculadora. . . ");
                    salir= false; // Cerramos la calculadora y el programa 
                    break;
                case 1: //SUMA
                    System.out.println("Has saleccionado la Suma: \n Introduce el primer numero numero a sumar"); //Le pedimos los datos al usuario por primera vez
                    primerNumero = teclado.nextInt(); //Guardamos el numero del usuario para hacer la suma
                    teclado.nextLine();
                    System.out.println("Introduce el segundo numero numero a sumar"); //Le pedimos los datos al usuario por segunda vez
                    segundoNumero = teclado.nextInt(); //Guardamos el numero del usuario para hacer la suma
                    teclado.nextLine();
                    resultado = primerNumero + segundoNumero; //Realizamos la suma de los dos numeros solicitados por el usuario
                    System.out.println("El resultado es: " + resultado); //Mostramos al usuario el resultado de su suma
                    resultado = 0; //Restablecemos el valor del resultado a cero
                    System.out.println("Pulsa cualquier botón para volver al Menú principal"); //Le mandamos al usuario al menú principal para seleccione otra opción
                    teclado.nextLine();
                    
                    break;
                case 2: //RESTA
                    System.out.println("Has saleccionado Restar: \n Introduce el primer numero numero a restar"); //Le pedimos los datos al usuario por primera vez
                    primerNumero = teclado.nextInt(); //Guardamos el numero del usuario para hacer la resta
                    teclado.nextLine();
                    System.out.println("Introduce el segundo numero numero a restar");//Le pedimos los datos al usuario por segunda vez
                    segundoNumero = teclado.nextInt(); //Guardamos el numero del usuario para hacer la resta
                    teclado.nextLine();
                    resultado = primerNumero - segundoNumero; //Realizamos la resta de los dos numeros solicitados por el usuario
                    System.out.println("El resultado es: " + resultado); //Mostramos al usuario el resultado de su resta
                    resultado = 0; //Restablecemos el valor del resultado a cero
                    System.out.println("Pulsa cualquier botón para volver al Menú principal"); //Le mandamos al usuario al menú principal para seleccione otra opción
                    teclado.nextLine();
                    break;
                case 3: //MULTIPLIACIÓN
                    System.out.println("Has saleccionado la Multiplicar: \n Introduce el primer numero numero a multiplicar"); //Le pedimos los datos al usuario por primera vez
                    primerNumero = teclado.nextInt(); //Guardamos el numero del usuario para hacer la multiplicación
                    teclado.nextLine();
                    System.out.println("Introduce el segundo numero numero a multiplicar");
                    segundoNumero = teclado.nextInt(); //Guardamos el numero del usuario para hacer la multiplicación
                    teclado.nextLine();
                    resultado = primerNumero * segundoNumero; //Mostramos al usuario el resultado de su multiplicación
                    System.out.println("El resultado es: " + resultado); //Mostramos al usuario el resultado de su multiplicación
                    resultado = 0; //Restablecemos el valor del resultado a cero
                    System.out.println("Pulsa cualquier botón para volver al Menú principal"); //Le mandamos al usuario al menú principal para seleccione otra opción
                    teclado.nextLine();
                    break;
                case 4: //DIVISIÓN
                    System.out.println("Has saleccionado la Divisón: \n Introduce el primer numero numero a dividir"); //Le pedimos los datos al usuario por primera vez
                    primerNumero = teclado.nextInt(); //Guardamos el numero del usuario para hacer la división
                    teclado.nextLine();
                    System.out.println("Introduce el segundo numero numero a dividir");
                    segundoNumero = teclado.nextInt(); //Guardamos el numero del usuario para hacer la división
                    teclado.nextLine();
                    resultado = primerNumero / segundoNumero; //Mostramos al usuario el resultado de su división
                    System.out.println("El resultado es: " + resultado); //Mostramos al usuario el resultado de su división
                    resultado = 0; //Restablecemos el valor del resultado a cero
                    System.out.println("Pulsa cualquier botón para volver al Menú principal"); //Le mandamos al usuario al menú principal para seleccione otra opción
                    teclado.nextLine();
                    break;
                case 5: //RESTO DE LA DIVISIÓN
                    System.out.println("Has saleccionado el Resto de la División: \n Introduce el primer numero numero a dividir"); //Le pedimos los datos al usuario por primera vez
                    primerNumero = teclado.nextInt(); //Guardamos el numero del usuario para hacer la división
                    teclado.nextLine();
                    System.out.println("Introduce el segundo numero numero a dividir");
                    segundoNumero = teclado.nextInt(); //Guardamos el numero del usuario para hacer el resto de su división
                    teclado.nextLine();
                    resultado = primerNumero % segundoNumero; //Mostramos al usuario el resultado del resto de la división
                    System.out.println("El resto de la división es: " + resultado); //Mostramos al usuario el resultado del resto de su división
                    resultado = 0; //Restablecemos el valor del resultado a cero
                    System.out.println("Pulsa cualquier botón para volver al Menú principal"); //Le mandamos al usuario al menú principal para seleccione otra opción
                    teclado.nextLine();
                    break;
                default: //FUERA DE LOS PARAMETROS DEFINIDOS
                    System.out.println("Has saleccionado un número no valido porfavor seleccione un numero de 0 a 5"); //Le recordamos al usuario que escriba valores entre 0-5
                    System.out.println("Pulsa cualquier botón para volver al Menú principal"); //Le decimos que pulse cualquier botón para continuar
                    teclado.nextLine();
                 break;
                
            }
            
        }
        teclado.close(); //Cerramos el teclado
    
        
    }
}