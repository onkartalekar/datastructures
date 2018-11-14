package linkedlist;

import common.Node;

/**
 * @author taleko01
 */

public class NthElementFromTail {
	
	public static void main(String[] args) {
		Node head = LinkedListUtils.buildLinkedList();
		System.out.println(head);
		int n = 5;
		
		Node first = head;
		Node nth = head;
		
		for (int index = 0; index < n - 1; index++) {
			if (nth.getNext() != null) {
				nth = nth.getNext();
			}
		}
		
		while (nth.getNext() != null) {
			first = first.getNext();
			nth = nth.getNext();
		}
		
		System.out.println(first);
	}
}
