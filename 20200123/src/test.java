import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i <nums.length ; i++) {
            for (int j =i+1; j <nums.length ; j++) {
                if(nums[i]==nums[j])
                    return true;
            }
        }
        return false;
    }
}
//class Solution {
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//     System.arraycopy(nums2,0,nums1,m,n);
//        Arrays.sort(nums1);
//    }
//}
//class Solution {
//    public int lengthOfLastWord(String s) {
//        int end=s.length()-1;
//        while(end>=0&&s.charAt(end)==' '){
//            end--;
//        }
//        if(end<0){
//            return 0;
//        }
//        int start=end;
//        while(start>=0&&s.charAt(start)!=' '){
//            start--;
//        }
//        return end-start;
//    }
//}
public class test {
//    private float f = 1.0f;
//    int m = 12;
//    static int n = 1;
    public static void main(String[] args) {
        int[] num={1,2,3,4};
        Solution e=new Solution();
        System.out.println(e.containsDuplicate(num));

//        test t = new test();
//        this.n
//        int[] nums1={1,2,3,0,0,0,0};
//        int[] nums2={2,5,6};
//        int m=3,n=3;
//        Solution e=new Solution();
//        System.out.println(e.merge(nums1,m,nums2,n));

//        String str="hello worlded ";
//        Solution e=new Solution();
//        System.out.println(e.lengthOfLastWord(str));
    }
}
