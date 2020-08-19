import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int X=sc.nextInt();
        int[][] arr=new int[N][2];
        for (int i = 0; i <N ; i++) {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        System.out.println(judge(arr,X));
    }
    public static int judge(int[][] arr,int X){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(X==0){
                return 0;
            }

        int last=i;
            if(arr[i][1]<=X){
                int t=arr[i][0]+judge(arr,X-arr[i][1],last);
                if(t>max){
                    max=t;
                }
            }
        }
        return max;
    }
    public static int judge(int[][] arr,int X,int last){
        int max=Integer.MIN_VALUE;
        int t=0;
        for (int i = 0; i < arr.length; i++) {
            if(X==0){
                return 0;
            }
            if(last<i&&arr[i][1]<=X){
                t=arr[i][0]+judge(arr,X-arr[i][1],i);
                if(t>max){
                    max=t;
                }
            }
        }
        return t;
    }
    }
