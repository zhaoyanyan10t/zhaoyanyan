import java.util.*;

public class Main2 {
    public static void main(String[] args) {

        Set<Integer> se=new HashSet<>();
        Map<Integer,Integer> m=new HashMap<>();

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(judge(arr,n));
    }

    private static int judge(int[] arr, int n) {
        int i=0,j=n-1;
        int count=0;
        while(i<=j){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }else if(arr[i]>arr[j]){
                for(;arr[j]<arr[i];j--){
                    arr[j-1]+=arr[j];
                    arr[j]=0;
                    count++;
                }
            }else if(arr[i]<arr[j]){
                for(;arr[i]<arr[j];i++){
                    arr[i+1]+=arr[i];
                    arr[i]=0;
                    count++;
                }
            }
        }
        if(arr[i]!=arr[j])
            count++;
        return count;
    }
}
