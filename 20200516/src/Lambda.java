import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;

class Employee {
    private String name;
    private String gender;
    private int age;
    private double salary;

    public Employee(String name, String gender, int age, double salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee[" + name + "," + gender + "," + age + "," + salary + "]";
    }

    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}

/*
1.过滤所有年龄超过35岁的员工
2.过滤所有薪资超过5000的员工信息
3.过滤所有男的
 */

interface MyPredict<T>{
    boolean test(T t);
}
class FilterAge implements MyPredict<Employee>{
    public boolean test(Employee t){
        return t.getAge()>35;
    }
}
class FilterSalary implements MyPredict<Employee>{
    public boolean test(Employee t){
        return t.getSalary()>5000;
    }
}

    public class Lambda {

        public static List<Employee> filterEmptyByAge(List<Employee> emps){
            List<Employee> list=new ArrayList<>();
                for(Employee e:emps){
                    if(e.getAge()>35){
                        list.add(e);
                    }
                }
                return list;
        }

    public static List<Employee> filterEmployeeBySalary(List<Employee> emps){
        List<Employee> list=new ArrayList<>();
        for(Employee e:emps){
            if(e.getSalary()>5000){
                list.add(e);
            }
        }
        return list;
    }

        //    这种代码重复太多，复用性不好
        //优化一
        public static List<Employee> filterEmployee(List<Employee> emps,MyPredict<Employee> mp){
            List<Employee> list=new ArrayList<>();
            for(Employee e:emps){
                if(mp.test(e)){
                    list.add(e);
                }
            }
            return list;
        }
        public static void test1(){
            List<Employee> emps = Arrays.asList(
                    new Employee( "张三", "男", 20, 5000),
                    new Employee("李四", "男", 36, 7000),
                    new Employee("王五", "男", 16, 3000),
                    new Employee("赵六", "女", 23, 6000),
                    new Employee("田七", "男", 43, 8000)
            );
            for (Employee e:emps) {
                System.out.println(e);
            }
            List<Employee> list=filterEmptyByAge(emps);
            for (Employee e:list) {
                System.out.println(e);
                System.out.println("====== ");
            }
            List<Employee> list1=filterEmployeeBySalary(emps);
            for (Employee e:list1) {
                System.out.println(e);
            }
            System.out.println("---------------------");
        }
        public static void test2(){
            List<Employee> emps = Arrays.asList(
                    new Employee( "张三", "男", 20, 5000),
                    new Employee("李四", "男", 36, 7000),
                    new Employee("王五", "男", 16, 3000),
                    new Employee("赵六", "女", 23, 6000),
                    new Employee("田七", "男", 43, 8000)
            );
            List<Employee> list1=filterEmployee(emps,new FilterAge());
            List<Employee> list2=filterEmployee(emps,new FilterSalary());
            for (Employee e:list1) {
                System.out.println(e);

            }System.out.println("====== ");
            for (Employee e:list2) {
                System.out.println(e);
            }
        }

        public static void test3(){
            List<Employee> emps = Arrays.asList(
                    new Employee( "张三", "男", 20, 5000),
                    new Employee("李四", "男", 36, 7000),
                    new Employee("王五", "男", 16, 3000),
                    new Employee("赵六", "女", 23, 6000),
                    new Employee("田七", "男", 43, 8000)
            );
            List<Employee> list1=filterEmployee(emps, new MyPredict<Employee>() {
                @Override
                public boolean test(Employee employee) {
                    return employee.getAge()>35;
                }
            });
            List<Employee> list2=filterEmployee(emps, new MyPredict<Employee>() {
                @Override
                public boolean test(Employee employee) {
                    return employee.getSalary()>5000;
                }
            });
            for (Employee e:list1) {
                System.out.println(e);

            }System.out.println("====== ");
            for (Employee e:list2) {
                System.out.println(e);
            }
        }

        public static void test4(){
            List<Employee> emps = Arrays.asList(
                    new Employee( "张三", "男", 20, 5000),
                    new Employee("李四", "男", 36, 7000),
                    new Employee("王五", "男", 16, 3000),
                    new Employee("赵六", "女", 23, 6000),
                    new Employee("田七", "男", 43, 8000)
            );
            List<Employee> list1=filterEmployee(emps, e->e.getAge()>35);
            List<Employee> list2=filterEmployee(emps, e->e.getSalary()>5000);
//            for (Employee e:list1) {
//                System.out.println(e);
//
//            }
            list1.forEach(System.out::println);
            System.out.println("====== ");
//            for (Employee e:list2) {
//                System.out.println(e);
//            }
            list2.forEach(System.out::println);
        }

    public static void main(String[] args) {
//       test1();

//        test2();
//test3();
test4();
    }
}
