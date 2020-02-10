import static java.lang.Math.*;

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int right=0,left=nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i]>nums[j]){
                    left=min(left,i);
                    right=max(right,j);
                }
            }
        }
        return right-left>0?right-left+1:0;// 防止都是有序的
    }
}
//class Solution {
//    public int compress(char[] chars) {
//        int count=1;
//        int j=0;
//        int p=0;
//        chars[j++]=chars[0];
//        for (int i = 1; i <chars.length ; i++) {
//
//            if(chars[i]==chars[p]){
//                count++;
////                chars[++i]=(char)count;
//            }else if(chars[i]!=chars[p]){
////                if(count>1){
////                    chars[j++]=(char)(count+'0');
////                }
//                if (count > 1) {
//                    for(char c : String.valueOf(count).toCharArray()) {
//                        chars[j++] = c;
//                    }
//                }
//                chars[j++]=chars[i];
//                count=1;
//                p=i;
//            }
//            if(i==chars.length-1){
//                if (count > 1) {
//                    for(char c : String.valueOf(count).toCharArray()) {
//                        chars[j++] = c;
//                    }
//                }
//            }
//        }
//        return j;
//    }
//}
//class Solution{
//    public boolean isPalindrome(String s){
//        char[] arr=s.toLowerCase().toCharArray();
//        int n=0,j=0;
//        for (int i = 0; i <arr.length ; i++) {
//         if((arr[i]>=48&&arr[i]<=57)||(arr[i]>=97&&arr[i]<=122)){
//             arr[n++]=arr[i];
//         }
//        }
//        n--;
//        while(j<=n){
//            if(arr[j++]!=arr[n--]){
//                return  false;
//            }
//        }return true;
//    }
//}
public class test {
    public static void main(String[] args) {
        int[] num={1,2,3,4};
        Solution e=new Solution();
        System.out.println(e.findUnsortedSubarray(num));

//        char[] ch={'a','a','b','b','c','c','c'};
//        char[] ch={'a','b','b','b','b','b','b','b','b','b','b','b','b','b'};
////        char[] ch={'a'};
//        Solution e=new Solution();
//        System.out.println(e.compress(ch));

//        Solution e=new Solution();
//        System.out.println(e.isPalindrome("aBc,D i,cba"));

    }
//        System.out.println(r());
//    }
//public static int r(){
//    int a=10;
//    int b=0;
////        int c=a/b;
//    try{
//        System.out.println(a);
////        System.out.println(a/b);
//        return 5;
//    }catch (Exception e){
//        System.out.println("kkk");
//        return 10;
//    }finally {
//        System.out.println("pp");
//        return 20;
//    }
//}
//        int[] arr = {1, 2, 3};
//
//        try {
//            System.out.println("before");
//            arr = null;
//            System.out.println(arr[100]);
//            System.out.println("after");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//        }
//        System.out.println("after try catch");

//        int num=10;
//        System.out.println(t(num));
//}
//    public static int t(int b){
//        try {
//            b+=10;
//            return b;
//        } catch(RuntimeException e1) {
//
//        }catch (Exception e) {
//
//        }finally{
//            b+=10;
//            return b;
//        }
//    }
}
