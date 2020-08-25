import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] num=new int[m][n+1];
        for (int i = 0; i <m ; i++) {
            for (int j = 1; j <n+1 ; j++) {
                num[m][n]=sc.nextInt();
            }
        }
        for (int i = 0; i <num[0].length ; i++) {
            SUM(num,0,i,n);
        }
    }
    public static int SUM(int[][] arr,int m,int n,int s){
//        int m=arr.length;
//        int n=arr[0].length;
        List<Integer> list=new ArrayList<>();
        list.add(arr[m][n]);
        m++;
        n=s-n;
        for (int i = 0; i <n; i++) {

        }
        return 1;
    }
}
