package stack;

import common.Node;

/**
 * @author taleko01
 */

public class BasicStack extends Stack {
	
	private Node top;
	
	@Override
	public void push(int data) {
		Node node = new Node(data);
		if (top == null) {
			this.top = node;
		} else {
			node.setNext(top);
			top = node;
		}
	}
	
	@Override
	public int pop() {
		int poppedElement = 0;
		if (top != null) {
			// temp pointer to top
			Node temp = new Node(0);
			temp.setNext(top);
			
			// pop element
			poppedElement = top.getData();
			top = top.getNext();
			
			// clear pointers for GC collection
			temp.getNext().setNext(null);
			temp.setNext(null);
		}
		return poppedElement;
	}
	
	public Node getTop() {
		return top;
	}
	
	public String printStack() {
		BasicStack reverse = new BasicStack();
		Node node = this.getTop();
		
		while (node != null) {
			reverse.push(node.getData());
			node = node.getNext();
		}
		
		return reverse.getTop() != null ? reverse.getTop().toString() : "EMPTY";
	}
	
}
