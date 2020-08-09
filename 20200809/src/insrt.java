import java.util.Arrays;
public class insrt{
    public static void main(String[] args) {
//        int [] arr={3,2,5,7,9};
        int[] arr={4,2,6,9,1,3,7};
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

//import java.util.Arrays;
//
//public class insrt {
//    public static void main(String[] args) {
//        int[] arr={4,2,6,9,1,3,7};
//        show(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void show(int[] arr){
//        int i,j;
//        for ( i = 1; i <arr.length ; i++) {
//            int key=arr[i];
//            for ( j = i-1; j >=0 ; j--) {
//                if(arr[j+1]<arr[j]){
//                    arr[j+1]=arr[j];
//                }else{
//                    break;
//                }
//            }
//            arr[j+1]=key;
//        }
//    }
//}
