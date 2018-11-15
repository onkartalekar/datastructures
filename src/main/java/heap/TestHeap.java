package heap;
/*
 * Created by onkartalekar on 11/15/2018
 */

public class TestHeap {

    private int maxSize;
    private int size = 0;

    private int[] items;

    public TestHeap(int maxSize) {
        this.maxSize = maxSize;
        items = new int[maxSize];
    }

    public int[] getItems() {
        return items;
    }

    public void add(int data) {
        if (size < maxSize) {
            items[size++] = data;
            if (size == maxSize) {
                heapifyDown();
            }
        } else if (data < items[0]) {
            items[0] = data;
            heapifyDown();
        }
    }

    private void heapifyDown() {
        int maxChildIndex = leftChild(0) > rightChild(0) ? getLeftChildIndex(0) : getRightChildIndex(0);
        swapWithRoot(maxChildIndex);
    }

    private void swapWithRoot(int maxChildIndex) {
        int temp = items[0];
        items[0] = items[maxChildIndex];
        items[maxChildIndex] = temp;
    }


   /* private int getParentIndex(int index) {
        return (index - 1) / 2;
    }*/

    private int getLeftChildIndex(int index) {
        return 2 * index + 1;
    }

    private int getRightChildIndex(int index) {
        return 2 * index + 2;
    }

    private int leftChild(int index) {
        return items[getLeftChildIndex(index)];
    }

    private int rightChild(int index) {
        return items[getRightChildIndex(index)];
    }

    /*private int parent(int index) {
        return items[getParentIndex(index)];
    }

    private boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < size;
    }

    private boolean hasRightChild(int index) {
        return getRightChildIndex(index) < size;
    }

    private boolean hasParent(int index) {
        return getParentIndex(index) >= 0;
    }*/

}
