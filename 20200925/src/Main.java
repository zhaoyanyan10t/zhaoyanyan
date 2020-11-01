import java.util.Scanner;

public class Main {
//    public static int fib(int n){
//        if(n==1||n==2){
//            return 1;
//        }
//        int a=1;
//        int b=1;
//        int c=0;
//        while(n>2){
//            c=a+b;
//            a=b;
//            b=c;
//            n--;
//        }
//        return c;
//    }
    public static int fib(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        for (int i = 1; i <n ; i++) {
            System.out.println(fib(n));
//        }

    }
}
