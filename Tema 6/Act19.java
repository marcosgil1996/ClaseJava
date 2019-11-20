
public class Act19{
	
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numDNI;
        System.out.print("Introduce tu número de NIF: ");
        numDNI = teclado.nextInt();
        System.out.printf("La letra que corresponde a " + numDNI +" es: "+ getCalcularNIF(numDNI));
        teclado.close();
   }

   public static char getCalcularNIF(int dni){
        String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni%23;
        return caracteres.charAt(resto);
   }

   public static char getCalcularNIFArray(int dni){
        char caracteres[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int resto = dni%23;
        return caracteres[resto];
   }
}