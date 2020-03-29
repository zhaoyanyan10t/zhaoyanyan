package lesson6;
//泛型E

// 实现阻塞式队列
//   1 满足线程安全的生产，消费的功能
//    2. 生产  消费达到上限/下限，需要阻塞等待
public class MyBlockingQueue<E> {

    private Object[] items;
    private int takeIndex;//弹出元素的索引
    private int putIndex;//添加元素的索引
    private volatile int size;//有效容量

    //    构造方法
    public MyBlockingQueue(int capacity) {
        items = new Object[capacity];
    }

    //    添加的时候，我可以指定泛型 具体使用类型
//    使用synchronized保证线程安全
//    synchronized 对象加锁，是对this进行加锁
    public synchronized void put(E e) throws InterruptedException {
//         元素容量满足数组长度，就不能添加元素，就进行阻塞
        while (size == items.length) {
            wait(0);//等待操作做，会释放锁
            //通知了以后，size可能会变化，所以要用while
        }
        //从1 开始的
//        putIndex = (putIndex + 1) % items.length;//存放元素的索引++，需要满足循环队列索引>数组长度的情况
//        //环形队列
//        items[putIndex] = e;//存放元素

        //从0开始的
        items[putIndex] = e;//存放元素
        putIndex = (putIndex + 1) % items.length;//存放元素的索引++，需要满足循环队列索引>数组长度的情况

        size++;
//        所有阻塞在我们等待队列里的线程都给通知到
        notifyAll();
    }

    //    弹出的时候，可以指定弹出的是什么类型
    public synchronized E take() throws InterruptedException {
        while (size == 0) {//达到下限，需要等待
            wait();
        }
        //从1开始取得
//        takeIndex = (takeIndex + 1) % items.length;
//        size--;
//        notifyAll();
//        return (E) items[takeIndex];//强制转换

        //从0 开始取得
         E o=(E) items[takeIndex];
        size--;
        notifyAll();
        takeIndex = (takeIndex + 1) % items.length;
        return o;//强制转换
    }

    public static void main(String[] args) throws InterruptedException {
        MyBlockingQueue<Integer> queue=new MyBlockingQueue<>(100);
        for (int i = 0; i <5 ; i++) {
            final  int k=i;//用final修饰，值不变，
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
//                        方法内的局部变量，只是在方法内部起作用
//                        方法是在某一个线程内运行的
                        for (int j = 0; j < 100; j++) {
                            queue.put(k);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        while(true){
            int num=queue.take();
            System.out.println(num);
        }
    }
}
//    private static int SUM;
//
//    private static class Producer implements Runnable{
//        @Override
//        public void run() {
//            SUM+=3;
//            System.out.println("消费了，剩余"+SUM);
//        }
//    }
//
//    private static class Consumer implements Runnable{
//        @Override
//        public void run() {
//            SUM--;
//            System.out.println("消费了，剩余"+SUM);
//        }
//    }

//    public static void main(String[] args) throws InterruptedException {
//        MyBlockingQueue<Runnable> queue=new MyBlockingQueue<>(100);
//        for (int i = 0; i <5 ; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    try {//生产任务
//                        while (true) {
//                            queue.put(new Producer());//添加元素
//    //                    保存Runnable的对象
//                            Thread.sleep(1000);
//                        }
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//
//                }
//            }).start();
//        }
//        for (int i = 0; i <5 ; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
////                    xxx=queue.take();//弹出元素
//                    try {
//                        while (true) {
//                            queue.put(new Consumer());//保存消费任务
//                            Thread.sleep(1000);
//                        }
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }).start();
//        }
////        main线程取出生产/消费任务
//        while(true){
//            Runnable r=queue.take();//取出任务，病处理任务
//            r.run();
////            main 线程调用它的实例方法
//        }
//    }
//}
