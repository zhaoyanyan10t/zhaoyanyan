//学生类
public class Student {
    private String name;
    private String gender;
    private int age;

    public Student(){

    }
    public Student(String name,String gender,int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }

    private Student(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                 name + "," +gender+","+age+
                "}";
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }

    public  void setAge(int age){
        this.age=age;
    }
    private int getAge(){
        return age;
    }
}
