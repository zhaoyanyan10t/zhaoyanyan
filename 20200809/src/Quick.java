import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] arr={4,2,6,9,1,3,7};
        show(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void show(int[] arr,int left,int right){
        if(right-left>1){
        int div=partion(arr,left,right);
        show(arr,0,div);
        show(arr,div+1,right);}
    }
    public static int partion(int[] arr,int left,int right){
        int i=left;
        int j=right-1;
        int key=arr[j];
        while(i<j){
            while(i<j&&arr[i]<=key){
                i++;
            }
            while(i<j&&arr[j]>=key){
                j--;
            }

            if(i<j)
            swap(arr,i,j);
        }
        swap(arr,i,right-1);
        return i;
    }
    public static void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
