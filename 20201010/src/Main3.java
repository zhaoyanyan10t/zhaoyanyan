import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) {
        String str="abcdbcdcbabcdefggcwa";
        Set<Character> s=new HashSet<>();
        int i=0,j=0;
        int count=0;
        int tmp=0;
        while(i<str.length()&&j<str.length()){
            char ch=str.charAt(j);
            char ch1=str.charAt(j++);
            if(!s.contains(ch)){
                s.add(ch1);
                count=Math.max(count,j-i);

            }else{
                tmp=(j--);
                s.remove(str.charAt(i++));
            }
        }
//        return str.substring(i-count,i);
        System.out.println(str.substring(tmp-count-1,tmp-1));
    }
    public String findMaxSubstr (String str) {
        // write code here
        Set<Character> s=new HashSet<>();
        int i=0,j=0;
        int count=0;
        int tmp=0;
        while(i<str.length()&&j<str.length()){
            char ch=str.charAt(j);
            char ch1=str.charAt(j++);
            if(!s.contains(ch)){
                s.add(ch1);
                count=Math.max(count,j-i);

            }else{
                tmp=j;
                s.remove(str.charAt(i++));
            }
        }
        return str.substring(i-count,i);
    }
    public boolean judgeSquareSum (int c) {
        // write code here
        int i=0,j=(int)Math.sqrt(c);
        while(i<=j){
            int sum=i*i+j*j;
            if(sum==Math.pow(c,2)){
                return true;
            }else if(Math.pow(i,2)+Math.pow(j,2)<Math.pow(c,2)){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
    public int findLengthOfLCIS (int[] nums) {
        // write code here
        int max=1,count=1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>nums[i-1]){
                count++;
            }else{
                count=1;
            }
            if(count>max){
                max=count;
            }
        }
        return max;
    }
}
