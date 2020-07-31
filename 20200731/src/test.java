import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr={3,4,1,8,5,2,9,7,0};
        quick(arr,0,arr.length-1);


        System.out.println(Arrays.toString(arr));
    }
    public static void quick(int[] arr,int left,int right) {
        if(right-left>1) {
            int div = partation(arr, left, right);
            quick(arr, left, div);
            quick(arr, div + 1, right);
        }
    }
    public static void mao(int[] arr){
        boolean t=true;
        for (int i = 0; i <arr.length-1 ; i++) {//趟数
            for (int j = 0; j <arr.length-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int key=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=key;
                    t=false;
                }
            }
            if(t==true){
                break;
            }
        }
    }
    public static int partation(int[] a,int low,int high){
        //找基准值
        int key=a[low];
        while(low<high){
            while(low<high&&a[high]<=key){
                high--;
            }
            a[low]=a[high];
            while(low<high&&a[low]>=key){
                low++;
            }
            a[high]=a[low];
        }
        a[low]=key;
        return low;
    }
}
