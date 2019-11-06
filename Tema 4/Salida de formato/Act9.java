/**
 * Act9 un programa para representar los datos de una estación meteorológica. 
 */
import java.util.Scanner;
public class Act9{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Declaramos el scanner

        //Ciudad
        String ciudad = "";
        //Fechas
        int day, mes, anyo;
        //Horas
        int hour, minute, segundos;
        int velocidadViento;
        double temperatura;
        double presionAtmosferica;
        int probabilidadLluvia;
        int indiceRadaycionUV;

        System.out.print("Indica la ciudad: "); //El usuario introduce el dado de la ciudad
        ciudad = teclado.nextLine();
        
        //do-while para comprobar los datos introducidos por los usuarios son correctos

        //FECHAS

        //Comprobación para dias
        do{
            System.out.print("Introduce el dia en el que te encuentres: ");
            day = teclado.nextInt();
            teclado.nextLine();
            if(day<=0||day>31){
                System.out.println("El día introducido no es valido, entre 0-31: ");
            }
        }while(day<=0||day>31);

        //Comprobación para el mes
        do{
            System.out.print("Introduce un mes en número: ");
            mes = teclado.nextInt();
            teclado.nextLine();
            if(mes<=0||mes>12){
                System.out.println("El mes introducido no es valido, entre 1-12");
            }
        }while(mes<=0||mes>12);

        //Comprobación para el año
        do{
            System.out.print("Introduce un año: ");
            anyo = teclado.nextInt();
            teclado.nextLine();
            if(anyo<=0||anyo>9999){
                System.out.println("El año introducido no es valido.");
            }
        }while(anyo<=0||anyo>9999);

        //LINIA TEMPORAL HORA:MINUTOS:SEGUNDOS

        //Comprobación para la hora
        do{
            System.out.print("Introduce una hora: ");
            hour = teclado.nextInt();
            teclado.nextLine();
            if(hour<0||hour>23){
                System.out.println("La hora introducida no es valida.");
            }
        }while(hour<0||hour>23);

        //Comprobación para los minutos
        do{
            System.out.print("Introduce unos minutos: ");
            minute = teclado.nextInt();
            teclado.nextLine();
            if(minute<0||minute>59){
                System.out.println("Los minute introducidos no son validos.");
            }
        }while(minute<0||minute>59);

        //Comprobación para los segundos
        do{
            System.out.print("Introduce unos segundos: ");
            segundos = teclado.nextInt();
            teclado.nextLine();
            if(segundos<0||segundos>59){
                System.out.println("Los segundos introducidos no son validos.");
            }
        }while(segundos<0||segundos>59);

        //Velocidad del viento- se pide al usuario
        System.out.print("Introduce la velocidad en Km/h del viento: ");
        velocidadViento = teclado.nextInt();
        teclado.nextLine();

        //Temperatura - ºC
        System.out.print("Introduce la temperatura en Cº: ");
        temperatura = teclado.nextDouble();
        teclado.nextLine();

        //hPa
        System.out.print("Indica la presión atmosférica en hPa: ");
        presionAtmosferica = teclado.nextDouble();
        teclado.nextLine();

        //lluvia- en %
        System.out.print("Indica la probabilidad de lluvia con un número entero: ");
        probabilidadLluvia = teclado.nextInt();
        teclado.nextLine();

        //UV
        System.out.print("Indica el índice de radiacción ultravioleta con un número entero: ");
        indiceRadaycionUV = teclado.nextInt();
        teclado.nextLine();

        //RESULTADOS
        System.out.printf("\u001B[1;36;44m **  DATOS ESTACIÓN METEREOLÓGICA  ** \u001B[0m\n");
        System.out.printf("Ciudad:\t\t\t%s", ciudad);
        System.out.printf("\nFecha:\t\t\t%02d/%02d/%04d", day, mes, anyo);
        System.out.printf("\nHora de la mesura:\t%02d:%02d:%02d", hour, minute, segundos);

        //Varia el color depende de los números introduccidos
        if(velocidadViento<30){
            System.out.printf("\nVelocidad viento:\t\u001B[0;32m%d\u001B[0m km/h", velocidadViento);
        } else if(velocidadViento>=30&&velocidadViento<=60){
            System.out.printf("\nVelocidad viento:\t\u001B[0;33m%d\u001B[0m km/h", velocidadViento);
        } else if(velocidadViento>60){
            System.out.printf("\nVelocidad viento:\t\u001B[0;31m%d\u001B[0m km/h", velocidadViento);
        }

        if(temperatura<22){
            System.out.printf("\nTemperatura:\t\t\u001B[0;34m%.2f\u001B[0m Cº", temperatura);
        } else if(temperatura>=22&&temperatura<=27){
            System.out.printf("\nTemperatura:\t\t\u001B[0;32m%.2f\u001B[0m Cº", temperatura);
        } else if(temperatura>27&&temperatura<=35){
            System.out.printf("\nTemperatura:\t\t\u001B[0;33m%.2f\u001B[0m Cº", temperatura);
        } else if(temperatura>35){
            System.out.printf("\nTemperatura:\t\t\u001B[0;31m%.2f\u001B[0m Cº", temperatura);
        }

        System.out.printf("\nPresión atmosférica:\t%.1f hPa", presionAtmosferica);

        if(probabilidadLluvia<35){
            System.out.printf("\nProbabilidad lluvia:\t\u001B[0;32m%d\u001B[0m %%", probabilidadLluvia);
        } else if(probabilidadLluvia>=35&&probabilidadLluvia<=70){
            System.out.printf("\nProbabilidad lluvia:\t\u001B[0;33m%d\u001B[0m %%", probabilidadLluvia);
        } else if(probabilidadLluvia>70){
            System.out.printf("\nProbabilidad lluvia:\t\u001B[0;31m%d\u001B[0m %%", probabilidadLluvia);
        }
        if(indiceRadaycionUV<=2){
            System.out.printf("\nUVI:\t\t\t\u001B[0;32m%d\u001B[0m\n",indiceRadaycionUV);
        } else if(indiceRadaycionUV>=3&&indiceRadaycionUV<=5){
            System.out.printf("\nUVI:\t\t\t\u001B[0;34m%d\u001B[0m\n",indiceRadaycionUV);
        } else if(indiceRadaycionUV>=6&&indiceRadaycionUV<=7){
            System.out.printf("\nUVI:\t\t\t\u001B[0;33m%d\u001B[0m\n",indiceRadaycionUV);
        } else if(indiceRadaycionUV>=8&&indiceRadaycionUV<=10){
            System.out.printf("\nUVI:\t\t\t\u001B[0;31m%d\u001B[0m\n",indiceRadaycionUV);
        } else if(indiceRadaycionUV>10){
            System.out.printf("\nUVI:\t\t\t\u001B[0;35m%d\u001B[0m\n",indiceRadaycionUV);
        }
        teclado.close(); //cerramos el teclado
    }
}