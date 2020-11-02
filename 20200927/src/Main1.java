import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(judge(arr));
    }
    public static int judge(int[] arr){
        int count=0;
        for (int i = 0; i <arr.length-2 ; i++) {
            for (int j = i+1; j <arr.length-1; j++) {
                for (int k = j+1; k <arr.length ; k++) {
                    if(arr[i]<=arr[j]&&arr[j]<=arr[k]){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
