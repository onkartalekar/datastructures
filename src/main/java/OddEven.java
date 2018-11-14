/**
 * Created by taleko01 on 11/2/2018
 */

public class OddEven {

    public static void main(String... args) {
        System.out.println(isEven(4));
        System.out.println(isOdd(5));
    }

    private static boolean isEven(int i) {
        int temp = i;
        if (i == 0) {
            return true;
        } else if (i == -1) {
            return false;
        } else {
            return isEven(i - 2);
        }
    }

    private static boolean isOdd(int i) {
        int temp = i;
        if (i == 0) {
            return false;
        } else {
            return isEven(i - 1);
        }
    }
}
