import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        int[] num=new int[nums.length];
        for (int i = 0; i <nums.length; i++) {
            num[(i+k)%nums.length]=nums[i];
        }
        for (int i = 0; i <num.length ; i++) {
           nums[i]=num[i];
        }
        System.out.println(Arrays.toString(num));
    }
}
//class Solution {
//    public String toLowerCase(String str) {
//        String s="";
//        for (int i = 0; i <str.length(); i++) {
//            char ch=str.charAt(i);
//            if(str.charAt(i)>=65&&str.charAt(i)<=90){
//                ch+=32;
//            }
//            s+=ch;
//        }
//        return s;
//    }
//}
public class test {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7};
        Solution e=new Solution();
        e.rotate(num,3);

//        System.out.println(e.toLowerCase("AsEd"));

//        int a=20;
//        int b=5;
//        System.out.println(a+b+""+(a+b)+b);
    }
}
