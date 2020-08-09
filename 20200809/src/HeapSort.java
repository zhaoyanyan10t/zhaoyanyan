//建小堆
import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
//        int[] arr={4,2,6,1,3,8,9};
        int[] arr={4,2,6,9,1,3,7};
        create(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void create(int[] arr){
        for (int root = (arr.length/2)-1; root >=0; root--) {
            shift(arr,root);
        }
    }
    public static void shift(int[] arr,int parent){
        int child=parent*2+1;
        int size=arr.length;

        while(child<size){
            if(arr[child+1]<size&&arr[child]>arr[child+1]){
            child+=1;
            }
            if(arr[parent]>arr[child]){
                int tmp=arr[parent];
                arr[parent]=arr[child];
                arr[child]=tmp;
            }
            parent=child;
            child=parent*2+1;
        }
    }
}
