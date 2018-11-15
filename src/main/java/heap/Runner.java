package heap;
/*
 * Created by onkartalekar on 11/15/2018
 */

public class Runner {

    public static void main(String... args) {
        int[] numbers = {1, 4, -2};
        TestHeap heap = new TestHeap(3);
        for (int number : numbers) {
            heap.add(number);
        }

        for (int i : heap.getItems()) {
            System.out.println(i);
        }
    }
}
