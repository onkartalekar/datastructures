package linkedlist;

import common.Node;

/**
 * @author taleko01
 */

public class ReverseLinkedList {
	
	public static void main(String[] args) {
		Node linkedList = LinkedListUtils.buildLinkedList();
		System.out.println(linkedList);
		
		Node reverse = reverse(linkedList);
		System.out.println(reverse);
	}
	
	private static Node reverse(Node linkedList) {
		Node reverse = new Node(linkedList.getData());
		Node reverseHead;
		while (linkedList.getNext() != null) {
			reverseHead = new Node(linkedList.getNext().getData());
			reverseHead.setNext(reverse);
			reverse = reverseHead;
			linkedList = linkedList.getNext();
		}
		return reverse;
	}
}
