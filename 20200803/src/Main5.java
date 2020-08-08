import java.util.Scanner;

public class Main5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int left=0;
        int right=n-1;
        while(left<right){
            if(arr[left]+arr[right]>k){
                right--;
            }else if(arr[left]+arr[right]<k){
                left++;
            }else{
                if(left==0||arr[left]!=arr[left-1]||right==n-1){
                    System.out.println(arr[left]+" "+arr[right]);
                }
                left++;
                right--;
            }

        }
    }
}