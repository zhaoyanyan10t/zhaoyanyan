package lesson7;

public class SequencePrint1 {
    private static volatile int INDEX;
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i <10 ; i++) {
                        synchronized (SequencePrint1.class){
                            while(INDEX%3!=0){
                                SequencePrint1.class.wait();
                            }
                            INDEX++;
                            System.out.print("A");
                            SequencePrint1.class.notifyAll();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i <10 ; i++) {
                        synchronized (SequencePrint1.class){
                            while(INDEX%3!=1){
                                SequencePrint1.class.wait();
                            }
                            INDEX++;
                            System.out.print("B");
                            SequencePrint1.class.notifyAll();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i <10 ; i++) {
                        synchronized (SequencePrint1.class){
                            while(INDEX%3!=2){
                                SequencePrint1.class.wait();
                            }
                            INDEX++;
                            System.out.println("C");
                            SequencePrint1.class.notifyAll();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
