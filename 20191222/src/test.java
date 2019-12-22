class Solution {
    public int FirstNotRepeatingChar(String str) {
        int j=0;
        for (int i = 0; i <str.length() ; i++) {
            for (j = 0; j <str.length() ; j++) {
                if(i==j){
                    continue;
                }
                if(str.charAt(i)==str.charAt(j)){
                    break;
                }
            }
            if(j==str.length()){
                return i;
            }
        }
        return 0;
    }
}
//class Solution {
//    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
//        int t=0;
//        int j=0;
//        for (int i = 0; i <array.length ; i++) {
//            for (j = 0; j <array.length ; j++) {
//                if(i==j){
//                    continue;
//                }
//                if(array[i]==array[j]){
//                    break;
//                }
//            }
//            if(j==array.length){//走到这，说明没有break，此时i后面的所有数已走完，没有发现相同的
//              if(t==0){
//                  num1[0]=array[i];
//              }else if(t==1){
//                  num2[0]=array[i];
//              }
//              t++;
//            }
//        }
//        System.out.println(num1[0]+" "+num2[0]);
//    }
//}
//class Solution {
//    public int GetNumberOfK(int [] array , int k) {
//        int count=0;
//        for (int i = 0; i <array.length ; i++) {
//            if(array[i]==k){
//                count++;
//            }
//        }
//        return count;
//    }
//}
//class Solution {
//    public int NumberOf1Between1AndN_Solution(int n) {
//        int count = 0;
//        for (int i = 1; i < n + 1; i++) {
//            String str = Integer.toString(i);
//            char[] data = str.toCharArray();
//            for (int j = 0; j < data.length; j++) {
//                if (data[j]== '1') {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//}
public class test {
    public static void main(String[] args) {
        String s="abAcdabAd";
        Solution e=new Solution();
        System.out.println(e.FirstNotRepeatingChar(s));

//        int[] arr={1,2,3,2,3,4};
//        int[] num1=new int[1];
//        int[] num2=new int[1];
//        Solution e=new Solution();
//        e.FindNumsAppearOnce(arr,num1,num2);
//        System.out.println(e.GetNumberOfK(arr,t));
//        System.out.println(e.NumberOf1Between1AndN_Solution(10000));
//        String s="100";
//        int h=new Integer(s);
//        System.out.println(h==100);
//        System.out.println(s=="100");
//        int i=999;
//        String sss=String.valueOf(i);
//        System.out.println(sss=="999");
    }
}