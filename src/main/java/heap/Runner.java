package heap;
/*
 * Created by onkartalekar on 11/15/2018
 */

public class Runner {

    public static void main(String... args) {
        int[] numbers = {1, 4, -2, -8, -20, -6};
        TestHeap heap = new TestHeap();
        for (int number : numbers) {
            heap.add(number);
        }

        for (int i : heap.getItems()) {
            System.out.println(i);
        }
    }
}
