package lesson6;

//阻塞式队列：满足线程安全的生产，消费的功能。
// 生产，消费达到上限，下限时，需要阻塞等待。
public class MyBlockingQueue<E> {

    private Object[] items;

    private int takeIndex;//弹出元素的索引
    private int putIndex;//添加元素的索引
    private int size;//有效容量

    public MyBlockingQueue(int capacity){
        items=new Object[capacity];
    }

    public synchronized void put(E e) throws InterruptedException {
        while(size==items.length){
            wait();
        }

        items[putIndex]=e;
        putIndex =(putIndex+1)%items.length;
        size++;
        notifyAll();
    }

    public synchronized E take() throws InterruptedException {
        while(size==0){//达到下限，需要等待。
            wait();
        }
        takeIndex=(takeIndex+1)%items.length;
        size--;
        notifyAll();
        return (E) items[takeIndex];
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
//    private static class Consumer implements Runnable{
//        @Override
//        public void run() {
//            SUM--;
//            System.out.println("消费了，剩余"+SUM);
//        }
//    }

    public static void main(String[] args) throws InterruptedException {
        MyBlockingQueue<Integer> queue=new MyBlockingQueue<>(100);
        for (int i = 0; i <5 ; i++) {
            final int k=i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        for (int j = 0; j <100 ; j++) {
                            queue.put(k*100+j);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
//        Runnable[] rs=new Runnable[5];
//        for (int i = 0; i <5 ; i++) {
//            final int k=i;
//             rs[k]=new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        for (int j = 0; j <100 ; j++) {
//                            queue.put(k*100+j);
//                        }
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            };
//            new Thread(rs[k]).start();
//        }
//        rs[0].run();
//        rs[1].run();
//        while(true){
//            int num=queue.take();
//            System.out.println(num);
//        }

//        MyBlockingQueue<Runnable> queue=new MyBlockingQueue<>(100);
//        for (int i = 0; i <5 ; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        while(true){
//                            queue.put(new Producer());//保存生产任务
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
//                    try {
//                        while(true){
//                            queue.put(new Consumer());//保存消费任务
//                            Thread.sleep(1000);
//                        }
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//
//                }
//            }).start();
//        }
//        //main线程取出生产/消费任务
//        while(true){
//            Runnable r=queue.take();//取出来，并处理。
//            r.run();
//        }
    }
}
