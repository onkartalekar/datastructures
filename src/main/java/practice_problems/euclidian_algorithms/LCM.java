package practice_problems.euclidian_algorithms;
/*
 * Created by onkartalekar on 11/15/2018
 */

public class LCM {

    public static int calcLCM(int one, int two) {
        return one * two / GCD.calcGCDIterative(one, two);
    }
}
