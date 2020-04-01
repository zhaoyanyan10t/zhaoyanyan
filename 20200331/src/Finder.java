import java.util.*;

public class Finder {
    public static int findKth(int[] a, int n, int K) {
        // write code here
        if(K<1||K>n){
            return 0;
        }
        Arrays.sort(a);
        for (int i = a.length-1; i >=0 ; i--) {
            K--;
            if(K==0){
                return a[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr={1,3,5,2,2};
        int k=3;
        int n=arr.length;
        System.out.println(findKth(arr,n,k));
    }
}