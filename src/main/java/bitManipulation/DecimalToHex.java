package bitManipulation;

import java.util.Stack;

/**
 * Created by taleko01 on 11/15/2018
 */

public class DecimalToHex {

    public static void main(String... args) {
        int input = 256;
        Stack<Character> characters = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();

        while (input != 0) {
            int reminder = input % 16;
            char c = reminder < 10 ? Character.forDigit(reminder, 10) : (char) (reminder - 10 + 'A');
            characters.push(c);
            input /= 16;
        }

        while (!characters.isEmpty()) {
            String charValue = characters.pop().toString();
            stringBuilder.append(charValue);
        }

        System.out.println(stringBuilder.toString());
    }
}
