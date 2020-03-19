package lesson1;

public class First {
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
