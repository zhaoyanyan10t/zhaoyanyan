import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            float n2=fib(n);
            float n1=sum(n);
            float num=(n1/n2)*100;
            System.out.println(n2);
            System.out.printf("%.2f",num);
            System.out.println("%");
        }
    }
    public static float fib(int n){
        if(n==1){
            return 1;
        }
        return n*fib(n-1);
    }
    public static float sum(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        return (n-1)*(sum(n-1)+sum(n-2));
    }
}
