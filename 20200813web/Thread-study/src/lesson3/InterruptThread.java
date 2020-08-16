package lesson3;

public class InterruptThread {

    //中断一个线程，但是线程没有处理中断
    public static void test1(){
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){

                }
            }
        });
        t.start();
        t.interrupt();
    }

    public static void test2() throws InterruptedException {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
//                for (int i = 0; i <50 ; i++) {
//                    System.out.println(i+" "+Thread.currentThread().isInterrupted());
//                }
//                测试这个线程是否被中断。
//                while(!Thread.currentThread().isInterrupted()){
                //测试当前线程是否被中断
                while(Thread.interrupted()){
                    System.out.println(Thread.currentThread().getName());
                }
            }
        });
        t.start();
//        Thread.sleep(1);
        t.interrupt();
    }

    public static void test3() throws InterruptedException {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println(Thread.currentThread().isInterrupted());
                    //线程调用wait()/join()/sleep()阻塞时，如果把当前线程给中断，会直接跑一个异常
                    //阻塞状态时，通过捕获及异常处理，来处理线程的中断逻辑
                    Thread.sleep(3000);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println(Thread.currentThread().isInterrupted());
                }
            }
        });
        t.start();
        System.out.println(Thread.currentThread().getName());
//
        t.interrupt();
    }

    public static void test4() throws InterruptedException {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
//                    System.out.println(Thread.interrupted());
                    System.out.println(Thread.currentThread().isInterrupted());
                }
            }
        });
        t.start();
        t.interrupt();
    }

    public static volatile boolean IS_INTERRUPTED;
    //使用自定义的中断标志位
    public static void test5(){
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                //自定义的标志位能满足线程处于运行态的中断操作。
//                while(IS_INTERRUPTED){
//                    System.out.println(Thread.currentThread().getName());
//                }

                //自定义的标志位满足不了线程处于阻塞状态时的中断操作。
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println("xuoe");
                }
            }
        });
        t.start();
        IS_INTERRUPTED=true;
    }

    public static void main(String[] args) throws InterruptedException {
//        test1();
//        test2();
//        test3();
//        test4();
        test5();
    }

}
