package anagram;

/**
 * Created by taleko01 on 11/14/2018
 */

public class AnagramCheckerSolutionTwo {

    private static int checkAnagram(String inputOne, String inputTwo) {
        String one = inputOne != null ? inputOne.toLowerCase() : "";
        String two = inputTwo != null ? inputTwo.toLowerCase() : "";

        int count = 0;
        int[] charsOne = buildCharCount(one);
        int[] charsTwo = buildCharCount(two);

        for (int index = 0; index < 26; index++) {
            count += Math.abs(charsOne[index] - charsTwo[index]);
        }

        return count;
    }

    private static int[] buildCharCount(String word) {
        int[] charsCount = new int[26];
        for (char c : word.toCharArray()) {
            charsCount[c - 'a'] = charsCount[c - 'a'] + 1;
        }
        return charsCount;
    }

    public static void main(String[] args) {
        System.out.println("Number of chars :" + checkAnagram("SOLAR", "solarorals"));
    }
}
