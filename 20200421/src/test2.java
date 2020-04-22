import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int singleNumber(int[] nums) {
        for (int i = 0; i <nums.length-1 ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i]==nums[j]){
                    break;
                }
                }
            }
            return 0;
        }
//        Set<Integer> s=new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
////            如果加入不成功，那说明之前有加入过一样的，就移除之前加入的
//            if(!s.add(nums[i])){
//                s.remove(nums[i]);
//            }
//        }
//        Object[] o=s.toArray();
//        return (int)o[0];


//        Arrays.sort(nums);
//        int ret=0;
//        for (int i = 0; i <nums.length ; i+=2) {
//            if(i<nums.length-1){
//            if(nums[i]!=nums[i+1]){
//                ret=nums[i];
//                break;
//            }}
//            else{
//                ret=nums[nums.length-1];
//            }
//        }
//        return ret;

//        int ret=0;
//        for (int i = 0; i < nums.length; i++) {
//            ret^=nums[i];
//        }
//        return ret;
    }
//}
public class test2 {
}
