package heap;
/*
 * Created by onkartalekar on 11/15/2018
 */

public class Runner {

    public static void main(String... args) {
        //int[] numbers = {1, 4, -2, 2, 3};
        int[] numbers = {3, 2, 10, 1, 4, 7, 8, 9, 11};
        TestHeap heap = new TestHeap(9);
        for (int number : numbers) {
            heap.add(number);
        }

        printHeap(heap);

        heap.add(15);
        printHeap(heap);

        heap.add(6);
        printHeap(heap);

        heap.add(5);
        printHeap(heap);

        heap.add(12);
        printHeap(heap);

        heap.add(10);
        printHeap(heap);
    }

    private static void printHeap(TestHeap heap) {
        System.out.println("========================");
        for (int i : heap.getItems()) {
            System.out.println(i);
        }
    }
}
