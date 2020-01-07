/**
 *
 */


import java.util.Random;

public class Ejercicio29 {

    public Ejercicio29(){

        double[][] studentsNotes = new double [20][3];
        fillMatrix(studentsNotes);
        displayMatrix(studentsNotes);
    }

    public static void fillMatrix(double[][] notes){

        Random rnd = new Random();

        for(int i = 0; i < notes.length; i++){
            for(int j = 0; j < notes[i].length; j++){
                notes[i][j] =  + rnd.nextDouble() * 10;
            }
        }
    }

    public static void printMatrix(){

    }

    public static void displayMatrix(double[][] matrix){

        double note = 0;
        int aluNumber = 1;
        String space = "";
        String name = "ALUMNO";
        System.out.printf("%5s"+ "MOD1"+"MOD2" +"MOD3\n",space);

        for(int i = 0; i < matrix.length; i++){
            System.out.printf("%s%3d", name,aluNumber);
            aluNumber++;
            for(int j = 0; j < matrix[i].length; j++){
                note = matrix[i][j];
                if(matrix[i][j] == matrix[0][j]){
                    //System.out.print("Prueba");
                }
                System.out.printf("\t%.2f\t",note);
            }
            System.out.println("");
        }

        /* NOTA MAXIMA Y MEDIA*/
        System.out.println("NOTA MAXIMA");
        System.out.println("MEDIA");

    }
}
