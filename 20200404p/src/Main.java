import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public  static int b(int[] arr){
        int count=1;
        int t=0;
        int key=arr[0];
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]==key){
                count++;
                if(count>=(arr.length/2)) {
                     key = arr[i];
                    break;
                }
            }else{
                count=1;
                key=arr[i];
            }
        }
        return key;
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] num=new int[n];
//        for (int i = 0; i <num.length; i++) {
//            num[i]=sc.nextInt();
//        }
        int[] num={2,3,4,4,4,5,4};
        Arrays.sort(num);
        System.out.println(b(num));
    }
}

//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int[] num=new int[4];
//        for (int i = 0; i <4; i++) {
//            num[i]=sc.nextInt();
//        }
//        int A=(num[0]+num[2])/2;
//        int B=(num[1]+num[3])/2;
//        int C=(num[3]-num[1])/2;
//        int b1=(num[2]-num[0])/2;
//        if(B!=b1){
//            System.out.println("No");
//        }else {
//            System.out.print(A + " " + B + " " + C);
//        }
//    }
//}
//import java.util.Stack;
//
//public class Parenthesis {
//    public boolean chkParenthesis(String A, int n) {
//        Stack<Character> lefts = new Stack<Character>();
//        if (A == null || A.length() != n) {
//            return false;
//        }
//        for (int i = 0; i < n; i++) {
//            if (A.charAt(i) == '(') {
//                lefts.push(A.charAt(i));
//            } else if (A.charAt(i) == ')') {
//                if (lefts.empty()) {
//                    return false;
//                } else {
//                    lefts.pop();
//                }
//            } else {
//                return false;
//            }
//        }
//        if (!lefts.empty()) {
//            return false;
//        } else {
//            return true;
//        }
//    }
//}

//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s="abcd12345ed125ss123456789";
//        String s1="";
//        int count=0;
//        int max=0;
//        int end=0;
//        for (int i = 0; i <s.length() ; i++) {
//            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
//                count++;
//                if(count>max){
//                    max=count;
//                    end=i;
//                }
//            }else{
//                count=0;
//            }
//        }
//        System.out.println(s.substring(end-max+1,end+1));
//    }
//}

//class Base {
//    public Base(String s) {
//        System.out.print("B");
//    }
//}
//
//class Derived extends Base {
//    public Derived(String s) {
//        super(s);
//        System.out.print("D");
//    }
//
//    public static void main(String[] args) {
//        new Derived("C");
//    }
//}

//class Person {
//    public String name = "Person";
//    int age = 0;
//}
//
//class Child extends Person {
//    public String grade;
//
//    public static void main(String[] args) {
//        Person p = new Child();
//        System.out.println(p.name);
//    }
//}

//import java.util.Scanner;
//
//public class Main {
//    public static int fun(){
//        int a=10;
//        try {
//            a=20;
//            System.out.println("+");
//            return a;
//
//        }finally{
//            System.out.println("2");
//            return a;
//        }
//    }
//    public static void main(String[] args) {
//        System.out.println(fun());
//    }
//}
