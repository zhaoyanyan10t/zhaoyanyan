package lesson7;

import java.util.concurrent.*;

public class ThreadPoolExecutorTest {
    public static void main(String[] args) {
        ExecutorService pool=new ThreadPoolExecutor(
                3,//核心线程数
                5,//最大线程数
                1000,//时间数量
                TimeUnit.SECONDS,//时间单位（时间数量+时间单位表示一定范围的时间）
                new ArrayBlockingQueue<>(1000),//阻塞队列
                new ThreadFactory() {
                    @Override
                    public Thread newThread(Runnable r) {
                        return null;
                    }
                },
                //线程池创建Thread线程的工厂类。没有提供的话，就使用线程池内部默认的创建线程的方式。
                //拒绝策略
                new ThreadPoolExecutor.CallerRunsPolicy());
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("送快递到北京，A同学");
            }
        });
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("送快递到新疆，B同学");
            }
        });
        System.out.println("我正在做事情");
    }
}
