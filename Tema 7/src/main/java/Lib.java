public class Lib {
    /**
     *
     * @param a
     * @return Sumatorio / entre la cantidad de valores introduccidos
     */
    public static double media(double[] a){
        double suma = 0;
        for (double v : a) {
            suma = suma + v;
        }
        return suma / a.length;
    }



}
