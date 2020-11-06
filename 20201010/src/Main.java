import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {
    public  static int count;
    public static void main(String[] args) {
        System.out.println("he".equals("He"));
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(numOf(n,k));
    }
    public static int numOf(int n,int k){
        int tmp=judge( n,k,0);
        return tmp;
    }

    private static int  judge(int n, int k, int m) {
        if(n==0&&k>=0){
            count++;
        }
        if(n<0||k<0){
            return 0;
        }
        for (int i = m; i <n ; i++) {
            judge(n-i,k-1,m+1);
            judge(n-i,k,m+1);
        }
        return count;
    }
}
