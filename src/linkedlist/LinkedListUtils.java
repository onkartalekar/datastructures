package linkedlist;

import common.Node;

/**
 * @author taleko01
 */

public class LinkedListUtils {
	
	public static Node buildLinkedList() {
		Node head = new Node(1);
		head.appendToTail(2);
		head.appendToTail(3);
		head.appendToTail(4);
		head.appendToTail(5);
		head.appendToTail(6);
		return head;
	}
	
	public static Node removeNodeByData(Node head, int data) {
		Node node = head;
		if (node.getData() == data) {
			Node temp = node.getNext();
			node.setNext(null);
			return temp;
		}
		
		while (node.getNext() != null) {
			if (node.getNext().getData() == data) {
				Node temp = node.getNext().getNext();
				node.getNext().setNext(null);
				node.setNext(temp);
				break;
			}
			node = node.getNext();
		}
		return head;
	}
	
}
