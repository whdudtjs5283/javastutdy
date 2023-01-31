package java01.thread;

public class Thread2 implements Runnable {

    @Override
    public void run() {
        for(int i=0; i<200; i++) {
            System.out.printf("%s", new String("ㅡ"));
        }
    }
}
