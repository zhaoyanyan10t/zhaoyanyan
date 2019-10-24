class Person{
    private String name;//实例成员变量
 private  int age;
 private String sex;
 private static int count = 0;//静态成员变量    由类共享数据  方法区
public Person(){
    System.out.println("I am Person init()!");
                    }        //实例代码块
 {
     this.name = "bit";
     this.age = 12;
     this.sex = "man";
     System.out.println("I am instance init()!");
 }       //静态代码块
 static {
     count = 10;//只能访问静态数据成员
     System.out.println("I am static init()!");
}
public void show(){
    System.out.println("name: "+name+" age: "+age+" sex: "+sex);
}
}
     public class test {
         public static void main(String[] args) {
             Person p1 = new Person();
             Person p2 = new Person();//静态代码块是否还会被执行？
         }
     }
//class Person {
//    private String name;
//    private int age;
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//
//    public Person(String name, int age) {
//        this.age = age;
//        this.name = name;
//    }
//    public void show() {
//        System.out.println("name:"+name+" " + "age:"+age);
//    }
//}
//public class test{
//    public static void main(String[] args) {
//        Person person = new Person("caocao", 19);
//        person.show();         //我们发现这里打印的是一个地址的哈希值  原因：调用的是Object的toString方法
//        System.out.println(person);
//    }
//}

//class Person {
//    private String name;//实例成员变量
//    private  int age;
//    private String sex;     //默认构造函数    构造对象
//    public Person() {
//        this.name = "caocao";
//        this.age = 10;
//        this.sex = "男";
//    }     //带有3个参数的构造函数
//     public Person(String name,int age,String sex) {
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//    }
//
//    public void show(){
//        System.out.println("name: "+name+" age: "+age+" sex: "+sex);
//    }
//}
//public class test{
//    public static void main(String[] args) {
//        Person p1 = new Person();//调用不带参数的构造函数  如果程序没有提供会调用不带参数的构造函数
//         p1.show();
//        System.out.println(p1);
////         Person p2 = new Person("zhangfei",80,"男");//调用带有3个参数的构造函数
////        p2.show();
//    }
//}

//class Person {
//    private String name;//实例成员变量
//     private  int age;
//     public void setName(String name){
//this.name = name;//this引用，表示调用该方法的对象
//}
//public String getName(){
//    return name;
//}
//public void show(){
//    System.out.println("name: "+name+" age: "+age);
//}
//}
//public class test {
//    public static void main(String[] args) {
//        Person person = new Person();
//        person.setName("caocao");
//
//        System.out.println(person.getName());
//        person.show();
//    }
//}

//class Person {
//    public int age;//实例变量    存放在对象内
//     public String name;//实例变量
//     public String sex;//实例变量
//public static int count;//类变量也叫静态变量，编译时已经产生，属于类本身，且只有一份。存放在方法区
//public final int SIZE = 10;//被final修饰的叫常量，也属于对象。 被final修饰，后续不可更改
//public static final int  COUNT = 99;//静态的常量，属于类本身，只有一份  被final修饰，后续不可更改     //实例成员函数
//public void eat() {
//    int a = 10;//局部变量
//System.out.println("eat()!");
//}     //实例成员函数
//public void sleep() {
//    System.out.println("sleep()!");
//}     //静态成员函数
// public static void staticTest(){          //不能访问非静态成员
//    // sex = "man"; error
//System.out.println("StaticTest()");
//}
//}
//public class test{
//    public static void main(String[] args) {         //产生对象 实例化对象
//       Person person = new Person();//person为对象的引用
//         System.out.println(person.age);//默认值为0
//        System.out.println(person.name);//默认值为null
//        // System.out.println(person.count);//会有警告!
//        // 正确访问方式：
//         System.out.println(Person.count);
//         System.out.println(Person.COUNT);
//         Person.staticTest();         //总结：所有被static所修饰的方法或者属性，全部不依赖于对象。
//         person.eat();
//        person.sleep();
//    }
//}

//class TestDemo{
//    public int a;
//    public static int count;
//    public static void change() {
//        count = 100;         //a = 10; error  不可以访问非静态数据成员
//        System.out.println(TestDemo.count); }
//}
//    public class test{
//    public static void main(String[] args) {
//        TestDemo.change();//无需创建实例对象 就可以调用
//
//    }
//}

//class TestDemo{
//    public int a;
//    public static int count;
//}
//
//public class test{
//    public static void main(String[] args) {
//        TestDemo t1 = new TestDemo();
//        t1.a++;
//        t1.count++;
//        System.out.println(t1.a);
//        System.out.println(t1.count);
//        System.out.println("============");
//        TestDemo t2 = new TestDemo();
//        t2.a++;
//        t2.count++;
//        System.out.println(t2.a);
//        System.out.println(t2.count);
//    }
//}

//class Person {
//    public int age;//成员属性  实例变量    
//    public String name = "s";
//
//    public void show() {//成员方法      
//        System.out.println("我叫" + name + "今年" + age);
//    }
//}
//public class test {
//    public static void main(String[] args) {
//        Person person = new Person();//通过new实例化对象    
//        person.show();
//    }
//}

//class Person {
//    public int age;//成员属性  实例变量    
//    public String name="s";
//    public String sex;
//    public int a;
//    public void eat() {//成员方法      
//        System.out.println(name+"吃饭!"+"sex"+sex);
//    }
//    public void sleep() {
//        a=10;
//        System.out.println(a+"睡觉!");
//    }
////    public static void taio(Person p) {
////
////        System.out.println("睡觉!");
////        System.out.println(p.a);
////    }
//}public class test {
//    public static void main(String[] args) {
//
//        Person person = new Person();//通过new实例化对象    
//        System.out.println(person.name);
////        person.eat();//成员方法调用需要通过对象的引用调用        
////        person.sleep();  //产生对象     实例化对象        
//        Person person2 = new Person();
//        System.out.println(person2.name);
////        person2.name="哈哈";
////        person2.sex="女";
////        person2.eat();
////        Person person3 = new Person();
//    }
//}
