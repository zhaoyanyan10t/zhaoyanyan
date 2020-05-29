package code1;

import java.util.Arrays;

class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int count=0;
        int len=array.length/2;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]==array[len]){
                count++;
            }
        }
        if(count>len){
            return array[len];
        }
        return 0;
//        Arrays.sort(array);
//        if(array.length==1){
//            return array[0];
//        }
//        int index=0;
//        int count=1;
//        int len=array.length/2;
//        for (int i = 1; i <array.length; i++) {
//            int a=array[i];
//
//            if(a==array[i-1]){
//                count++;
//            }else{
//                count=1;
//            }
//            if(count>len){
//                index=a;
//                break;
//            }
//        }
//        return index;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution e=new Solution();
        int[] array={1};
        System.out.println(e.MoreThanHalfNum_Solution(array));
    }
}
