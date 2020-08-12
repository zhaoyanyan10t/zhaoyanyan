package lesson2;
public class Main{
    public static void main(String[] args) {
//        new MyThread().start();
//        new Thread(new MyRunnable()).start();

        MyThread mythread=new MyThread();
        mythread.run();//不会启动线程，只是在当前main线程中，调用run方法。
// /没有调用线程，只是启动了这个里面的run方法，他是在main里面运行的，U所以打印main
        mythread.start();
        //这个调用了线程，然后只去执行线程的代码
    }
}
 class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

class  MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}