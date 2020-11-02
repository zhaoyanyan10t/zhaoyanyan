import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int[] arr=new int[n];
        int[] sele=new int[q];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <q ; i++) {
            sele[i]=sc.nextInt();

        }
        for (int i = 0; i <q ; i++) {
           System.out.println(judge(arr,sele[i]));
        }
    }
    public static int judge(int[] arr,int tmp){
        int min=Integer.MAX_VALUE;
        int y=0;
        for (int i = 0; i <arr.length ; i++) {
            int cc=Math.abs(arr[i]-tmp);
            if(min>cc){
                min=cc;
                y=i;
            }
        }
        return arr[y];
    }

}
