import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflect {

    //1.获取Student字节码文件对象（Class对象）
    public static void test1() throws ClassNotFoundException {
        //1.每个类里面都含有一个class的静态属性
        Class<?> stuClass1=Student.class;
        System.out.println(stuClass1);

        //2，通过让对象调用getClass（）
        Student s=new Student("pe","男",80);
        Class<?> stuClass2=s.getClass();
        System.out.println(stuClass2);

        //3.通过Class静态方法forName（）方法
        Class<?> stuClass3=Class.forName("Student");
        System.out.println(stuClass3);

        //一个类最多只会被加载一次。
        //三个stuClass是相同的
        System.out.println(stuClass1.equals(stuClass2));
        System.out.println(stuClass3.equals(stuClass2));
        System.out.println(stuClass1.equals(stuClass3));
    }

    //2.获取累的构造器对象---前提是必须先要拿到累的字节码对象
    public static void test2(){
        try{
            //获取字节码文件对象
            Class<?> stuClass=Class.forName("Student");

            //获取构造器对象
            //getConstructor：获取所有共有的构造器
            //没有S就是一个，带S是一个数组
            Constructor<?>[] stuConstruct1=stuClass.getConstructors();
            System.out.println(stuConstruct1.length);

            //注意：getConstructor获取具体某个共有的构造器--想要获取那个构造器，
            // 该方法的参数与对应构造气的参数对应起来。
            //没有参数的构造器
            Constructor<?> stuConstruct2=stuClass.getConstructor();
            System.out.println(stuConstruct2);

            //有参数的构造器
            Constructor<?> stuConstruct3=stuClass.getConstructor(String.class,String.class,int.class);
            System.out.println(stuConstruct3);

            //getDeclaredConstructors：获取所有的构造器对象---与访问权限无关
            Constructor<?>[] stuConstruct4=stuClass.getDeclaredConstructors();
            System.out.println(stuConstruct4.length);

            //getDeclaredConstructor：获取参数匹配的构造器
            Constructor<?> stuConstruct5=stuClass.getDeclaredConstructor(String.class);
            System.out.println(stuConstruct5);

            //如果没有找到对应的构造器，该方法会抛一个异常
            Constructor<?> stuConstruct6=stuClass.getDeclaredConstructor(String.class,int.class);
            System.out.println(stuConstruct6);

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    //3、通过构造器实例化对象
    public static void test3(){
        try {
            //1,获取字节码文件对象
            Class<?> stuClass=Class.forName("Student");

            //2.获取构造器
            Constructor<?> stuConstruct=stuClass.getDeclaredConstructor(String.class);

            //3.实例化对象
            //如果构造器是private,则不嫩直接用来实例化对象
            stuConstruct.setAccessible(true);
            //将该构造气的访问权限设置为public
            Student s= (Student) stuConstruct.newInstance("p");
            System.out.println(s);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //反射属性
    public static void test4(){
        try {
            //1,获取字节码文件对象
            Class<?> stuClass=Class.forName("Student");

            //2.获取构造器
            Constructor<?> stuConstruct=stuClass.getDeclaredConstructor(String.class);

            //3.实例化对象
            //如果构造器是private,则不嫩直接用来实例化对象
            stuConstruct.setAccessible(true);
            //将该构造气的访问权限设置为public
            Student s= (Student) stuConstruct.newInstance("p");
            System.out.println(s);
            //反射Student属性
            //getFields：获取Student中所有的公有属性
            Field[] fields1=stuClass.getFields();
            System.out.println(fields1.length);

            //抛异常： 因为Student中name是私有的，而getField方法只能获取共有的

//            Field name1=stuClass.getField("name");
//            System.out.println(name1);

            //getDeclaredFields:获取Student所有属性
            Field[] fields2=stuClass.getDeclaredFields();
            System.out.println(fields2.length);

            Field gender=stuClass.getDeclaredField("gender");
            System.out.println(gender);

            //修改gender的属性----》修改那个实例的属性：
            gender.setAccessible(true);
            //set第一个参数为对象，即：将该对象中那个属性修改为什么值
            gender.set(s,"人妖");

            Field age=stuClass.getDeclaredField("age");
            age.setAccessible(true);
            age.set(s,100);
            System.out.println(s.getGender());
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void test5(){
        try {
            //1,获取字节码文件对象
            Class<?> stuClass=Class.forName("Student");

            //2.获取构造器
            Constructor<?> stuConstruct=stuClass.getDeclaredConstructor(String.class);

            //3.实例化对象
            //如果构造器是private,则不嫩直接用来实例化对象
            stuConstruct.setAccessible(true);
            //将该构造气的访问权限设置为public
            Student s= (Student) stuConstruct.newInstance("p");
            System.out.println(s);


           //4,反射属性
            Field gender=stuClass.getDeclaredField("gender");
            System.out.println(gender);

            //修改gender的属性----》修改那个实例的属性：
            gender.setAccessible(true);
            //set第一个参数为对象，即：将该对象中那个属性修改为什么值
            gender.set(s,"人妖");

            Field age=stuClass.getDeclaredField("age");
            age.setAccessible(true);
            age.set(s,100);
            System.out.println(s.getGender());
            System.out.println(s);

            //5.反射方法
            Method setAge=stuClass.getDeclaredMethod("setAge",int.class);
            setAge.invoke(s,200);

            Method getAge=stuClass.getDeclaredMethod("getAge");
            getAge.setAccessible(true);
            System.out.println(getAge.invoke(s));

            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws ClassNotFoundException {
//        test1();
//        test2();
//        test3();
//        test4();
        test5();
        Student s=new Student("pp","nan",30);
    }
}
