import java.util.Scanner;

public class Act13{
    public enum lenguas{
        CASTELLANO, VALENCIANO, INGLES
    }
    public static void main(String[]args){
        Scanner lector= new Scanner (System.in);
        String nombre;
        int numero;
        
        
        System.out.println("Dime tu nombre");
        nombre=lector.nextLine();

        System.out.println("Que idioma prefieres (marque el numero correspondiente)");
        System.out.println("1. Valenciano");
        System.out.println("2.Castellano");
        System.out.println("3.Inglés");

        numero=lector.nextInt();
        lector.nextLine();
        
        System.out.println(getIdioma(numero,nombre));
        lector.close();


    }
    /**
     * 
     * @param numero
     * @param nombre
     * @return
     */
    public static String getIdioma(int numero, String nombre){
        String elegido ="";
        if(numero == 1){
            elegido = "Bon dia " + nombre;
        }else if(numero ==2){
            elegido = "Buenos dias " + nombre;
        }else if(numero == 3){
            elegido="Good mornig " + nombre;
        }
        
        return elegido;
    }
}