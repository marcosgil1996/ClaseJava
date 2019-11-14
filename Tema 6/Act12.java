/**
 * Act12
 */
import java.util.Random;

public class Act12 {

    public enum Notas{
        SOBRESALIENTE, NOTABLE, BIEN, SUFICIENTE, INSUFICIENTE, ERROR;
    }
    public static void main(String[] args) {
        final int NOTA_FINAL = 51;
        System.out.println("=== Notas ===");
        getImpresion(NOTA_FINAL);
        System.out.println("=== === === ===");
    }
    /**
     * 
     * @param min
     * @param max
     * @return
     */
    public static float randomNumber(float min, float max){
        
        Random rnd = new Random(); //Invocamos la clase ramdom
        return min + rnd.nextFloat()*(max-min);
    }
    /**
     * 
     * @param usuarios
     */
    public static void getImpresion(int usuarios){
       
        int numeroAle = 5;
        String user = "Usuarios";
        

        for(float i = 0; i < usuarios; i++){
            numeroAle = randomNumber(0,10);

            System.out.printf("%-5s%-2d%5d\n",user,i, numeroAle, Notas); 
        }
    }
    static Calificaciones{
        
    }
}