import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class test2 {
    public static void main(String[] args) {
//        List<Employee> emps = Arrays.asList(new Employee("张三", "男", 20, 5000), new Employee("李四", "男", 36, 7000), new Employee("王五", "男", 16, 3000), new Employee("赵六", "女", 23, 6000), new Employee("田七", "男", 43, 8000));
//
//        Comparator<Employee> cmp = (e1, e2) -> {
//            System.out.println("函数式接口");
//            return e1.getAge() - e2.getAge();
//        };
//
//        Collections.sort(emps, cmp);
//        for (Employee e : emps) System.out.println(e);
    }

    public static void main3(String[] args) {
        List<Integer> list = Arrays.asList(3, 2, 1, 4, 0);
        list.sort((e1, e2) -> Integer.compare(e1, e2));
        list.forEach(e -> System.out.print(e + " "));
    }
    //结果：0 1 2 3 4
    public static void main2(String[] args) {
        Consumer<String> con1 = (e)-> {System.out.println(e);};
        con1.accept("hello Lambda");
        // 如果只有一个参数，参数的括号可以省略
        // 如果lambda表达式体只有一条语句，lambda题的{}也可以省略
         Consumer<String> con2 = e-> System.out.println(e);
         con2.accept("hello");
    }
    //结果：hello Lambda
     //     hello
    public static void main1(String[] args) {
        Runnable r=new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        };
        r.run();
        Runnable r2=()-> System.out.println("h");
        r2.run();
    }
}
//结果：hello
//      h