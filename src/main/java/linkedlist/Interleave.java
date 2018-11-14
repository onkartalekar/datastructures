package linkedlist;

import common.Node;

/**
 * @author taleko01
 */

public class Interleave {
	
	public static void main(String[] args) {
		Node first = LinkedListUtils.buildLinkedList();
		Node second = LinkedListUtils.buildLinkedList();
		Node carryForward = null;
		Node result = new Node(first.getData());
		Node currentPairTop = new Node(first.getData());
		
		while (first != null) {
			if (carryForward != null) {
				carryForward.setNext(currentPairTop);
				currentPairTop.setNext(second);
			} else {
				result.setNext(second);
			}
			
			carryForward = second;
			
			first = first.getNext();
			second = second.getNext();
			currentPairTop = first != null ? new Node(first.getData()) : null;
		}
		
		System.gc();
		
		System.out.println(result);
	}
}
