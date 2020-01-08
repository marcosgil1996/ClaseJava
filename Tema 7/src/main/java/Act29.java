/*
 * Matriz de puntación del alumnado
 */
import java.util.Random;

public class Act29 {

    //Clase Principal
    public Act29(){

        double[][] NotasAlumnado = new double [20][3];
        numMatrix(NotasAlumnado);
        displayMatrix(NotasAlumnado);
    }
    /*
     *
     */
    public static void numMatrix(double[][] notes){

        Random rnd = new Random();

        for(int i = 0; i < notes.length; i++){
            for(int j = 0; j < notes[i].length; j++){
                notes[i][j] =  + rnd.nextDouble() * 20;
            }
        }
    }

    public static void displayMatrix(double[][] matrix){

        double division = 0;
        double media = 0;
        double note = 0;
        int aluNumber = 1;
        String space = "";
        String name = "ALUMNO";
        System.out.printf("%30s \n "+ "\tMOD1"+"\tMOD2" +"\tMOD3" + "\tMEDIA\n",space);

        for (double[] doubles : matrix) {
            System.out.printf("%s%3d", name, aluNumber);
            aluNumber++;

            for (double aDouble : doubles) {
                note = aDouble;
                System.out.printf("\t%.2f\t", note);
            }
            System.out.println();

        }

        /* NOTA MAXIMA Y MEDIA*/
        System.out.println("NOTA MAXIMA: ");
        System.out.println("MEDIA: ");

    }

}
