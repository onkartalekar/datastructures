package practice_problems.bitManipulation;

/**
 * @author taleko01
 */

import java.util.Scanner;

public class MarsExploration {
	
	private static final String MESSAGE = "SOS";
	
	static int marsExploration(String s) {
		// Complete this function
		int numberOfMessagesAltered = 0, repeat = s.length() / MESSAGE.length();
		StringBuffer expectedMessage = new StringBuffer();
		
		for (int index = 0; index < repeat; index++) {
			expectedMessage.append(MESSAGE);
		}
		
		for (int index = 0; index < expectedMessage.toString().length(); index++) {
			if ((expectedMessage.charAt(index) ^ s.charAt(index)) > 0) {
				numberOfMessagesAltered++;
			}
		}
		
		return numberOfMessagesAltered;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int result = marsExploration(s);
		System.out.println(result);
		in.close();
	}
}
