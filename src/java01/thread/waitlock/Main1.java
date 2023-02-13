package java01.thread.waitlock;

public class Main1 {

    public static void main(String[] args) throws InterruptedException {
        Table table = new Table(); // 여러 스레드 공유하는 객체

        new Thread(new Cook(table), "COOK-1").start();
        new Thread(new Customer(table, "버거"), "CUSTOMER-1").start();
        new Thread(new Customer(table, "버거"), "CUSTOMER-2").start();

        // 0.1초 후에 강제종료
        Thread.sleep(100);
        System.exit(0);
    }
}
