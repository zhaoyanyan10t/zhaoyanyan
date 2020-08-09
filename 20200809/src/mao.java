import java.util.Arrays;

public class mao {
    public static void main(String[] args) {
        int[] arr={4,2,6,9,1,3,7};
        show(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void show(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    int  tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }
}
