import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(SUM(n));
    }
    public static int SUM(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return SUM(n-1)+SUM(n-2);
    }


}
