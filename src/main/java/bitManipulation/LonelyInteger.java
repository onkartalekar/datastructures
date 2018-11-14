package bitManipulation;

/**
 * @author taleko01
 */

public class LonelyInteger {
	
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 6, 3, 5, 8, 4, 2, 4, 5, 1, 6};
		int result = 0;
		
		for (int index = 0; index < numbers.length; index++) {
			result = result ^ numbers[index];
		}
		
		System.out.println(result);
	}
}
