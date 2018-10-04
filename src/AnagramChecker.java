import java.util.Arrays;

/**
 * @author taleko01
 */

public class AnagramChecker {
	
	private static boolean checkAnagram(String inputOne, String inputTwo) {
		String one = inputOne != null ? inputOne.toLowerCase() : "", two = inputTwo != null ? inputTwo.toLowerCase() : "";
		char[] charsOne = one.toCharArray(), charsTwo = two.toCharArray();
		
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
		boolean checkAnagram = checkAnagram("SOLAR", "orals");
		
		if (checkAnagram) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not an anagram");
		}
	}
	
	
}
