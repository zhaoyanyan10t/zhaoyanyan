import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int[] num=new int[2];
            int count=0;
            for (int i = 0; i <n ; i+=2) {
                if(count==0&&arr[i]!=arr[i+1]){
//                    num[0]=arr[i];

                    System.out.println(arr[i]);
                    i--;
                    count++;
                }
                else if(count==1&&i==n-1){
                    System.out.println(arr[i]);
                    break;
                }
                else if(count==1&&arr[i]!=arr[i+1]){
                    System.out.println(arr[i]);
                    break;
                }

            }
        }
    }
}
