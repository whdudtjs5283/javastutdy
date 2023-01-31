package java01.thread;

public class Thread1 extends Thread {

    @Override
    public synchronized void start() {
        super.start();
    }

    @Override
    public void run() {
        for(int i=0; i<200; i++) {
            System.out.printf("%s", new String("|"));
        }
    }
}
