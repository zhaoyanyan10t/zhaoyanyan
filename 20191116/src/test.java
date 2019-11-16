interface IFlying {
    void fly();
}
interface IRunning {
    void run();
}
interface ISwimming {
    void swim();
}
class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;

    }
}
class Cat extends Animal implements IRunning {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在用四条腿跑");
    }
}
class Robot implements IRunning {
    private String name;
    public Robot(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在用轮子跑");
    }
}
public class test{
//    public static void walk(IRunning cat){
//        cat.run();
//    }

    public static void walk(Cat cat){
        cat.run();
    }

//public static void walk(IRunning running) {
//    System.out.println("我带着伙伴去散步");
//    running.run(); }
    public static void main(String[] args) {

//        IRunning cat=new Cat("ki");
//        walk(cat);
////        Cat cat=new Cat("ki");
////        walk(cat);
////
//        Robot robot=new Robot("hua");
//        walk(robot);


        Cat cat=new Cat("ki");
        walk(cat);
////
        Cat robot=new Cat("hua");
        walk(robot);
    }
}


//interface Ishape{
//    void draw();
//}
////接口不可以被实例化
////只要被实现，接口当中的方法要冲重写
//class Cycle implements Ishape{
//    @Override
//    public void draw() {
//        System.out.println("yuan");
//    }
//}
//public class test {
//    public static void drawe(Ishape shape){
//        shape.draw();
//    }
//    public static void main(String[] args) {
//        Ishape shape=new Cycle();
//        drawe(shape);
//    }
//}
