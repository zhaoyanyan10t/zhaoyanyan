import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[] num=new int[M];
        for (int i = 0; i <M ; i++) {
            num[i]=sc.nextInt();
        }
        int[] arr=new int[N];
        for (int i = 0; i <N ; i++) {
            arr[i]=i+1;
        }
        for (int i = 0; i < M; i++) {
            if(num[i]==1){
                change(arr);
            }else if(num[i]==2){
                change2(arr);
            }
        }
//        for (int i = 0; i <N ; i++) {
//            if(i==N-1){
//                System.out.println(arr[i]);
//            }else {
//                System.out.print(arr[i] + " ");
//            }
//        }
        System.out.println(Arrays.toString(arr));
    }
    public static void change(int[] arr){
        int tmp=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=tmp;
    }
    public static void change2(int[] arr){

        for (int i = 0; i < arr.length; i+=2) {
            int tmp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=tmp;
        }
    }
}
