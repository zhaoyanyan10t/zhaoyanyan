import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
        int n=100;
        String str=n+"";
        int len=str.length();
        StringBuffer str1=new StringBuffer();
        for (int i = 0; i <str.length(); i++) {
            str1.insert(i,str.charAt(len-1-i));
        }
        System.out.println(str1);
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int n=16;
//        int num=1;
//        int count=0;
//        while(n>=1){
//            num=num*n;
//            n--;
//        }
//        System.out.println(n/5);
//        while(num%10==0){
//            count++;
//            num=num/10;
//        }
//        System.out.println(count);
    }
}



//import java.util.Scanner;
//
//public class Main {
//    public static void test() {
//        System.out.println("o");
//    }
//    public static void main(String[] args) {
//        ((Main)null).test();
////        Scanner sc=new Scanner(System.in);
////        while (sc.hasNextInt()) {
////            int n=sc.nextInt();
////            int count=2;
////            int t=0;
////
////            while(count<=n) {
////                t=(t+3)%count;
////                count++;
////            }
////            System.out.println(t);
//        }
//
//}
//
////import java.util.Scanner;
////
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc=new Scanner(System.in);
////        while (sc.hasNextInt()) {
////            int n=sc.nextInt();
////            int count=1;
////            int t=0;
////
////            while(count<n) {
////                if(t!=n)
////                t=(t+3)%n;
////                else{
////                    t=t+1;
////                }
////                count++;
////            }
////            System.out.println(t);
////        }
////    }
////}
//
////import java.util.Arrays;
////import java.util.Scanner;
////
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc=new Scanner(System.in);
////        String str=sc.nextLine();
////        String[] str1=str.split(" ");
////        int[] num=new int[str1.length-1];
////        for (int i = 0; i <num.length ; i++) {
////            num[i]=Integer.valueOf(str1[i]);
////        }
////        int k=Integer.valueOf(str1[num.length]);
////        Arrays.sort(num);
////        for (int i = 0; i < k; i++) {
////            System.out.print(num[i]+" ");
////        }
//
////        Scanner sc=new Scanner(System.in);
////        int n=sc.nextInt();
////        int count=2;
////        int t=0;
////        while(count<=n) {
////            t=(t+3)%count;
////            count++;
////        }
////        System.out.println(t);
