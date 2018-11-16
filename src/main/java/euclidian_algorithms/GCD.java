package euclidian_algorithms;
/*
 * Created by onkartalekar on 11/15/2018
 */

public class GCD {

    public static int calcGCDRecursive(int one, int two) {
        if (one == 0) {
            return two;
        }
        return calcGCDRecursive(two % one, one);
    }

    public static int calcGCDIterative(int numOne, int numTwo) {
        int temp;
        while (numOne != 0) {
            temp = numOne;
            numOne = numTwo % numOne;
            numTwo = temp;
        }
        return numTwo;

    }
}
