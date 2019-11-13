abstract class Shape {
    abstract public void draw();
    void func() {
        System.out.println("func");
    }
}
class Rect extends Shape {
       public void draw() {
       }
           void func () {
               System.out.println("func1");
           }
}
public class test {
    public static void main(String[] args) {
        Shape shape = new Rect();
        shape.func();


//class B {
//    public B() {
//        // do nothing
//         func();
//    }
//
//
//    public void func() {
//    System.out.println("B.func()");
//}
//}
//
//    class D extends B {
//    private int num = 1;
//    @Override
//    public void func() {
//        System.out.println("D.func() " + num);
//    }
//}
//
//    public class test {
//    public static void main(String[] args) {
//        D d = new D();
//        d.func();


//class Animal {
//    public String name;
//    public Animal(String name) {
//        this.name = name;
//    }
//    public void eat(String food)
//    {
//        System.out.println(this.name + "正在吃" + food);
//    }
//}
//
//class Cat extends Animal {
//    public Cat(String name) {
//        // 使用 super 调用父类的构造方法.
//        super(name);
//    }
//    public void eat(String food){
//        System.out.println("haha");
//    }
//}
//
//class Bird extends Animal {
//    public Bird(String name) {
//        super(name);
//    }
//
//    public void fly() {
//        System.out.println(this.name + "正在飞 ︿(￣︶￣)︿");
//    }
//}
//
//public class test {
//    public static void main(String[] args) {


        //        Animal animal = new Cat("w");
//        animal.eat("猫粮");


// Animal animal = new Animal("小hua");
//        Cat cat = new Cat("小黑");
//        animal=cat;
//        animal.eat("猫粮");

//        Animal animal=new Cat("i");

//        Bird bird = new Bird("圆圆");
//        bird.fly();
    }
}
