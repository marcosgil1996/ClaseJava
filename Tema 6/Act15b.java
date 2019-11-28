import java.util.Scanner;
public class Act15b {
   public static Scanner lector = new Scanner(System.in);
   public static void main(String[] args) {
      int opcion;
      String s1, s2, s3;      
      do {
         opcion = mostrarMenu();        
         switch(opcion) {
            case 1:
               System.out.print("Primera paraula: ");
               s1 = lector.nextLine();
               System.out.print("Segona paraula: ");
               s2 = lector.nextLine();
               System.out.print("Tercera paraula: ");
               s3 = lector.nextLine();
               System.out.println("La paraula més llarga de " + s1 + ", " + s2 + " y " + s3 + " es " + masLarga(s1,s2,s3));
               break;
            case 2:
               System.out.print("Primera paraula: ");
               s1 = lector.nextLine();
               System.out.print("Segona paraula: ");
               s2 = lector.nextLine();
               System.out.print("Tercera paraula: ");
               s3 = lector.nextLine();
               System.out.println("La paraula més curta de " + s1 + ", " + s2 + " y " + s3 + " es " + masCorta(s1,s2,s3));
               break;
            case 3:
               System.out.print("Paraula: ");
               s1 = lector.nextLine();
               System.out.println("La paraula " + s1 + " té " + cuentaVocales(s1) + " vocals");
               break;
            case 0:
               break;
            default:
               System.out.println(opcion + " no és una opció del menú vàlida");
               break;
         }           
         if(opcion != 0) {
            System.out.println("Prem INTRO per continuar ...");
            lector.nextLine();
         }         
         borrarPantalla();
      } while(opcion != 0);
      System.out.println("Fins aviat!");
   }   

   public static int mostrarMenu() {      
      System.out.println("MENÚ PRINCIPAL");
      System.out.println("==============");
      System.out.println("1. Paraula més llarga");
      System.out.println("2. Paraula més curta");
      System.out.println("3. Nombre de vocals");
      System.out.println("--------------------------------");
      System.out.println("0. Eixir");
      System.out.print("Tria una opció: ");
      return Integer.parseInt(lector.nextLine());
   }

   public static void borrarPantalla() {
      System.out.print("\u001B[H\u001B[2J");
      System.out.flush();;
   }

   public static String masLarga(String s1, String s2, String s3) {
      String m1 = masLarga(s1,s2);
      return masLarga(m1, s3);
   }

   public static String masLarga(String s1, String s2) {
      return s1.length() > s2.length() ? s1 : s2;
   }

   public static String masCorta(String s1, String s2, String s3) {
      String m1 = masCorta(s1, s2);
      return masCorta(m1, s3);
   }

   public static String masCorta(String s1, String s2) {
      return s1.length() < s2.length() ? s1 : s2;
   }

   public static int cuentaVocales(String s) {
      int contador = 0;
      String aux = s.toLowerCase();
      for(int i = 0; i < aux.length(); i++) {
         char c = aux.charAt(i);
         switch(c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'á':
            case 'à':
            case 'é':
            case 'è':
            case 'í':
            case 'ó':
            case 'ò':
            case 'ú':
               contador++;
         }         
      }
      return contador;
   } 
}