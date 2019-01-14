package practice_problems.anagram;

import java.util.Arrays;

/**
 * @author taleko01
 */

public class AnagramCheckerSolutionOne {

    private static boolean checkAnagram(String inputOne, String inputTwo) {
        String one = inputOne != null ? inputOne.toLowerCase() : "";
        String two = inputTwo != null ? inputTwo.toLowerCase() : "";
        char[] charsOne = one.toCharArray();
        char[] charsTwo = two.toCharArray();

        if (one.length() != two.length()) {
            return false;
        }

        Arrays.sort(charsOne);
        Arrays.sort(charsTwo);

        for (int index = 0; index < charsOne.length; index++) {
            if (Math.abs(charsOne[index] - charsTwo[index]) != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        if (checkAnagram("SOLAR", "orals")) {
            System.out.println("Anagram");
            return;
        }
        System.out.println("Not an practice_problems.anagram");
    }
}