package thread;

/**
 * Created by taleko01 on 10/4/2018
 */

public class Runner {

    public static void main(String[] args) {

        RunnableThread runnableThread = new RunnableThread();
        Thread childThread = new ChildThread(runnableThread, "Runnable");
        childThread.start();

//        System.out.println(String.format("%s : %s", Thread.currentThread().getName(), childThread.getI()));

    }

}
