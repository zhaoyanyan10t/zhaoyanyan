import java.util.Arrays;

public class shell {
    public static void main(String[] args) {

        int [] arr={3,2,5,7,9};
        int gap=arr.length;
        while(gap>1) {
            show(arr,gap);
            gap=gap/2;
        }
        show(arr,1);
        System.out.println(Arrays.toString(arr));

    }
    public static void show(int[] arr,int gap){
        int i,j,key;
        for (i = 1; i < arr.length; i++) {
            key=arr[i];
            for (j = i-gap; j>=0 ;j-=gap) {
                if(key<arr[j]){
                    arr[j+gap]=arr[j];
                }else{
                    break;
                }
            }
            arr[j+gap]=key;
        }
    }
}
