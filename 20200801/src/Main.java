class Person1{
    public int age;
    public static int count;
    public final int size=20;
    public static final int c=33;
    public void eat(){
        age=10;
        count=99;
        System.out.println(size);
        System.out.println(c);
    }
    public static void sleep(){

        count=77;
        System.out.println(c);
    }

}
public class Main {
    static int y=1;
    private static int a=2;
    public static void main(String[] args) {
        System.out.println(a);
        Person1  person=new Person1();
        System.out.println(Person1.count);
        System.out.println(Person1.c);
        Person1.sleep();
        person.eat();

        System.out.println(person.age);
        System.out.println(person.size);

    }
}
