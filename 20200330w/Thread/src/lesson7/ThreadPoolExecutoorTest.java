package lesson7;

import java.util.concurrent.*;

public class ThreadPoolExecutoorTest  {
    public static void main(String[] args) {
//        ExecutorService pool=Executors.newFixedThreadPool(4);
        ExecutorService pool=new ThreadPoolExecutor(//线程池 ------快递公司
                3,
                //核心线程数（正式员工） 创建好线程池，正式员工就开始取快递了

                5,
                //最大线程数（最多数量的员工，正式员工+ 临时工）

                //临时工雇佣：正式员工忙不过来，就会创建临时工
                //临时工解雇：空闲时间超出设置时间范围，就解雇
                30,//时间数量

                TimeUnit.SECONDS,
                //时间单位 （时间数量+时间单位表示一定范围的时间

                new ArrayBlockingQueue<>(100),
                //阻塞队列：存放包裹的仓库（存放任务的数据结构）

                new ThreadFactory() {
                    @Override
                    public Thread newThread(Runnable r) {
                        return null;
                    }
                },
                //线程池创建Thread线程的工厂类，没有提供的话，就使用线程内部磨人的创建线程的方法

                 new ThreadPoolExecutor.CallerRunsPolicy()
                //拒绝策略
                //CallerRunsPolicy ：谁（execute代码行所在的线程）让我（我是快递公司）送快递，不好意思，你自己去送
//                new ThreadPoolExecutor.AbortPolicy()
                //  AbortPolicy : 直接抛出异常RejectedExecutionException
//                new ThreadPoolExecutor.DiscardPolicy()
                //DiscardPolicy:从阻塞队列丢弃最新的任务（队尾）
//               new ThreadPoolExecutor.DiscardOldestPolicy()
                //DiscardOldestPolicy:从阻塞队列丢弃最老的任务（队首）
        );

        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("快递送到北京，A同学");
            }
        });
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("快递送到新疆，B同学");
            }
        });
        System.out.println("我正在做事情");
    }
}
