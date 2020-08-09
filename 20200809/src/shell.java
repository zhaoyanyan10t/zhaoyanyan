import java.util.Arrays;

public class shell {
    public static void main(String[] args) {
        int[] arr={4,2,6,9,1,3,7};
        int gap=arr.length;
        while(gap>1){
            show(arr,gap);
            gap/=2;
        }
        show(arr,gap);
        System.out.println(Arrays.toString((arr)));
    }
    public static void show(int[] arr,int gap){
        int i,j,key;
        for (i = 1; i <arr.length ; i++) {
            key=arr[i];
            for (j = i-gap; j >=0; j-=gap) {
                if(arr[j]>key){
                    arr[j+gap]=arr[j];
                }else{
                    break;
                }
            }
            arr[j+gap]=key;
        }
    }
}
