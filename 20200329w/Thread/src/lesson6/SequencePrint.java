package lesson6;
//三个线程 分别打印A B C
// 打印结果：循环打印ABC，打印10次

//就是第一个线程打印A 第二个线程打印B 第三个线程打印C
public class SequencePrint {

    private static  int INDEX;
//索引用来标识到底运行那个线程
    public static void main(String[] args) {

//        第一个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
// 循环里面加一把锁，因为这个时候我打印A之后，就要通知第2个线程打印B了
                try {
                    for (int i = 0; i <10 ; i++) {
                        synchronized (SequencePrint.class){
                            while(INDEX%3!=0){
                                SequencePrint.class.wait();
                            }
                            INDEX++;
                            System.out.print("A");
                            SequencePrint.class.notifyAll();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

//        第二个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
// 循环里面加一把锁，因为这个时候我打印A之后，就要通知第2个线程打印B了
                try {
                    for (int i = 0; i <10 ; i++) {
                        synchronized (SequencePrint.class){
                            while(INDEX%3!=1){
                                SequencePrint.class.wait();
                            }
                            INDEX++;
                            System.out.print("B");
                            SequencePrint.class.notifyAll();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

//        第三个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
// 循环里面加一把锁，因为这个时候我打印A之后，就要通知第2个线程打印B了
                try {
                    for (int i = 0; i <10 ; i++) {
                        synchronized (SequencePrint.class){
                            while(INDEX%3!=2){
                                SequencePrint.class.wait();
                            }
                            INDEX++;
                            System.out.println("C");
                            SequencePrint.class.notifyAll();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
