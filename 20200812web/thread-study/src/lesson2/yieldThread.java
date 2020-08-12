package lesson2;

public class yieldThread {
    public static void main(String[] args) {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        t.start();
        while(Thread.activeCount()>1){
            t.yield();
        }
        System.out.println(Thread.currentThread().getName());

    }
    public static void main1(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
        while(Thread.activeCount()>1){
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName());

    }
}
