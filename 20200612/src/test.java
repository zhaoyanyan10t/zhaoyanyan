import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
//            int min=Integer.MIN_VALUE;
//            int =left
            for (int i = 0; i < n; i++) {
                int left=-1,right=-1;
                int nn=arr[i];
                for (int j = i; j>=0; j--) {
                    if(arr[j]<nn){
                        left=j;
                        break;
                    }
                }
                for (int j = i; j <n; j++) {
                    if(arr[j]<nn){
                        right=j;
                        break;
                    }
                }
                System.out.println(left+" "+right);
            }
        }
    }
}
