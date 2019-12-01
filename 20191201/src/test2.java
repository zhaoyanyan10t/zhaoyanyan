import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入字符串");
        String s=sc.nextLine();
//     char[] a=s.toCharArray();
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i]+" "); }
            String[] result=s.split(" ");
        for (int i = 0; i <result.length ; i++) {
            System.out.print(reverse(result[i])+" ");
        }

    }

    private static String reverse(String s) {
        char[] a=s.toCharArray();

        for (int i = 0; i <(a.length)/2 ; i++) {
            int j=a.length-i-1;
            char tmp=a[i];
            a[i]=a[j];
            a[j]=tmp;
        }
        return new String(a);
    }
}
//public class test2 {
//    public static void main(String[] args) {
//        String s="abc def";
////     char[] a=s.toCharArray();
////        for (int i = 0; i < a.length; i++) {
////            System.out.print(a[i]+" "); }
//        String[] result=s.split(" ");
//        for (int i = 0; i <result.length ; i++) {
//            reverse(result[i]);
////            System.out.println(t);
//        }
//
//    }
//
//    private static void reverse(String s) {
//        char[] a=s.toCharArray();
//        for (int i = 0; i <(a.length)/2 ; i++) {
//            int j=a.length-i-1;
//            char tmp=a[i];
//            a[i]=a[j];
//            a[j]=tmp;
//        }
//        System.out.print(a+" ");
//    }
//}
