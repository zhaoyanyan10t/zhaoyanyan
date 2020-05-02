import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] num=new int[n];
            for (int i = 0; i <n ; i++) {
                num[i]=sc.nextInt();
            }
            int x=sc.nextInt();
            for (int i = 0; i <n ; i++) {
                if(num[i]==x){
                    System.out.println(i);
                    break;
                }
                else{
                    if(i==n-1){
                        System.out.println("-1");
                    }
                }
            }
        }
    }
}
