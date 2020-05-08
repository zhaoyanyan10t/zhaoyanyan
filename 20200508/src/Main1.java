import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=sc.nextInt();
        int[] num=new int [n];
        for (int i = 0; i <n ; i++) {
            num[i]=sc.nextInt();
        }
        Count(sum,n);
        System.out.println();
    }
    public static int Count(int sum,int n){
        if(sum)
    }
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            float t=((n-1)/n)*100;
            System.out.printf("%.2f%%",t);
        }
    }
}
