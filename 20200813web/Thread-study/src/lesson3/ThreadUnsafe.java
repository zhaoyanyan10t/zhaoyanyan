package lesson3;

public class ThreadUnsafe {
    public static   int count ;
    //int 数据类型，值处于-128到127之间，是存在在常量池中。
    public static void main(String[] args) {
        //同时启动20个线程，每个线程对同一个变量执行操作：循环10000次，每次循环++操作

        for (int i = 0; i <20 ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j <10000; j++) {
                        count++;
                    }
                }
            }).start();
        }
        while(Thread.activeCount()>1){
            Thread.yield();
        }
        System.out.println(count);
    }
}
