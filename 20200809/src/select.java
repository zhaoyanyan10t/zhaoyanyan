import java.util.Arrays;

public class select {
    public static void main(String[] args) {
        int[] arr={4,2,6,9,1,3,7};
        show(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void show(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j]){
                    int key=arr[i];
                    arr[i]=arr[j];
                    arr[j]=key;
                }
            }
        }
    }
}
