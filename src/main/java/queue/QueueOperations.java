package queue;

/**
 * @author taleko01
 */

public class QueueOperations {
	
	public static void main(String[] args) {
		System.out.println("---------- Basic ---------");
		basicQueueOperations();
		System.out.println("---------- Special ---------");
		queueUsingStackOperations();
	}
	
	private static void queueUsingStackOperations() {
		QueueUsingStack queue = QueueUtils.buildSpecialQueue();
		QueueUtils.printQueue(queue);
	}
	
	
	private static void basicQueueOperations() {
		BasicQueue queue = QueueUtils.buildQueue();
		QueueUtils.printQueue(queue);
	}
}
