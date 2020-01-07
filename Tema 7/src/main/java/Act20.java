/*
 *
 */

public class Act20 {

    public Act20() {

        int[] numbers = {10,2,4,5,6,7,8,3,5};
        int numero = 90;
        System.out.println(isInArray(numbers, numero));
    }

    public static boolean isInArray (int[] numbers, int number){

        boolean isInArray = false;

        for (int value : numbers) {
            if (value == number) {
                isInArray = true;
                break;
            }
        }

        return isInArray;
    }
}