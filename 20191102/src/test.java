import java.util.LinkedList;
import java.util.List;

class ListNode {
    public static ListNode head;
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}//节点类

class MySignalList {
    public ListNode head;

    public MySignalList() {
        this.head = null;
    }

    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            head = node;
        } else {
            ListNode cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    public boolean contains(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    private ListNode searchPrev(int key) {
        ListNode prev = this.head;
        while (prev.next != null) {
            if (prev.next.data == key) {
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        ListNode cur = this.head;
        if (this.head == null) {
            System.out.println("单链表为空");
            return;
        }
        //0、删除的节点是否是头结点
        if (this.head.data == key) {
            this.head = this.head.next;
            return;
        }

        //1、找到key的前驱  如果返回空

        ListNode prev = searchPrev(key);
        if (prev == null) {
            return;
        }


        //2、删除节点
        ListNode del = prev.next;
        prev.next = del.next;
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        ListNode cur = this.head.next;
        ListNode prev = this.head;
        if (prev == null) {
            return;
        }
        while (cur != null) {
            if (prev.next.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            }
            if (prev.next.data != key) {
                prev = cur;
                cur = cur.next;
            }
        }
        if (this.head.data == key) {
            this.head = this.head.next;
        }
    }

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

    public void display1(ListNode newHead) {
        ListNode cur = newHead;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //单链表的中间节点
    public ListNode middleNode() {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // 输入一个链表，输出该链表中倒数第k个结点
    public ListNode findKthToTail(int k) {
        if (k <= 0) {
            System.out.println("没有此节点");
            return null;
        }
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (k - 1 > 0) {
            if (fast.next != null) {
                fast = fast.next;
                k--;
            } else {
                System.out.println("没有此节点");
                return null;
            }
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    // 编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
    public ListNode partition(int x) {
        ListNode cur = this.head;
        ListNode beforeStart = null;
        ListNode beforeEnd = null;
        ListNode afterStart = null;
        ListNode afterEnd = null;
        while (cur != null) {
            //cur.data < x
            if (cur.data < x) {
                //第一次插入
                if (beforeStart == null) {
                    beforeStart = cur;
                    beforeEnd = cur;
                } else {
                    beforeEnd.next = cur;
                    beforeEnd = beforeEnd.next;
                }
            } else {
                //第一次插入
                if (afterStart == null) {
                    afterStart = cur;
                    afterEnd = cur;
                } else {
                    afterEnd.next = cur;
                    afterEnd = afterEnd.next;
                }
            }
            cur = cur.next;
        }
        if (beforeStart == null) {
            return afterStart;
        }
        beforeEnd.next = afterStart;
        if (afterStart != null) {
            afterEnd.next = null;
        }
        return beforeStart;
    }

    //    单链表
    public void display2(ListNode beforeStart) {
        ListNode cur = beforeStart;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //删除重复的节点
    public ListNode deleteDuplication() {
        ListNode node = new ListNode(-1);
        ListNode cur = this.head;
        ListNode tmp = node;
        while (cur != null) {
            if (cur.next != null && cur.data == cur.next.data) {
                //1、循环
                while (cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
                //2、退出循环 cur要多走一步
                cur = cur.next;
//                tmp.next=cur;
                //
            } else {
                //当前节点 不等于下一个节点的时候
                tmp.next = cur;
                cur = cur.next;
                tmp = tmp.next;
            }
        }
        tmp.next = null;
        return node.next;
    }

    public void display3(ListNode node) {
        ListNode cur = node;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //回文
    public boolean chkPalindrome() {
        ListNode fast = this.head;
        ListNode slow = this.head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //反转
        ListNode p = slow.next;
        while (p != null) {
            ListNode pNext = p.next;
            p.next = slow;
            slow = p;
            p = pNext;
        }

        //slow往前    head 往后  .data不一样 返回false
        //直到相遇
        while (slow != head) {
            if (slow.data != head.data) {
                return false;
            }
            //偶数
            if (head.next == slow) {
                return true;
            }
            head = head.next;
            slow = slow.next;


        }
        return true;
    }

    //判断环
    public void createloop() {
        ListNode cur = this.head;
        while (cur.next != null)

        {
            cur = cur.next;
        }
        cur.next = head.next;
    }

    public boolean hasCycle() {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;

//        break;
            }
        }
//        if(fast==null||fast.next==null){
//            return false;
//        }
//        return true;
        return false;
    }


    public ListNode detectCycle() {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
//                return true;
                break;
            }
        }
        if(fast==null||fast.next==null){
            return null;
        }
        slow=this.head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;

//        return false;
        }
        return fast;
    }

    //长度环的
//    public int detectCycle(){
//        ListNode slow=head;
//        ListNode fast=head;
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//            if(fast==slow){
////                return true;
//                break;
//            }
//        }
//        int count=1;
//        if(fast==null||fast.next==null){
//            return -1;
//        }
//        slow=slow.next;
//        while(slow!=fast){
//            slow=slow.next;
//            count++;
//        }
//        return count;
//}
    public void display() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    public void display5() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }

}
public class test {

    //公共节点
    public static ListNode  getIntersectionNode
    (ListNode headA,ListNode headB){
        if(headA == null || headB == null) {
            return null;
        }
        //永远指向最长的单链表
        ListNode pL = headA;
        //永远指向最短的单链表
        ListNode pS = headB;

        int lenA = 0;
        int lenB = 0;
        while(pL!=null){
            pL=pL.next;
            lenA++;
        }

        while(pS!=null){
            pS=pS.next;
            lenB++;
        }
        //分别求长度
        pL = headA;
        pS = headB;
        //求长度的差值
        int len = lenA-lenB;
        //如果是负数-》pL = headB;  pS = headA
        if(len<0){
            pL = headB;
            pS = headA;
            len=lenB-lenA;
        }
        //只需要让pL走len步就好了
        while(len>0){
            len--;
            pL=pL.next;
        }
        //走完len步之后  两个同时开始走
        //一直走 走到next值相同时 就是交点
        while(pL!=pS&&pL!=null){
            pL=pL.next;
            pS=pS.next;
        }
        //万一没有相交且两个长度一样
        if(pS!=null&&pL==pS){
            return pL;
        }
        return null;
    }
    public static void createCut(ListNode headA,ListNode headB){
        headA.next.next=headB.next.next.next;
    }


    public static ListNode  mergeTwoLists(ListNode headA, ListNode headB){
//        ListNode curA=headA;
//        ListNode curB=headB;
        ListNode node=new ListNode(-1);
        ListNode tmp=node;
        while(headA!=null&&headB!=null){
            if(headA.data<headB.data){
                tmp.next=headA;
                headA=headA.next;
                tmp=tmp.next;
            }else{
                tmp.next=headB;
                headB=headB.next;
                tmp=tmp.next;
            }
        }
        if(headA!=null){
            tmp.next=headA;
        }
        if(headB!=null){
            tmp.next=headB;
        }
        return node.next;
    }


    public static void main(String[] args) {
        MySignalList mySignalList=new MySignalList();

//        mySignalList.addFirst(1);
//        mySignalList.addFirst(2);
//        mySignalList.addFirst(3);
//        mySignalList.addFirst(4);
//        mySignalList.addFirst(5);

        mySignalList.addLast(1);
        mySignalList.addLast(3);
        mySignalList.addLast(6);
        mySignalList.addLast(8);
        mySignalList.addLast(19);
//        mySignalList.removeAllKey(2);
        mySignalList.display();
        MySignalList mySignalList1=new MySignalList();
        mySignalList1.addLast(2);
        mySignalList1.addLast(4);
        mySignalList1.addLast(5);
        mySignalList1.addLast(11);
        mySignalList1.display();


        ListNode node=mergeTwoLists(mySignalList.head,mySignalList1.head);
        mySignalList.display1(node);


//        createCut(mySignalList.head,mySignalList1.head);
//        ListNode node= getIntersectionNode(mySignalList.head,mySignalList1.head);
//        System.out.println(node.data);

//        mySignalList.createloop();
//        boolean node=mySignalList.hasCycle();
//        System.out.println(node);
//        int n=mySignalList.detectCycle();
//        System.out.println(n);

//                mySignalList.createloop();
//        boolean node=mySignalList.hasCycle();
//        System.out.println(node);
//        ListNode n=mySignalList.detectCycle();
//        System.out.println(n.data);

//        boolean node=mySignalList.chkPalindrome();
//        System.out.println(node);

//       ListNode node=mySignalList.middleNode();
//        System.out.println(node.data);

//       ListNode head=mySignalList.reverseList();
//        mySignalList.display1(head);

//        ListNode node=mySignalList.deleteDuplication();
//        mySignalList.display3(node);

//        ListNode node=mySignalList.partition(6);
//         mySignalList.display2(node);


//        ListNode node=mySignalList.findKthToTail(1);
//        System.out.println(node.data);
    }
}

