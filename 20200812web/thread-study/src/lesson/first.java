package lesson;

public class first {
    public static void main1(String[] args) throws InterruptedException {
        Thread.sleep(999999999l);
    }

    public static void main2(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(999999999l);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }


    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                    System.out.println(Thread.currentThread().getName());
            }
        }).start();
        System.out.println(Thread.currentThread().getName());
    }
}
