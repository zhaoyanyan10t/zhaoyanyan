import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] num=new int[n];
            for (int i = 0; i <n ; i++) {
                num[i]=sc.nextInt();
            }
            int max=num[0];
            for (int i = 0; i <n; i++) {
                int sum = 0;
                for (int j = i; j < n; j++) {
                    sum += num[j];
                    if (sum > max) {
                        max = sum;
                    }
                }
            }
            System.out.println(max);
        }
    }
}
