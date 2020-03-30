package lesson7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.*;

public class MyTimer {

    private BlockingQueue<MyTimerTask> queue=new PriorityBlockingQueue();

    public MyTimer(int count){
        for (int i = 0; i <count ; i++) {
            //执行任务
            new Thread(new MyWorker(queue)).start();
        }
    }

    /**
     * 定时任务
     * @param task 需要执行的任务
     * @param delay 从当前时间延迟多少毫秒，执行任务
     * @param period  间隔时间：<=0就忽略掉,>0需要每间隔给定时间，就执行任务
     */
    public void schedule(Runnable task,long delay,long period){
        try {
            //保存任务
            queue.put(new MyTimerTask(task,System.currentTimeMillis()+delay,period));
            synchronized (queue){
                queue.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


//        try {
//            Thread.sleep(delay);
//            new Thread(task).start();
//            while(period>0){
//                Thread.sleep(period);
//                new Thread(task).start();
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        long current=System.currentTimeMillis();

//        while(true){
//            long next=System.currentTimeMillis();
//            //当前时间next超过约定好的执行时间（current+ delay），执行任务
//            if(current+delay<=next){
////                new Thread(task).start();
//                if(period<=0){
//                    break;
//                }else{
//
//                }
//            }
//        }
    }
    public static class MyWorker implements Runnable{

        private BlockingQueue<MyTimerTask> queue;

        public MyWorker(BlockingQueue<MyTimerTask> queue) {
            this.queue=queue;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    //取元素
//                            blockingQueue 本身就是线程安全的
                    MyTimerTask task = queue.take();
                    synchronized (queue) {
                        long current = System.currentTimeMillis();
                        if (task.next > current) {
                            queue.wait(task.next-current);
                            queue.put(task);
                        } else {
                            task.task.run();
                            if (task.period > 0) {
                                task.next = task.next + task.period;
                                queue.put(task);
                            }
                        }
                    }

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private static class MyTimerTask implements Comparable<MyTimerTask>{

        //定时任务
        private Runnable task;
        //下次执行的时间
        private long next;
        private long period;
        public MyTimerTask(Runnable task,long next,long period){
            this.task=task;
            this.next=next;
            this.period=period;
        }
//
//        @Override
//        public void run() {
//
//        }

        @Override
        public int compareTo(MyTimerTask o) {
            return Long.compare(next,o.next);
        }
    }
    public static void main(String[] args) {
        //Date
        Date date=new Date();
        Date date2=new Date(99999);//以格林威治时间1970-01-01开始，经过给定时间数量的毫秒
//        DateFormat
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        HH  代表24 小时制
//        hh代表12 小时制
//        System.out.println(df.format(date));
//        System.out.println(df.format(date2));
        //System 时间获取,从1970-01-01开始到当前时间点经过的毫秒数
        long current=System.currentTimeMillis();
//        System.out.println(current);


//        TimerTask task=new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println("qi");
//            }
//        };
//        new Timer().schedule(task,3000,10);

//        new Timer().schedule(new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println("qi");
//            }
//        },3000,1000);

        new MyTimer(4).schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("起床");
            }
        },3000,1000);

//        ExecutorService pool=Executors.newSingleThreadExecutor();
        //单个线程池  ， ，一个员工
//        ExecutorService pool=Executors.newFixedThreadPool(4);
        //正式员工数量为4，没有临时工
        ScheduledExecutorService pool=Executors.newScheduledThreadPool(4);
        //正式员工
//        ExecutorService pool=Executors.newCachedThreadPool();
        //正式员工数量为0，临时工不限制

//        pool.schedule(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("琪琪");
//            }
//        },1,TimeUnit.SECONDS);//延迟时间，执行任务

//        pool.scheduleAtFixedRate(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("琪琪");
//            }
//        },1,1,TimeUnit.SECONDS);
    }
}
