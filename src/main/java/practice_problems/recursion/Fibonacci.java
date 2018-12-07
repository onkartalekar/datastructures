package practice_problems.recursion;

/**
 * @author taleko01
 */

public class Fibonacci {
	
	public static void main(String[] args) {
		int num = 50;
		long start = System.currentTimeMillis();
		System.out.println(start);
		System.out.println(fibRecursive(num));
		System.out.println(System.currentTimeMillis() - start);
		
		start = System.currentTimeMillis();
		System.out.println(start);
		System.out.println(fibIterative(num));
		System.out.println(System.currentTimeMillis() - start);
	}
	
	private static long fibIterative(int i) {
		long[] fib = new long[i];
		fib[0] = 1;
		fib[1] = 1;
		for (int index = 2; index < i; index++) {
			fib[index] = fib[index - 1] + fib[index - 2];
		}
		
		return fib[i - 1];
	}
	
	private static long fibRecursive(int i) {
		if (i < 2) {
			return i;
		}
		return fibRecursive(i - 1) + fibRecursive(i - 2);
	}
}
