import java.util.Arrays;

public class work {
    public static void main(String[] args) {
//        int[][] arr=new int[3][];
//        int[][] arr=new int[][]{{1},{2,3},{4,5}};
//        System.out.println( Arrays.deepToString(arr));
//        int[] arr2={1,2,3,5,6,7,8,9,10};
//        int[][] arr = {     {1, 2, 3, 4},     {5, 6, 7, 8},     {9, 10, 11, 12} };
//        int[][] arr=new int[3][];
//        arr[0]=new int[2];
//        arr[1]=new int[3];
//        arr[2]=new int[4];
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.printf("%d\t", arr[row][col]);     }
//                System.out.println(""); }
//        Arrays.deepToString(arr);

//        int[] arr={11,2,8,42,5,61,7,81,9,10};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int[] arr1={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.equals(arr,arr1));
//        int[] arr1= Arrays.copyOfRange(arr,0,7);
//        System.out.println(Arrays.toString(arr1));
//        Arrays.fill(arr,2,7,9);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.binarySearch(arr,0,8,arr.length-4));
//        int[] arr1=arr.clone();
//        System.out.println(Arrays.toString(arr1));
//        int[] arr1=new int[arr.length];
//         System.arraycopy(arr,0,arr1,4,5);
//          System.out.println(Arrays.toString(arr1));
//        int[] arr1=Arrays.copyOf(arr,arr.length);
//        System.out.println(Arrays.toString(arr1));
//       System.out.println(Arrays.equals(arr,arr1));
//
//        System.out.println(Arrays.toString(arr4));
//

//        int[] arr3=new int[arr.length];
//         System.arraycopy(arr,0,arr3,2,5);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr));

//        int ret=Arrays.binarySearch(arr,7);
//        System.out.println(ret);
    }
    public static void main1(String[] args) {
        int[] arr={1,2,3,4,5};
        fun(arr);
        System.out.print(Arrays.toString(arr));
    }
    public static void fun(int[] arr){
       int[] ret=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ret[i]=arr[i]*2;
        }
        System.out.print(Arrays.toString(ret));
    }
}
