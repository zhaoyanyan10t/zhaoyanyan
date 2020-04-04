import java.util.Scanner;

public class Main{
    static int count=0;
    public static void kou(int sum,int n){
        if(sum==0){
            count++;
        }
        if(sum<0||n<0){
            return ;
        }
        kou()
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int sum=40;
        int[] arr=new int[n+1];
        arr[0]=0;
        for (int i = 1; i <=n  ; i++) {
           int num=sc.nextInt();
           arr[i]=num;
        }
    }
}


//import java.util.*;
//
//public class Main {
//    public int count(int[] A, int n) {
//        n = A.length;
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (A[i] > A[j]) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//}
//
//
////import java.util.Scanner;
////
////public class Main {
////    public static int result(int n) {
////        int sum = 0;
////        while (n >= 3) {
////                sum += n / 3;
////                n = n % 3 + n / 3;
////
////        }
////        if (n == 2) {
////            sum = sum + 1;
////        }
////        return sum;
////    }
////
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        while (sc.hasNextInt()) {
////            int n = sc.nextInt();
////            if (n != 0) {
////                System.out.println(result(n));
////            }
////        }
////    }
////}
////
////
//////
////// import java.util.Scanner;
//////
//////public class Main {
//////    public static int result(int n){
//////        int sum=0;
//////        while(n>=3){
//////            if(n/3==0){
//////                sum+=n/3;
//////                n=n%3;
//////            }else{
//////                sum+=n/3;
//////                n=n%3+n/3;
//////            }
//////        }
//////        if(n==2){
//////            sum=sum+1;
//////        }
//////        return sum;
//////    }
//////    public static void main(String[] args) {
//////        Scanner sc=new Scanner(System.in);
//////        while(sc.hasNextInt()){
//////            int n=sc.nextInt();
//////            if(n!=0){
//////                System.out.println(result(n));
//////            }
//////        }
//////    }
//////}