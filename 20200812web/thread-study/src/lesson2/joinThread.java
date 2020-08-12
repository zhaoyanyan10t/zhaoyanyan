package lesson2;

public class joinThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
        //先将t这个线程执行完毕，再往下执行
        //当前线程：代码行执行的时候，所在的线程
        //t线程：线程引用对象
        //当前线程进行阻塞（运行态-》阻塞态）等待（满足一定条件），t（不做任何处理，让t执行运行）
//        一定条件是：（1）有传入时间，（时间值+时间单位毫秒）
//               （2）线程引用对象执行完毕。
//               这两个条件哪个先满足都可以
//        t.join();//当前线程进行阻塞并等待
        t.join(2000);
        System.out.println(Thread.currentThread().getName());

    }
}
