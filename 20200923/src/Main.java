import java.util.Scanner;

public class Main {
    public  static long judge(long m,long n){
        if(n>m||n<1||m<1){
            return 0;
        }
        if(m-n<n){
            n=m-n;
        }
        long sum=1;
        long count=n;
        while(count>0){
            sum*=m;
            m--;
            count--;
        }
        long sum1=1;
        while(n>0){
            sum1*=n;
            n--;
        }
        return sum/sum1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(judge(m,n));
    }
}
