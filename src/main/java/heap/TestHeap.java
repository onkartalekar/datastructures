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
        } else if (data >= items[0]) {
            items[0] = data;
        } else {
            positionElementInHeap(data);
        }
    }

    private void positionElementInHeap(int data) {
        int index = 0;
        while (data < items[index] && data <= leftChild(index) && data <= rightChild(index)){
            index = leftChild(index) < rightChild(index) ? getLeftChildIndex(index) : getRightChildIndex(index);
        }

        // replace largest child
        int newElementIndex = leftChild(index) > rightChild(index) ? getLeftChildIndex(index) : getRightChildIndex(index);
        items[newElementIndex] = data;

    }

    private void heapifyDown() {
        for (int index = size / 2; index >= 0; index--) {
            while (shouldHeapifyDown(index)) {
                int leftChild = getLeftChildIndex(index) < size ? leftChild(index) : Integer.MIN_VALUE;
                int rightChild = getRightChildIndex(index) < size ? rightChild(index) : Integer.MIN_VALUE;
                int maxChildIndex = leftChild > rightChild ? getLeftChildIndex(index) : getRightChildIndex(index);
                swap(index, maxChildIndex);
                index = maxChildIndex;
            }
        }
    }

    private boolean shouldHeapifyDown(int index) {
        int leftChild = getLeftChildIndex(index) < size ? leftChild(index) : Integer.MIN_VALUE;
        int rightChild = getRightChildIndex(index) < size ? rightChild(index) : Integer.MIN_VALUE;
        return items[index] < Math.max(leftChild, rightChild);
    }

    private void swap(int index, int maxChildIndex) {
        int temp = items[index];
        items[index] = items[maxChildIndex];
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
