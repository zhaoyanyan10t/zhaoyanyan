import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
//                    return new int[]{i,j};
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }
}
//class Solution {
//    public int thirdMax(int[] nums) {
//        Arrays.sort(nums);
//        int max=nums[nums.length-1];
//        int count=0;
//        int sum=0;
//        int two=0;
//        for (int i =nums.length-1; i>=0 ; i--) {
//            if(nums[i]==max){
//                count++;
//            }else if(nums[i]<max){
//                 two=nums[i];
//                sum++;
//            }else if(nums[i]<two){
//                break;;
//            }
//        }
//
//        int one=nums[0];
//        int two=(int)Long.MIN_VALUE,three=(int)Long.MIN_VALUE;
//        for (int i = 1; i < nums.length; i++) {
//                if(nums[i]>one){
//                    three=two;
//                    two=one;
//                    one=nums[i];
//            }else if(nums[i]>two&&nums[i]<one){
//                three=two;
//                two=nums[i];
//            }else if(nums[i]>three&&nums[i]<two){
//                three=nums[i];
//            }
////            if(nums[i]==one||nums[i]==two||nums[i]==three) continue;
////            if(nums[i]>one){
////                three=two;
////                two=one;
////                one=nums[i];
////            }else if(nums[i]>two){
////                three=two;
////                two=nums[i];
////            }else if(nums[i]>three){
////                three=nums[i];
////            }
//        }
//        if(three==(int)Long.MIN_VALUE) return one;
//        return three;
//    }
//}
//class Solution {
//    public int[] plusOne(int[] digits) {
//        for (int i =digits.length-1; i>=0 ; i--) {
//            digits[i]++;//给最后一个数加一
//            digits[i]=digits[i]%10;//如果最后一个数是9 加一就成为10 就取余，取0即可
//            if(digits[i]!=0){//如果最后一个数不是9，则上一步取余还是原来的数， 则直接return
//                return digits;
//            }
//        }
//        //如果此数全为9，例如9,99,999，则直接输出让数组长度加一，
//        // 并且初始化第一个数为1，其余的为0，输出此数
//        digits=new int[digits.length+1];
//        digits[0]=1;
//        return digits;
//    }
//}
public class test {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int t=9;
        Solution e=new Solution();
        System.out.println(Arrays.toString(e.twoSum(nums,t)));

//        static int a=10;

//        int[] arr={3,2,2,2,1};
//        Solution e=new Solution();
//        System.out.println(e.thirdMax(arr));

////        int[] arr={1,2,3};
////        int[] arr={1,2,9};
//        int[] arr={9};
//        Solution e=new Solution();
//        System.out.println(Arrays.toString(e.plusOne(arr)));//将数组转化为字符串
    }
}
