package lesson7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.*;

/*
定时器：
1.在约定好的时间点上，执行某个任务，
2.间隔时间到了，不停地执行任务。
 */
public class MyTimer {

    private  BlockingQueue<MyTimerTask> queue=new PriorityBlockingQueue();

    public MyTimer(int count){
        for (int i = 0; i <count ; i++) {


            new Thread(new MyWorker(queue)).start();
        }
    }
    /**
     *
     * @param task 需要执行的任务
     * @param delay 从当前时间延长多少毫秒，执行任务
     * @param period 间隔时间 ：<=0 就忽略掉 >0需要每间隔给定时间，就执行任务
     */
    public void schedule(Runnable task,long delay,long period){
        try {
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
//            while (period>0){
//                Thread.sleep(period);
//                new Thread(task).start();
//            }
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        long current=System.currentTimeMillis();

    }

    private  static class MyWorker implements Runnable{

        private BlockingQueue<MyTimerTask> queue;
        public MyWorker(BlockingQueue<MyTimerTask> queue) {
            this.queue=queue;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    MyTimerTask task = queue.take();
                    //blockingQueue本身就是线程安全的，US哦一这里的方法调用不用放在同步代码块中
                    synchronized (queue) {
                        long current = System.currentTimeMillis();
                        if (task.next > current) {
                            queue.wait(task.next-current );
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
        private  long next;
        private long period;
        public MyTimerTask(Runnable task,long next,long period){
            this.task=task;
            this.next=next;
            this.period=period;
        }



        @Override
        public int compareTo(MyTimerTask o) {
            return Long.compare(next,o.next);
        }
    }

    //jdk的时间操作。
    public static void main(String[] args) {
        //Date
        Date date1=new Date();//无参构造方法，返回系统当前时间
        Date date2=new Date(99999);//以格林威治时间1970-01-01开始，经过给定时间数量的毫秒
        //DateFormat
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(df.format(date1));
//        System.out.println(df.format(date2));
        //System时间获取
        long current=System.currentTimeMillis();//以格林威治时间1970-01-01开始，经过的时间点的毫秒数
//
//        TimerTask task=new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println("qq");
//            }
//        };
//        new Timer().schedule(task,3000,1000);
//
//        new MyTimer().schedule(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("qi");
//            }
//        },1000,1000);

//        ExecutorService pool=Executors.newSingleThreadExecutor();//线程池的员工就是一个
//        ExecutorService pool=Executors.newFixedThreadPool(4);//正式员工为4，没有临时工
//        ExecutorService pool=Executors.newScheduledThreadPool(4);//正式员工
//        ExecutorService pool=Executors.newCachedThreadPool();//正式员工为0，临时员工不限制。

        ScheduledExecutorService pool=Executors.newScheduledThreadPool(4);
//        pool.schedule(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("qi ");
//            }
//        },10,TimeUnit.SECONDS);//延迟时间，执行任务

        pool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("qi ");
            }
        },1,1,TimeUnit.SECONDS);//延迟时间，执行任务

    }
}
