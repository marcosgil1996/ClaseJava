/**
 * Act5
 */
public class Act5 {

    public static void main(String[] args) {
        String s ="";
        int n = 0; //contador

        for(int i =1; i<=9;i++){
            s = s + i;
            System.out.printf("\u001B[0;3"+n+"m%9s \n", s);
            System.out.println("\u001B[0;3 \u001B[0m");
            n++;

        }
    }
}