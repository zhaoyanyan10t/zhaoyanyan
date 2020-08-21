package lesson2;

import java.io.*;

public class SeriaizableTest {

    public static void main(String[] args) throws Exception {
        Person person=new SeriaizableTest.Person();
        ObjectOutputStream oos=new ObjectOutputStream(
        new FileOutputStream(""));
        oos.writeObject(person);

    }
    private static class Person implements Serializable{

    }
}
