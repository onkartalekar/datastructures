package practice_problems.bitManipulation;

import stack.BasicStack;

/**
 * @author taleko01
 */

public class BitUtils {
	
	public static String decimalToBinary(int decimal){
		BasicStack basicStack = new BasicStack();
		StringBuffer binary = new StringBuffer();
		
		// convert integer part to binary
		for (; decimal != 0; decimal /= 2) {
			basicStack.push(decimal % 2);
		}
		
		while(basicStack.getTop()!=null){
			binary.append(basicStack.pop());
		}
		
		return binary.toString();
	}
}
