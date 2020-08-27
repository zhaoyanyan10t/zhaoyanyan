import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr={3,2,5,7,9};
        show(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void show(int[] arr){
        int i,j;
        for ( i = 1; i <arr.length; i++) {
            int key=arr[i];
            for ( j = i-1; j>=0 ; j--) {
                if(arr[j]>key){
                    arr[j+1]=arr[j];
                }else{
                    break;
                }
            }
            arr[j+1]=key;
        }
    }
}
