import java.util.*;

public class Main {
    public static int maxSubArray (int[] nums) {
        // write code here
        int max=nums[0];

        for (int i = 0; i <nums.length ; i++) {
            int sum=0;
            for (int j = i; j <nums.length; j++) {
                sum+=nums[j];
                if(sum>max){
                    max=sum;
                }

            }
        }
        return max;

    }
    public static int thirdMax (int[] nums) {
        // write code here

        Set<Integer> s=new TreeSet<>();

        for (int i = 0; i <nums.length ; i++) {
            s.add(nums[i]);
        }
        List<Integer> list=new ArrayList<>(s);
        if(s.size()<3){
            return ((TreeSet<Integer>) s).last();
        }
        return list.get(s.size()-3);


    }

    public static void main(String[] args) {
        int[] arr={2,2,3,1};
        System.out.println(thirdMax(arr));
    }
}
