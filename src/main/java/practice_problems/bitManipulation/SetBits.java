package practice_problems.bitManipulation;

/**
 * @author taleko01
 */

public class SetBits {
	
	public static void main(String[] args) {
		int n = 50000, m = 45, i = 2, j = 6, max = ~0;
		
		int left = max - ((1 << j) - 1);
		int right = ((1 << i) - 1);
		int mask = left | right;
		int result = (n & mask) | (m << i);
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(m));
		System.out.println(Integer.toBinaryString(result));
		
	}
}
