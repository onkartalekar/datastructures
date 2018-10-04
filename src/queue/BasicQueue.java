package queue;

import common.Node;

/**
 * @author taleko01
 */

public class BasicQueue extends Queue {
	
	private Node first, last;
	
	@Override
	public void enqueue(int data) {
		Node node = new Node(data);
		if (first == null) {
			first = node;
			last = first;
		} else {
			last.setNext(node);
			last = last.getNext();
		}
	}
	
	@Override
	public int dequeue() {
		int result = 0;
		if (first != null) {
			// temp pointer to first
			Node temp = new Node(-1);
			temp.setNext(first);
			
			result = first.getData();
			first = first.getNext();
			
			// clear pointers for GC collection
			temp.getNext().setNext(null);
			temp.setNext(null);
		} else {
			first = null;
			last = null;
		}
		return result;
	}
	
	@Override
	public Node getFirst() {
		return first;
	}
	
	@Override
	public Node getLast() {
		return last;
	}
}
