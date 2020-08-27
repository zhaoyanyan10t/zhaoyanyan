import java.util.Arrays;

public class test4 {
    public static void main(String[] args) {
        int[] arr={4,2,6,1,3,8,9};
        for (int root = (arr.length/2)-1; root >=0 ; root--) {

            shift(arr,root,arr.length);
        }
        for (int i = arr.length-1; i >=0 ; i--) {
            swap(arr,0,i);
            shift(arr,0,i);
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int last) {
        int key=arr[i];
        arr[i]=arr[last];
        arr[last]=key;
    }

    private static void shift(int[] arr, int parent,int size) {
        int child=parent*2+1;
        while(child<size){
            if(child+1<size&&arr[child]>arr[child+1]){
                child+=1;
            }
            if(arr[child]<arr[parent]){
                int key=arr[parent];
                arr[parent]=arr[child];
                arr[child]=key;
            }
            parent=child;
            child=parent*2+1;
        }
    }
}
