package lesson4;

public class VolatileTest2 {

    private volatile static int SUM;
    public static void main(String[] args) {
        for (int i = 0; i <20 ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j <10000 ; j++) {
                        if(SUM<=100000)//you 依赖性，所以需要原子性。所以不能把他放在加锁的外面。
                            synchronized (VolatileTest2.class){
                            SUM++;
                        }
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
