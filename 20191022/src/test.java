import sun.awt.geom.AreaOp;

import java.net.SocketTimeoutException;

class Person {
    public int age;//成员属性  实例变量    
    public String name="h";
    public String sex;
    public int a;
    public void eat() {//成员方法      
        System.out.println(name+"吃饭!"+"sex"+sex);
    }
    public void sleep() {
        a=10;
        System.out.println(a+"睡觉!");
    }
    public static void taio(Person p) {

        System.out.println("睡觉!");
        System.out.println(p.a);
    }
}
public class test {
    public static void main(String[] args) {

       Person person = new Person();//通过new实例化对象    
        System.out.println(person.name);
         person.eat();//成员方法调用需要通过对象的引用调用        
         person.sleep();  //产生对象     实例化对象        
         Person person2 = new Person();
         person2.name="哈哈";
         person2.sex="女";
        person2.eat();
        Person person3 = new Person();
    }
}
