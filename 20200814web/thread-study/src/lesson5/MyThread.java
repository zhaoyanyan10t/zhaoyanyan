package lesson5;

import java.util.Calendar;

public class MyThread extends Thread {
    StringBuilder value;
    public MyThread(StringBuilder value) {
        this.value = value;
    }
    @Override
    public void run() {
        try {
            synchronized(value) { 
                System.out.println(value);
                if ((value.toString()).equals("123")) {
                    System.out.println(getName() + "开始等待;当前时间秒数：" + Calendar.getInstance().get(Calendar.SECOND));
                    value.wait(10000);// 注意这里不是说让value进行wait，而是让当前线程进行wait
                } else {
                    value = value.append("2");
                    System.out.println("当前线程名：" + getName() + ";" + value );
                }
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        StringBuilder value = new StringBuilder("123");
        StringBuilder value1 = new StringBuilder("13");
        MyThread myThread1 = new MyThread(value);
        MyThread myThread2 = new MyThread(value1);
        MyThread myThread3 = new MyThread(value);
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }

}
