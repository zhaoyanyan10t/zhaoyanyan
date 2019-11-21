import java.util.Scanner;

//class ListNode{
//    public static ListNode head;
//    public int data;
//    public ListNode next;
//
//    public ListNode(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//class MySignalList {
//    public ListNode head;
//
//    public MySignalList() {
//        this.head = null;
//    }
//
//    //头插法
//    public void addFirst(int data) {
//        ListNode node = new ListNode(data);
//        if (this.head == null) {
//            this.head = node;
//        } else {
//            node.next = head;
//            head = node;
//        }
//    }
//
//    //尾插法
//    public void addLast(int data) {
//        ListNode node = new ListNode(data);
//        if (this.head == null) {
//            this.head = node;
//        } else {
//            ListNode cur = this.head;
//            while (cur.next != null) {
//                cur = cur.next;
//            }
//            cur.next = node;
//        }
//    }
//
//    //删除所有值为key的节点
//    public void removeAllKey(int key) {
//        ListNode cur = this.head.next;
//        ListNode prev = this.head;
//        if (prev == null) {
//            return;
//        }
//        while (cur != null) {
//            if (prev.next.data == key) {
//                prev.next = cur.next;
//                cur = cur.next;
//            }
//            if (prev.next.data != key) {
//                prev = cur;
//                cur = cur.next;
//            }
//        }
//        if (this.head.data == key) {
//            this.head = this.head.next;
//        }
//    }
//
//    //反转单链表
//    public ListNode reverseList() {
//        ListNode prev = null;
//        ListNode newHead = null;
//        ListNode cur = this.head;
//        while (cur != null) {
//            ListNode curNext = cur.next;
//            if (curNext == null) {
//                newHead = cur;
//            }
//            cur.next = prev;
//            prev = cur;
//            cur = curNext;
//        }
//        return newHead;
//    }
//
//    public void display1(ListNode newHead) {
//        ListNode cur = newHead;
//        while (cur != null) {
//            System.out.print(cur.data + " ");
//            cur = cur.next;
//        }
//        System.out.println();
//    }
//
//    //返回中间节点
//    public ListNode middleNode() {
//        ListNode fast = this.head;
//        ListNode slow = this.head;
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow;
//    }
//
//    //倒数第K个节点
//    public ListNode findKthToTail(int k) {
//        if (k <= 0) {
//            System.out.println("没有此节点");
//            return null;
//        }
//        ListNode fast = this.head;
//        ListNode slow = this.head;
//        while (k - 1 > 0) {
//            if (fast.next != null) {
//                fast = fast.next;
//                k--;
//            } else {
//                System.out.println("没有此节点");
//                return null;
//            }
//        }
//        while (fast.next != null) {
//            fast = fast.next;
//            slow = slow.next;
//        }
//        return slow;
//    }
//
//    // 编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
//    public ListNode partition(int x) {
//        ListNode cur = this.head;
//        ListNode beforeStart = null;
//        ListNode beforeEnd = null;
//        ListNode afterStart = null;
//        ListNode afterEnd = null;
//        while (cur != null) {
//            if (cur.data < x) {
//                if (beforeStart == null) {
//                    beforeStart = cur;
//                    beforeEnd = cur;
//                } else {
//                    beforeEnd.next = cur;
//                    beforeEnd = beforeEnd.next;
//                }
//            } else {
//                if (afterStart == null) {
//                    afterStart = cur;
//                    afterEnd = cur;
//                } else {
//                    afterEnd.next = cur;
//                    afterEnd = afterEnd.next;
//                }
//            }
//            cur = cur.next;
//        }
//            if (beforeStart == null) {
//                return afterStart;
//            }
//            beforeEnd.next=afterStart;
//            if (afterStart != null) {
//                afterEnd.next = null;
//            }
//            return beforeStart;
//        }
//    //删除重复的节点
//    public ListNode deleteDuplication(){
//        ListNode node=new ListNode(-1);
//        ListNode cur=this.head;
//        ListNode tmp=node;
//        while(cur!=null){
//            if(cur.next!=null&&cur.data==cur.next.data){
//                while(cur.next!=null&&cur.data==cur.next.data){
//                    cur=cur.next;
//                }
//                cur=cur.next;
//            }else{
//                tmp.next=cur;
//                cur=cur.next;
//                tmp=tmp.next;
//            }
//        }
//        tmp.next=null;
//        return node.next;
//    }
//
//    //回文
//    public boolean chkPalindrome(){
//        ListNode fast=this.head;
//        ListNode slow=this.head;
//        while(fast!=null&&fast.next!=null){
//            fast=fast.next.next;
//            slow=slow.next;
//        }
//        ListNode p=slow.next;
//        while(p!=null){
//            ListNode pNext=p.next;
//            p.next=slow;
//            slow=p;
//            p=pNext;
//        }
//        while(this.head!=slow){
//            if(this.head.data!=slow.data){
//                return false;
//            }
//            //对于偶数的情况下
//            if(head.next==slow){
//                return true;
//            }
//            head=head.next;
//            slow=slow.next;
//
//        }
//        return true;
//    }
//    public void display(){
//        ListNode cur=this.head;
//        while(cur!=null){
//            System.out.print(cur.data+" ");
//            cur=cur.next;
//        }
//        System.out.println();
//    }
//}
//public class test{
//    public static void main(String[] args) {
//        MySignalList mySignalList=new MySignalList();
//        mySignalList.addLast(2);
//        mySignalList.addLast(3);
//        mySignalList.addLast(2);
//        mySignalList.addLast(24);
//        mySignalList.addLast(24);
//        mySignalList.addLast(3);
//        mySignalList.addLast(2);
//        mySignalList.display();
//
////        System.out.println(mySignalList.chkPalindrome());
//
////        mySignalList.deleteDuplication();
////        mySignalList.display();
//
////        mySignalList.partition(4);
////        mySignalList.display();
//
////        System.out.println(mySignalList.findKthToTail(2).data);
//
//        //        ListNode node=mySignalList.middleNode();
////        System.out.println(node.data);
//
//
////        mySignalList.display1(mySignalList.reverseList());
//
//// mySignalList.removeAllKey(23);
////        mySignalList.display();
//    }
//}
 class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
public class test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("node=");
        int n=sc.nextInt();
    }
}