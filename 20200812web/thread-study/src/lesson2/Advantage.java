package lesson2;

public class Advantage {


    private static final int NUM=5;

    private static void increment(){
        int COUNT=1000000000;
        int r=0;
        for (int i = 0; i <COUNT; i++) {
            r++;
        }
    }

    //串行（代码依次执行）
    private static void serial(){
        long start=System.currentTimeMillis();//返回19700101到当前时间的毫秒数
        for (int i = 0; i <NUM ; i++) {
            increment();
        }
        long end=System.currentTimeMillis();
        System.out.println("串行执行时间"+(end-start));
    }

    //并发
    private static void parallel(){
        long start=System.currentTimeMillis();//返回19700101到当前时间的毫秒数

        for (int i = 0; i <NUM ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    increment();
                }
            }).start();
        }
        //等待newThred 所有线程执行完毕，否则一直等待。
        while(Thread.activeCount()>1){
            Thread.yield();//线程的让步
        }
        long end=System.currentTimeMillis();
        System.out.println("并发执行时间"+(end-start));
    }

    public static void main(String[] args) {
        serial();
        parallel();
    }
}
