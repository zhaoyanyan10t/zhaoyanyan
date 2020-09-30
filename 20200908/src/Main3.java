import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
        System.out.println(combination(2,3));
    }
    public static int combination (int r, int n) {
        // write code here
        long sum=1;

        if(n-r>r){
            r=n-r;
        }
        int t=r;
        while(t>0){
            sum*=n;
            t--;
            n--;
        }
        long sum1=1;
        while(r>0){
            sum1*=r;
            r--;
        }
        int ret= (int) (sum/sum1);
        System.out.println(sum+","+sum1);
        return ret;
    }
    public static int[] arrayMerge (int[] array1, int n, int[] array2, int m) {

        int[] arr=new int[n+m];
        int i=0,j=m-1,k=0;
        while(i<n&&j>=0){
            if(array1[i]<=array2[j]){
                arr[k++]=array1[i++];
            }else{
                arr[k++]=array2[j--];
            }
        }
        while(i<n){
            arr[k++]=array1[i++];
        }
        while(j>=0){
            arr[k++]=array2[j--];
        }
//        for (int i = 0; i<array1.length ; i++) {
//            arr[t++]=array1[i];
//        }
//        for (int i = 0; i <array2.length ; i++) {
//            arr[t++]=array2[i];
//        }
//        Arrays.sort(arr);

        return arr;
    }


}
