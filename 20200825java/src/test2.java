import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        int[] arr={3,2,5,7,9};
        show(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void show(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            //趟数
            for (int j = 0; j <arr.length-1 ; j++) {
                if(arr[j+1]<arr[j]){
                    int key=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=key;
                }
            }
        }
    }
}
