package lesson3;

public class interruptThread {

    //中断一个线程，但是县城没有处理中断
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
    public static void test2(){
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                //线程运行状态时，需要自行判断线程中断标志位，处理中断操作
//                while(Thread.currentThread().isInterrupted()){
                while(Thread.interrupted()){
                    //判断是否被中断
                    System.out.println(Thread.currentThread().getName());
                }
            }
        });
        t.start();//t线程中的中断标志位=false
        t.interrupt();//t线程中的中断标志位=true
        //在main线程内先new了一个Thread线程，之后走28行，启动线程，
        // 之后29行中断线程，在之后20行进行Thread这个线程
    }
    public static void test3(){
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().isInterrupted());//true
                    //线程调用wait（）/join（）/sleep（）阻塞时，如果把当前线程给中断，会直接抛一个异常
                    //阻塞状态时，通过捕获及处理异常，来中断线程的中断 逻辑
                    Thread.sleep(3000);
                    //进入休眠，但发现线程标志位是true，就会报异常
                    //跑出异常以后，线程的中断标志位重置，
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println(Thread.currentThread().isInterrupted());//false
                }
            }
        });
        t.start();//false
        t.interrupt();//true
    }
    public static void test4() throws InterruptedException {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
//                while(!Thread.currentThread().isInterrupted()){
                    while(!Thread.interrupted()){
                        //判断是否被中断
                        System.out.println(Thread.currentThread().isInterrupted());
                    }
            }
        });
        t.start();//false
        Thread.sleep(1000);
        //之后进入休眠，没有被中断，进入循环打印false
        t.interrupt();
    }
    private static volatile boolean IS_INTERRUPTED;
    public static void test5(){
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
//                while(!IS_INTERRUPTED){
//                    System.out.println(Thread.currentThread().getName());
//                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
//        t.interrupt();
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
