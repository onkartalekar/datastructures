package linkedlist;

import common.Node;

import java.util.HashSet;
import java.util.Set;

/**
 * @author taleko01
 */

public class DuplicateItemLinkedList {
	
	
	public static void main(String[] args) {
		Node head = LinkedListUtils.buildLinkedList();
		System.out.println(head);
		removeDups(head);
		//head = LinkedListUtils.removeNodeByData(head, 4);
		System.out.println(head);
	}
	
	private static void removeDups(Node head) {
		Set<Integer> dataSet = new HashSet<>();
		Node node = head;
		dataSet.add(node.getData());
		
		while (node.getNext() != null) {
			if (dataSet.add(node.getNext().getData())) {
				node = node.getNext();
			} else {
				Node temp = node.getNext().getNext();
				node.getNext().setNext(null);
				node.setNext(temp);
			}
		}
	}
	
}
