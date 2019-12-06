//class T{
//    public static void printArray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }     }
//}
//public class test {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3};
//        int[] output = transform(arr);
//        printArray(output);
//    }
//
//    public static void printArray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }     }
//
//    public static int[] transform(int[] arr) {
//        int[] ret = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            ret[i] = arr[i] * 2;
//        }
//        return ret;
//    } }
import java.util.Arrays;
import java.util.Scanner;
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] result=new int[A.length];
        int left=0;

        for (int i = 0; i <A.length ; i++) {
            if(A[i]%2==0){
                result[left]=A[i];
                left++;
            }
        }
        for (int i = 0; i <A.length ; i++) {
            if(A[i]%2!=0){
                result[left]=A[i];
                left++;
            }
        }
        return result;
    }
}
//class Solution {
//    public int[] sortArrayByParity(int[] A) {
//        int[] ans = new int[A.length];
//        int left = 0,right = A.length - 1;
//        for (int i = 0; i < A.length; i++) {
//            if(A[i]%2 == 0){
//                ans[left] = A[i];
//                left++;
//            }else{
//                ans[right] = A[i];
//                right--;
//            }
//        }
//        return ans;
//    }
//}
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        Solution Solution = new Solution();
        //变为数组打印出来
        System.out.println(Arrays.toString(Solution.sortArrayByParity(arr)));

//       pr(Solution.sortArrayByParity(arr));
    }
//        public static void pr(int[] ar){
//            for (int i = 0; i < ar.length; i++) {
//                System.out.print(ar[i]+" ");
//            }
//        }
        ////        for (int i = 0; i <arr.length ; i++) {
////            if(arr[i]%2==0){
////                System.out.print(arr[i]+" ");
////            }
////        }
////        for (int i = 0; i <arr.length ; i++) {
////            if(arr[i]%2!=0){
////                System.out.print(arr[i]+" ");
////            }
////        }
//
//    }
//}

}
