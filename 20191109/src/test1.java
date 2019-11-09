class Animal {
    public String name;
    public Animal(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println(this.name + "正在吃" + food);
    }
}

class Cat extends Animal {
    public Cat(String name) {
        // 使用 super 调用父类的构造方法.
         super(name);
    }
}

    class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

        public void fly() {
        System.out.println(this.name + "正在飞 ︿(￣︶￣)︿");
    }
}

public class test1 {
    public static void main(String[] args) {
        Cat cat = new Cat("小黑");
        cat.eat("猫粮");
        Bird bird = new Bird("圆圆");
        bird.fly();
    }
}


//class Animal {
//    public String name;
//    public int age;
//    public Animal(String name,int age) {
//     x   this.name = name;
//        this.age=age;
//    }
//
//    public void eat(String food) {
//        System.out.println(this.name + "正在吃" + food);
//        System.out.println(this.age);
//    }
//}
//
//class Cat extends Animal {
//    public Cat(String name,int age) {
//        // 使用 super 调用父类的构造方法.
//        super(name,age);
//    }
//}
//
//class Bird extends Animal {
//    public Bird(String name,int age) {
//        super(name,age);
//    }
//
//    public void fly() {
//        System.out.println(this.name + "正在飞 ︿(￣︶￣)︿");
//    }
//}
//
//public class test1 {
//    public static void main(String[] args) {
//        Cat cat = new Cat("小黑",18);
//        cat.eat("猫粮");
//        Bird bird = new Bird("圆圆",99);
//        bird.fly();
//    }
//}