import java.util.Arrays;
class Solution {
    public int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sum1=0;
            int sum2=0;
            for (int j = 0; j <i ; j++) {
                sum1+=nums[j];
            }
            for (int z = i+1; z <nums.length ; z++) {
                sum2+=nums[z];
            }
            if(sum1==sum2){
                return i;
            }
        }
        return -1;
    }
}
//class Solution {
//    public int[] sortArrayByParity(int[] A) {
//        int[] arr=new int[A.length];
//        int count=0;
//        for (int i = 0; i <A.length ; i++) {
//            if(A[i]%2==0){
//                arr[count]=A[i];
//                count++;
//            }
//        }
//        for (int i = 0; i <A.length ; i++) {
//            if(A[i]%2!=0){
//                arr[count]=A[i];
//                count++;
//            }
//        }
//        return arr;
//    }
//}
//class Solution {
//    public String reverseOnlyLetters(String S) {
//        char[] arr=S.toCharArray();
//        int left=0;
//        int right=S.length()-1;
//        while(left<right) {
//            if(arr[left]>=65&&arr[left]<=90||arr[left]>=97&&arr[left]<=122){
//               if(arr[right]>=65&&arr[right]<=90||arr[right]>=97&&arr[right]<=122){
//                   char c=arr[left];
//                   arr[left]=arr[right];
//                   arr[right]=c;
//                   right--;
//                   left++;
//               }else{
//                   right--;
//               }
//            }else{
//                left++;
//            }
//        }
//        String w="";
//        for (char x:arr) {
//            w+=x;
//        }
//        return w;
//    }
//}
//class Solution {
//    public int[] sortedSquares(int[] A) {
//        for (int i = 0; i <A.length ; i++) {
//            A[i]=A[i]*A[i];
//        }
//        Arrays.sort(A);
//        return A;
//    }
//}
public class test {
//    public void loop(){
//
//    }
    public static void main(String[] args) {
        int[] arr={1,7,3,6,5,6};
        Solution e=new Solution();
        System.out.println(e.pivotIndex(arr));

//        int[] a={3,1,2,4,5};
//        Solution e=new Solution();
//        System.out.println(Arrays.toString(e.sortArrayByParity(a)));

//        int x=10;
//        while(x){//错误
//
//        }
//        String s="ab-cd-";
//        Solution e=new Solution();
//        System.out.println(e.reverseOnlyLetters(s));


//        int[] arr={-1,0,1,2,4};
//        Solution e=new Solution();
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(e.sortedSquares(arr)));

//        byte a=10;
//        int b=-a;
//        float c=10;
//        double d=100;
//        int e=(int)8826.0;
//        System.out.println(b);
//        System.out.println(a);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
    }
}
