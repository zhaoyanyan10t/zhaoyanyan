package lesson7;

public class MyThreaPool {

//    private int size;
    private MyBlockingQueue<Runnable> queue;

    public  MyThreaPool(int size,int capacity){
//        this.size=size;
        queue=new MyBlockingQueue<>(capacity);
        //创建正式员工
        for (int i = 0; i <size ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //正式员工一直运行
                        while(true){
                            //1.从仓库取包裹：成功取出包裹（任务），方法返回
                            //2.仓库取不出包裹，（其他员工正在取包裹，阻塞在synchronized代码行，仓库没有包裹 wait方法阻塞
                            Runnable task=queue.take();
                            //正式员工来送快递，（当前线程通过实例方法调用来执行任务）
                            task.run();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }

    public void execute(Runnable task){
        try {
            queue.put(task);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyThreaPool pool=new MyThreaPool(5,100);
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("A");
            }
        });
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("B");
            }
        });
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("C");
            }
        });
    }
}
