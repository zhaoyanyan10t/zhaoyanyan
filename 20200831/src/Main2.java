import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num=new int[n];
        for (int i = 0; i <num.length ; i++) {
            num[i]=sc.nextInt();
        }
        for (int i = 0; i <num.length-2 ; i++) {
            if(num[i]>num[i+2]){
                swap(num,i,i+2);

            }
        }
//        Arrays.sort(num);
        for (int i = 0; i <num.length ; i++) {
            if(i!=num.length-1)
            System.out.print(num[i]+" ");
            else
                System.out.print(num[i]);
        }
    }

    private static void swap(int[] arr,int a,int b) {
        int tmp=arr[a];
        arr[a]=arr[b];
        arr[b]=tmp;
    }

    public static void result(int[] arr){
        for (int i = 0; i < arr.length-2; i++) {
            if(arr[i]<arr[i+2]){
                continue;
            }else{

            }
        }
    }
}
//    public static void main1(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int N=sc.nextInt();
//        int M=sc.nextInt();
//        int[] Num=new int[N];
//        for (int i = 0; i <N ; i++) {
//            Num[i]=sc.nextInt();
//        }
//        int [] Mum=new int[M];
//        String[][] MM=new String[M][3];
//        for (int i = 0; i < M; i++) {
//            Mum[i]=sc.nextInt();
//            for (int j = 0; j <2 ; j++) {
//                MM[i][j]=sc.next();
//            }
//            MM[i][2]=sc.next();
//            if("left".equals(MM{i][0])){
//                left++;
//            }
//        }
//    }
//}
