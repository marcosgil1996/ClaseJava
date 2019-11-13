import java.util.Random;


public class Act11 {

    public static void main(String args[]){

        final int NUMERO_PARTIDOS = 16;
        System.out.println("=== QUINELA ===");
        printQuimiela(NUMERO_PARTIDOS);
        System.out.println("=== === === ===");
      
           
    }


    /**
     * Método para generar un número aleatorio entre un valor min y un máximo pasados como parámetro. 
     * @param randomNumber
     * @return un número aleatorio
     */
    public static int randomNumber(int randomNumber){
        
        Random rnd = new Random(); //Invocamos la clase ramdom
        randomNumber = rnd.nextInt(3 - 1 + 1) + 1;
        return randomNumber; //Retorno de carga de ramdomNumber

    }


    /**
     * 
     * @param partidos
     * @return la impresión de la quinela
     */


    public static void printQuimiela(int partidos){
       
        int numeroAle = 5;
        String tab = "Partido";
        String empate = "X";

        for(int i = 1; i < partidos; i++){
            numeroAle = randomNumber(numeroAle);
            if (numeroAle == 3){
                System.out.printf("%-5s%-2d%5s\n",tab,i, empate);
                
            }else{
                System.out.printf("%-5s%-2d%5d\n",tab,i, numeroAle);
            }
        }
    }

}