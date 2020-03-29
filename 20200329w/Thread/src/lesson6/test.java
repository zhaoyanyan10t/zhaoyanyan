package lesson6;

public class test {
    public void main(String[] args) throws InterruptedException {
//        synchronized (test.class){//加锁操作
//            test.class.wait();//释放锁
        synchronized (this){//加锁操作
            this.wait();//释放锁
        }
    }
}
