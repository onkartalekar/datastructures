package linkedlist;

import common.Node;

import java.util.HashSet;
import java.util.Set;

/**
 * @author taleko01
 */

public class LoopLinkedList {
	
	public static void main(String[] args) {
		Node head = LinkedListUtils.buildLinkedList();
		Node beginingOfLoop = findBeginingOfLoop(head);
		if (beginingOfLoop != null) {
			System.out.println(beginingOfLoop.getData());
		}
	}
	
	private static Node findBeginingOfLoop(Node head) {
		Node beginingOfLoop = null;
		Set<Integer> listData = new HashSet<>();
		
		while (head != null) {
			if (listData.add(head.getData())) {
				head = head.getNext();
			} else {
				beginingOfLoop = head;
				break;
			}
		}
		
		return beginingOfLoop;
	}
}
