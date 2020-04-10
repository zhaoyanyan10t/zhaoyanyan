package lesson2;

import java.io.*;

public class SerializableTest {

    public static void main(String[] args) throws Exception {
//        new SerializableTest.Person();
//        new Person();


//        SerializableTest s=new SerializableTest();
//        s.new person2();
//        new SerializableTest().new person2();


        Person person=new SerializableTest.Person();
//        序列化
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\code\\javacode\\20200410\\IO\\res/person"));
        oos.writeObject(person);
//        反序列化
//        读取操作
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\code\\javacode\\20200410\\IO\\res/person"));
//        之后转换成一个对象
        Person person1=(Person)ois.readObject();
        System.out.println(person1);
    }
    private static class Person implements Serializable{
        private  String name;
        private Integer age;
    }
//    public class person2{}
}
