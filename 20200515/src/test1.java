import java.util.Arrays;

class Solution {
    /**
     * 计算你能获得的最大收益
     *
     * @param prices Prices[i]即第i天的股价
     * @return 整型
     */
    public int calculateMax(int[] prices) {
//        把区间分成两部分，求格子最大的
        int sum=0;
        for (int i = 0; i <prices.length ; i++) {
            int t=GETMAX(prices,0,i)+GETMAX(prices,i+1,prices.length);
            if(t>sum) sum=t;
        }
        return sum;
    }
    public static int GETMAX(int[] prices,int left,int right){
        int MIN=prices[left];
        int MAX=0;
        for (int i = left; i <right; i++) {
            MIN=Math.min(prices[i],MIN);
            MAX=Math.max(MAX,prices[i]);
        }
        return MAX-MIN;
    }
}
public class test1 {
    public static void main(String[] args) {
        int n=30*10;
        int sum=0;
        for (int i = 0; i <30 ; i++) {
            sum+=Math.pow(2,i);
        }
        System.out.println(n+"万元"+" "+sum+"分钱");
    }
}
