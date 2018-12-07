package practice_problems.euclidian_algorithms;
/*
 * Created by onkartalekar on 11/15/2018
 */

public class Runner {

    public static void main(String... args) {
        System.out.println(GCD.calcGCDRecursive(110, 15));
        System.out.println(GCD.calcGCDIterative(11, 15));

        System.out.println(LCM.calcLCM(110, 15));
        System.out.println(LCM.calcLCM(11, 15));
        System.out.println(LCM.calcLCM(8, 4));
    }
}
