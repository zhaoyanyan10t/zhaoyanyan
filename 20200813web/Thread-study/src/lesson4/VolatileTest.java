package lesson4;

public class VolatileTest {
    public static  final  int NUM=20;
    public static final int COUNT=10000;
    private volatile static int SUM;

    public static void main(String[] args) {
        //同时启动20个线程，每个线程对同一个变量执行操作：循环10000次，每次循环++操作
        for (int i = 0; i <NUM ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j <COUNT; j++) {
                            SUM++;
                            //SUM++1.读取朱北村SUM变量2.修改信息SUM=SUM+13.协会主内存。
                    }
                }
            }).start();
        }
        while(Thread.activeCount()>1){
            Thread.yield();
        }
        System.out.println(SUM);
    }
}
