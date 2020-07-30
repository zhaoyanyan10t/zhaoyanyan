import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        int [] arr={3,2,5,7,9};
        show(arr);
        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }
    public static void show(int[] arr){
        int i,j,key;
        for (i = 1; i < arr.length; i++) {
            key=arr[i];
            for (j = i-1; j>=0 ;j--) {
                if(arr[j+1]<arr[j]){
                    arr[j+1]=arr[j];
                }else{
                    break;
                }
            }
            arr[j+1]=key;
        }
    }
}
