package queue;

import common.Node;
import stack.BasicStack;

/**
 * @author taleko01
 */

public class QueueUsingStack extends Queue {

    private BasicStack forward = new BasicStack(), backward = new BasicStack();

    @Override
    public void enqueue(int data) {
        forward.push(data);
    }

    @Override
    public int dequeue() {
        if (backward.getTop() == null) {
            while (forward.getTop() != null) {
                backward.push(forward.pop());
            }
        }
        return backward.pop();
    }

    @Override
    public Node getFirst() {
        return forward.getTop() != null ? forward.getTop() : backward.getTop();
    }

    @Override
    public Node getLast() {
        return null;
    }

}
