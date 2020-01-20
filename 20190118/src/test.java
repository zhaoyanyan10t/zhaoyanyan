class Solution {
    public int searchInsert(int[] nums, int target) {
        int right=nums.length-1;
        int left=0;
        int mid;
        while(left<=right){
            mid=(left+right)/2;
            if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                return mid;
            }
        }
        return left;
    }
}
//class Solution{
//    public int removeElement(int[] nums, int val){
//        int count=0;
//        for (int i = 0; i <nums.length ; i++) {
//            if(nums[i]!=val){
//                nums[count]=nums[i];
//                count++;
//            }
//        }
//        return count;
//    }
//}
public class test {
    public static void main(String[] args) {
        int[] num={1,3,5,6};
        Solution e=new Solution();
        System.out.println(e.searchInsert(num,7));
        
//        int[] num={3,2,2,3};
//        Solution e=new Solution();
//        System.out.println(e.removeElement(num,3));
    }
}
