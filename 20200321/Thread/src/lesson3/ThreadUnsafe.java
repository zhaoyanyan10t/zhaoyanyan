package lesson3;

public class ThreadUnsafe {
    private static int count=0;
    public static void main(String[] args) {
        //同时启动20个线程，每个线程对同一个变量执行操作：循环10000次，每次循环++操作
        //所有线程执行完毕，打印变量值，检查是否是预期的结果（20*10000）

        for (int i = 0; i <20 ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j <10000 ; j++) {
                        count++;
                    }
                }
            }).start();
        }
        while(Thread.activeCount()>1){//debug 运行 是大于1
            //run运行 大于2  启动run方法
            Thread.yield();
        }
        System.out.println(count);
    }
}
