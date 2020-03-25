import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Solution1 {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i <stones.length; i++) {
            list.add(stones[i]);
        }
        PriorityQueue<Integer> p=new PriorityQueue<>(new comparator()@Override
        public );
        while(p.size()>1){
            int y=p.poll();
            int x=p.poll();
            if(y!=x){
                p.offer(y-x);
            }
        }
        if(p.isEmpty()){
            return 0;
        }
        return p.peek();
    }
}
class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        if(stones.length>1) {
            while (stones[stones.length - 2] != 0) {
//只要倒数第二个数不是0，就一直循环
                int y = stones[stones.length - 1];
                int x = stones[stones.length - 2];
                if (x == y) {
                    stones[stones.length - 1] = 0;
                    stones[stones.length - 2] = 0;
                } else {
                    stones[stones.length - 2] = 0;
                    stones[stones.length - 1] = y - x;
                }
                Arrays.sort(stones);
            }
        }
        return stones[stones.length-1];
    }
}
public class test1 {
    public static void main(String[] args) {
        Solution1 s=new Solution1();
        int[] arr={2,7,4,1,8,1};
        System.out.println(s.lastStoneWeight(arr));
    }
}
