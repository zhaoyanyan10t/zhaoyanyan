import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int P=sc.nextInt();
        int[][] arr=new int[P][3];
        for (int i = 0; i <P ; i++) {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
            arr[i][2]=sc.nextInt();
        }
        int X=sc.nextInt();
        System.out.println(judge(arr,X));
    }
    public static int judge(int[][] arr,int x){
        int min=Integer.MAX_VALUE;
        int t=0;
        if(x==0){
            return 0;
        }
        for (int i = 0; i <arr.length; i++) {
                if (arr[i][1] == x) {
                    t=arr[i][2]+judge(arr, arr[i][0]);
                    if(t<min){
                        min=t;
                    }
                }
        }
        return min;
    }
}
