import java.util.Scanner;



public class Act18{
	
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numDNI;
        System.out.print("Introduce tu número de DNI (Sin la letra): ");
        numDNI = teclado.nextInt();
        System.out.printf("La letra que corresponde a " + numDNI +" es: "+ getCalcularNIF(numDNI));
        teclado.close();
   }

   /**
    * 
    * @param dni
    * @return
    */
   public static char getCalcularNIF(int dni){
        String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni%23;
        return caracteres.charAt(resto);
   }
   /**
    * 
    * @param dni
    * @return caracteres [resto]
    */
   public static char getCalcularNIFArray(int dni){
        char caracteres[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int resto = dni%23;
        return caracteres[resto];
   }
}