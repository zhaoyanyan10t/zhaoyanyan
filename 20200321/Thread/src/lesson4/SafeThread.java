package lesson4;

import java.util.Scanner;

public class SafeThread {
    private static int count ;//int 基础数据类型 默认为0

    public static void main(String[] args) {
        //同时启动20个线程，每个线程对同一个变量执行操作：循环10000次，每次循环++操作
        //所有线程执行完毕，打印变量值，检查是否是预期的结果（20*10000）

        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10000; j++) {
//                        increase();
//                        synchronized (this){//对runnable对象进行加锁
//                            synchronized (Thread.class){
//                            synchronized (getClass()){
                            synchronized (SafeThread.class){
                        }
                    }
                }
            }).start();
        }
        while (Thread.activeCount() > 1) {//debug 运行 是大于1
            //run运行 大于2  启动run方法
            Thread.yield();
        }
        System.out.println(count);
    }
//    等同于synchronized（SafeThread.class){}
    public static synchronized void increase() {
        //对当前类对象进行加锁操作
        count++;
    }
//    public static void increase(){
//        synchronized (SafeThread.class){
//
//        }
//    }



    //    等同于synchronized（this){}
    //new SafeThread().increase2();
    public synchronized void increase2(){//对this（SafeThread）加锁

    }
//    public void increase2(){
//    synchronized (this){
//
//    }
}
