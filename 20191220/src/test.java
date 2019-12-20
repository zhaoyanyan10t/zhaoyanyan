import java.util.ArrayList;

import static java.lang.Math.pow;
class Solution {
    public void reOrderArray(int [] array) {
        int[] a=new int[array.length];
        int j=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                a[j]=array[i];
                j++;
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                a[j]=array[i];
                j++;
            }
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]);
        }
    }
}
//class Solution {
//    public int minNumberInRotateArray(int [] array) {
//        int min=array[0];
//        for(int i=0;i<array.length;i++){
//            if(min>array[i]){
//                min=array[i];
//            }
//        }
//        return min;
//    }
//}
public class test {
    public static double Power(double base, int exponent) {
        return pow(base,exponent);
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8};
        Solution e=new Solution();
        e.reOrderArray(arr);

//        System.out.println(e.minNumberInRotateArray(arr));
//        System.out.println(Power(2.2,2));
    }
}
