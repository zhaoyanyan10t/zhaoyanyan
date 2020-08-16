package lesson4;

public class SafeThread {

    public static  final  int NUM=20;
    public static final int COUNT=10000;
    private static int SUM;
    //int 数据类型，值处于-128到127之间，是存在在常量池中。

    public static void main(String[] args) {
        //同时启动20个线程，每个线程对同一个变量执行操作：循环10000次，每次循环++操作

        for (int i = 0; i <NUM ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j <COUNT; j++) {
//                        synchronized (SafeThread.class){
//                            SUM++;
//                        }
                        synchronized (this){
                            SUM++;
                        }
                    }
                }
            }).start();
        }
        while(Thread.activeCount()>1){
            Thread.yield();
        }
        System.out.println(SUM);
    }

    //示例代码块new SafeThread().increment1()
    /*
    等同于synchronized(this){}
     */
    public synchronized void increment1(){//对this对象进行加锁

    }
//    public  void increment1(){
//        synchronized (this){
//
//        }
//    }

    public static void main1(String[] args) {
        //同时启动20个线程，每个线程对同一个变量执行操作：循环10000次，每次循环++操作

        for (int i = 0; i <NUM ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j <COUNT; j++) {
                        increment();
                    }
                }
            }).start();
        }
        while(Thread.activeCount()>1){
            Thread.yield();
        }
        System.out.println(SUM);
    }
    /*
    等同于synchronized(SafeThread.class){}
     */
    public static synchronized void increment(){//对当前类对象进行加锁
        SUM++;
    }

//    public static void increment(){
//        synchronized (SafeThread.class){
//
//        }
//    }
}
