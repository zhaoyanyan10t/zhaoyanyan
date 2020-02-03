import java.util.Arrays;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr={-1,-1};
        int count=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]==target){
                arr[0]=i;
                break;
            }
        }
        for (int i = nums.length-1; i >=0 ; i--) {
            if(nums[i]==target){
                arr[1]=i;
                break;
            }
        }
        return arr;
    }
}
public class test {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        Solution e=new Solution();
        System.out.println(Arrays.toString(e.searchRange(arr,6)));
    }
}
