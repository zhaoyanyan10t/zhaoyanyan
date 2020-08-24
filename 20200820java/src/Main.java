import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={3,6,5,1,8};
        System.out.println(maxSumDivFive(arr));
    }
    public static int maxSumDivFive (int[] nums) {
        // write code here
        int sum=0;
        Arrays.sort(nums);
        for (int i = 0; i <nums.length ; i++) {
            int t=nums[i];
            if(t%5==0){
                sum+=t;
                break;
            }
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[j]%5==0){
                    sum+=nums[j];
                    break;
                }
                if((t+nums[j])%5==0&&nums[j]!=nums[j-1]){
                    sum+=t+nums[j];
                }
            }

        }
        return sum;
    }
}
