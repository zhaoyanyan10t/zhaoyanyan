import java.util.Arrays;

public class test {
    public static int getValue(int[] nums,int n){
        Arrays.sort(nums);
        int tmp=nums[n/2];
        int count=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]==tmp){
                count++;
            }
        }
        if(count>nums.length/2){
            return tmp;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,2,5,2};
        System.out.println(getValue(arr,6));
    }
}
