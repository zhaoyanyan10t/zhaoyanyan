import java.util.Scanner;

public class test{
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s1=sc.nextLine();
//        String s2=sc.nextLine();
        String s1="they are students";
        String s2="aeiou";
        for (int i = 0; i <s2.length() ; i++) {
            s1=s1.replaceAll(String.valueOf(s2.charAt(i)),"");

        }
        System.out.println(s1);
    }
}

//import java.util.Scanner;
//
//public class test{
//    public static int buy(int n){
//        if(n%8==0){
//            return n/8;
//        }
//        for (int i = 0; i <=n/6 ; i++) {
//            for (int j = 0; j <=n/8; j++) {
//                if(i*6+j*8==n){
//                    return i+j;
//                }
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
////        Scanner sc=new Scanner(System.in);
////        int n=sc.nextInt();
//        int n=52;
//        System.out.println(buy(n));
//    }
//}
//public class Test {
//    public  int aMethod() {
//         int i = 0;
//        i++;
//        return i;
//    }
//    static int i;
//    public static void main(String args[]) {
//
//        Test test = new Test();
//        test.aMethod();
//        int j = test.aMethod();
//        System.out.println(j);
//    }
//}
//
//
//
////    static int i;
////    static String s;
////    public static void main(String[] args) {
////        System.out.println(i);//0
////        System.out.println(s);//null
////    }
//
