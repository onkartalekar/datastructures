/**
 * @author taleko01
 */

public class DuplicateChars {
	
	public static void main(String[] args) {
		String input = "a/b/c/d";
		boolean[] flags = new boolean[256];
		
		for (int index = 0; index < input.length(); index++) {
			char charAtIndex = input.charAt(index);
			if (flags[charAtIndex]) {
				input = input.substring(0, index) + input.substring(index + 1, input.length());
				index--;
			} else {
				flags[charAtIndex] = true;
			}
		}
		
		System.out.println(input);
	}
	
}
