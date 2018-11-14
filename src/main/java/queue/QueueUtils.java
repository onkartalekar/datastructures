package queue;

/**
 * @author taleko01
 */

public class QueueUtils {
	
	public static BasicQueue buildQueue(){
		BasicQueue queue = new BasicQueue();
		queue.enqueue(1);
		queue.enqueue(5);
		queue.enqueue(4);
		queue.enqueue(3);
		queue.enqueue(6);
		queue.enqueue(2);
		return queue;
	}
	
	public static QueueUsingStack buildSpecialQueue(){
		QueueUsingStack queue = new QueueUsingStack();
		queue.enqueue(1);
		queue.enqueue(5);
		queue.enqueue(4);
		queue.enqueue(3);
		queue.enqueue(6);
		queue.enqueue(2);
		return queue;
	}
	
	public static void printQueue(Queue queue) {
		while (queue.getFirst() != null) {
			System.out.println("==========");
			System.out.println(queue.dequeue());
		}
	}
}
