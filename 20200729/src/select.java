import java.util.Arrays;

public class select {
    public static void main(String[] args) {
        int [] arr={3,2,5,7,9};
        show(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void show(int[] arr){
        int i,j,key;
        for (i = 0; i < arr.length; i++) {

            for (j = i+1; j<arr.length;j++) {
                if(arr[i]>arr[j]){
                    key=arr[i];
                    arr[i]=arr[j];
                    arr[j]=key;
                }
            }

        }
    }
}
