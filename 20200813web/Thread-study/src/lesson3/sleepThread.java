package lesson3;

public class sleepThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        t.start();
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName());
    }
}
