package linkedlist;

import common.Node;

/**
 * @author taleko01
 */

public class AddNumberLinkedList {
	
	public static void main(String[] args) {
		Node numberOne = new Node(9);
		numberOne.appendToTail(9);
		numberOne.appendToTail(9);
		numberOne.appendToTail(9);
		
		Node numberTwo = new Node(9);
		numberTwo.appendToTail(9);
		numberTwo.appendToTail(9);
		numberTwo.appendToTail(9);
		
		Node sum = add(numberOne, numberTwo);
		
		System.out.println(numberOne + " + " + numberTwo + " = " + sum);
	}
	
	private static Node add(Node numberOne, Node numberTwo) {
		Node sum = new Node(0);
		Node digitOne = numberOne;
		Node digitTwo = numberTwo;
		int carry = 0;
		int sumOfDigits = 0;
		boolean isHead = true;
		
		while (digitOne != null || digitTwo != null) {
			sumOfDigits = (digitOne == null ? 0 : digitOne.getData()) + (digitTwo == null ? 0 : digitTwo.getData()) + carry;
			digitOne = digitOne == null ? null : digitOne.getNext();
			digitTwo = digitTwo == null ? null : digitTwo.getNext();
			
			if (sumOfDigits > 9) {
				carry = 1;
				sumOfDigits -= 10;
			} else {
				carry = 0;
			}
			
			if (isHead) {
				sum = new Node(sumOfDigits);
				isHead = false;
			} else {
				sum.appendToTail(sumOfDigits);
			}
		}
		
		if (carry > 0) {
			sum.appendToTail(carry);
		}
		
		return sum;
	}
}
