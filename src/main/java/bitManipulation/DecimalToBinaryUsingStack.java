package bitManipulation;

import stack.BasicStack;

/**
 * @author taleko01
 */

public class DecimalToBinaryUsingStack {
	
	public static void main(String[] args) {
		int integer= 100659;
		BasicStack basicStack = new BasicStack();
		StringBuffer binary = new StringBuffer();
		
		// convert integer part to binary
		for (; integer != 0; integer /= 2) {
			basicStack.push(integer % 2);
		}
		
		while(basicStack.getTop()!=null){
			binary.append(basicStack.pop());
		}
		
		System.out.println(binary.toString());
	}
	
}
