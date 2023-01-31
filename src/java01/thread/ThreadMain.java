package java01.thread;

public class ThreadMain {

    /**
     *
     * start :
     * run :
     */
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
//        Runnable r = new Thread2();
//        Thread t2 = new Thread(r);

        // start : 실행 대기 -> 자기차례 시 실행
//        t1.start();
//        t1.start();   // 두번 째 호출 시 에러
//        t2.start();

//        t1.run();
//        t2.run();

        // synchronized : 동기화
        // async : 비동기
        t1.start();
        for(int i=0; i<200; i++) {
            System.out.printf("%s", new String("|"));
        }
    }

    public static void thread1() {
        System.out.println("thread 1");
    }

    public static void thread2() {
        System.out.println("thread 2");
    }
}
