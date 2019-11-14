 class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;     }

    public void eat(String food) {
        System.out.println("我是一只小动物");
        System.out.println(this.name + "正在吃" + food);
    }
}

// Bird.java
class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    public void eat(String food) {
        System.out.println("我是一只小鸟");
        System.out.println(this.name + "正在吃" + food);
    }
 }
 public class test {
    public static void main(String[] args) {
        Animal animal1 = new Animal("圆圆");
        animal1.eat("谷子");
        Animal animal2 = new Bird("扁扁");
        animal2.eat("谷子");     } }
// Test.java public class Test {     public static void main(String[] args) {         Animal animal1 = new Animal("圆圆");         animal1.eat("谷子");         Animal animal2 = new Bird("扁扁");         animal2.eat("谷子");     } }
//abstract class Shape {
//    abstract public void draw();
//
//    void func() {
//        System.out.println("func");
//    }
//}
//class Rect extends Shape {
//    @Override
//    public void draw() {
//
//    }
//
//    public void func() {
//        System.out.println("func");
//    }
//}
//
//
//public class test {
//    public static void main(String[] args) {
//        Shape shape = new Rect();
//        shape.func();
//    }
//}


//abstract class B {
//    public B() {
//        // do nothing
//           func();
//    }
//
//    public void func() {
//        System.out.println("B.func()");
//    }
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
//        public static void main(String[] args) {
//            D d = new D();
//            d.func();
//        }
//    }

////class Shape {
////    public void draw() {
////        // 啥都不用干
////          }
////}
////
////    class Cycle extends Shape {
////    @Override     public void draw() {
////        System.out.println("○");
////    }
////}
////
////    class Rect extends Shape {
////    @Override     public void draw() {
////        System.out.println("□");
////    } }
////
////class Flower extends Shape {
////    @Override     public void draw() {
////        System.out.println("♣");
////    } }
////
/////////////////////////////////我是分割线//////////////////////
////
////// Test.java
//// public class test {
////    public static void main(String[] args) {
////        Shape shape1 = new Flower();
////        Shape shape2 = new Cycle();
////        Shape shape3 = new Rect();
////        drawMap(shape1);
////        drawMap(shape2);
////        drawMap(shape3);
////    }  // 打印单个图形
////     public static void drawMap(Shape shape) {
////        shape.draw();
////    }
////}
//
// class Animal {
//    public String name;
//
//    public Animal(String name) {
//        this.name = name;
//    }
//
//    public void eat(String food) {
//        System.out.println(this.name + "正在吃" + food);
//    }
//}
//class Cat extends Animal {
//    public Cat(String name) {
//        super(name);
//    }
//}
//// Bird.java
// class Bird extends Animal {
//    public Bird(String name) {
//        super(name);
//    }
//    @Override
//    public void eat(String food) {
//        // 对于父类的 protected 字段, 子类可以正确访问
//        super.eat(food);
//        System.out.println("下");
//         System.out.println(this.name + "正在飞 ︿(￣︶￣)︿");
//    }
//    public void fly(){
//        System.out.println(this.name+"zjenh");
//    }
//}
//
//// Test.java 和 Animal.java 不在同一个 包 之中了.
// public class test {
//    public static void main(String[] args) {
//        Animal animal = new Bird("j");
//        animal.eat("jkk");
////        if (animal instanceof Bird) {
////            Bird bird = (Bird) animal;
////            bird.fly();
////        }
//    }
//}
//
////
//// public static void main(String[] args) {
////        Bird bird = new Bird("yu");
////        feed(bird);
////    }
////    public static void feed(Animal animal){
////        animal.eat("kk");
//
////        Animal ani = new Bird("小动物");
////       ani.eat("k");
////       animal.fly();
//
//
//
//
////public class Animal{
////    public String name;
////    public String sex;
////    public Animal(String name,String sex){
////        this.name=name;
////        this.sex=sex;
////    }
////    public void eat(String food){
////        System.out.println(this.name+"正在吃"+"food");
////    }
////}
////public class Cat extends Animal{
////    public Cat(String name,String sex){
////        super(name,sex);
////    }
//////    public void eat(String food){
//////        System.out.println(this.name+"正在吃"+"food");
//////    }
////}
////public class Bird extends Animal{
//////    public String name;
////    public Bird(String name,String sex){
////        super(name,sex);
////    }
//////    public void eat(String food){
//////        System.out.println(this.name+"正在吃"+"food");
//////    }
////    public void fly(){
////        System.out.println(this.name+"正在飞");
////    }
////}
////public class test{
////    public static void main(String[] args) {
////        Animal animal=new Animal("ja","nan");
////        System.out.println(animal.name);
////    }
//////
//////
////// public static void main1(String[] args) {
//////        Cat cat=new Cat("xiao","nv");
//////        cat.eat("k");
//////        Bird bird=new Bird("j","k");
//////        bird.fly();
//////
//////    }
////}
////
////
//////import  java.lang.Math.*;
//////
//////import static java.lang.System.out;
////////import static java.lang.Math.sqrt;
//////
//////public class test {
//////    public static void main(String[] args) {
//////        double x=30;
//////        double y=40;
////////        double result=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
////////        double result=sqrt(pow(x,2)+pow(y,2));
//////        out.println(y);
//////    }
//////}
