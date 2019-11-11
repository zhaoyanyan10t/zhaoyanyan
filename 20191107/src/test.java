class ListNode {
//    public static ListNode head;
//    public int data;
    public ListNode next;

//    public ListNode(int data) {
//        this.data = data;
//        this.next = null;
//    }
}//节点类
class MySignalList {
    public ListNode head;

//
//    public MySignalList() {
//        this.head = null;
//    }

    //反转单链表
    public ListNode reverseList() {
        ListNode prev = null;
        ListNode newHead = null;
        ListNode cur = this.head;

        while (cur != null) {
            ListNode curNext = cur.next;
            if (curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
//            curNext = cur.next;

        }
        return newHead;
    }
}

public class test {
}
