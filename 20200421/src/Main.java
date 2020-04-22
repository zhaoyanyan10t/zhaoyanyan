import java.util.Arrays;
//class Partition {
//    public ListNode partition(ListNode pHead, int x) {
//        ListNode before, after, p, q, t;
//        t = pHead;
//        before = after = p = q = null;
//        while (t != null) {
//            if (t.val < x) {
//                if (before == null) {
//                    p = before = t;
//                } else {
//                    p.next = t;
//                    p = t;
//                }
//            } else {
//                if (after == null) {
//                    q = after = t;
//                } else {
//                    q.next = t;
//                    q = t;
//                }
//            }
//            t = t.next;
//        }
//        if (before == null) return after;
//        p.next = after;
//        if (q != null) q.next = null;
//        return before;
//    }}
class Gift {
    public int getValue(int[] gifts, int n) {
        // write code here
        Arrays.sort(gifts);
        int count=0;
        int max=0;
        int start=0;
        for (int i = 0; i <n ; i++) {

            if(gifts[i]==gifts[start]){
                count++;
                if(max<count){
                    max=count;
                }
            }else{
                start=i;
                count=1;
            }
        }
        if(max>n) return n/2;
        else return 0;
    }
}
public class Main {
}
