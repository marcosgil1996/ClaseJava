/**
 * Act07 Escribe un programa que haciendo uso de dos bucles anidados muestre la siguiente salida por
*  pantalla:
 */
public class Act07 {

    public static void main(String[] args) {
        String s ="";
        String s2 ="";
        
        for(int i = 1; i<=9;i++){
            s = s + i;
            System.out.printf("%9s", s);
            s2="";
            for(int j = s.length()-1;j<=0;j--){
                s2 = s2 + s.charAt(j);
            }
            System.out.printf("%-9s", s);
        }

        
    }
}