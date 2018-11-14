package thread;

/**
 * Created by taleko01 on 10/4/2018
 */

public class ChildThread extends Thread {

    private Integer i = 0;

    public ChildThread(Runnable runnable, String name) {
        super(runnable, name);
    }

    @Override
    public void run() {
        System.out.println("ChildThread");

        synchronized (i) {
            i++;
        }

        System.out.println(String.format("%s : %s", Thread.currentThread().getName(), this.getI()));
    }

    public int getI() {
        return i;
    }
}
