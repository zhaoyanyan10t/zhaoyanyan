import java.lang.reflect.Array;
import java.util.Arrays;

//class Student implements Comparable<Student>{
//class Student implements Comparable{
class Student implements Comparable{
    public String name;
    public int score;
    public Student(String name,int score){
        this.name=name;
        this.score=score;
    }

    @Override
    public String toString() {
        return "["+name+":"+score+"]";
    }

//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }

//    @Override
//    public int compareTo(Student o) {
//        return this.name.compareTo(o.name);
//    }
    @Override
    public int compareTo(Object o) {
        Student s=(Student)o;
        return this.score-s.score;
    }
}

public class test1 {
//    public static void sort()
public static void sort(Comparable[] comparables) {
    //冒泡写
      for (int i = 0; i < comparables.length; i++) {
          for (int j = 0; j < comparables.length-1-i; j++) {
                    if(comparables[j].compareTo(comparables[j+1]) > 0)
              {
                  Comparable tmp = comparables[j + 1];
                  comparables[j  + 1] = comparables[j];
                  comparables[j] = tmp;
              }
          }
      }
}


    public static void main(String[] args) {
    Student[] students=new Student[]{
            new Student("zhang", 97),
    new Student("zhan", 9),
    new Student("zha", 93),
            };
//            Arrays.sort(students);
            sort(students);
    System.out.println(Arrays.toString(students));

}
}
