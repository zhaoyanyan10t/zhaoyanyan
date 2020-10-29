import java.util.Scanner;

public class Main1 {
    public  static long judge(long m){
        if(m<=1) {
            return 1;
        }
        return m*judge(m-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long m=sc.nextInt();
        long n=sc.nextInt();
        if(m-n<n){
            n=m-n;
        }
        System.out.println(judge(m)/(judge(m-n)*judge(n)));
    }
}
