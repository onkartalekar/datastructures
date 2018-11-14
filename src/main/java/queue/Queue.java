package queue;

import common.Node;

/**
 * @author taleko01
 */

public abstract class Queue {
	
	public abstract void enqueue(int data);
	
	public abstract int dequeue();
	
	public abstract Node getFirst();
	
	public abstract Node getLast();
}
