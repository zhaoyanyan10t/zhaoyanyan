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

    public void display(ListNode node) {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}
public class test{
    public static ListNode  getIntersectionNode
            (ListNode headA,ListNode headB) {
        if(headA==null&&headB==null){
            return null;
        }
        ListNode pL=headA;
        ListNode pS=headB;
        int lenA=0;
        int lenB=0;
        while(pL!=null){
            pL=pL.next;
            lenA++;
        }
        while(pS!=null){
            pS=pS.next;
            lenB++;
        }
        int len =lenA-lenB;
        if(len<0){
            pL=headB;
            pS=headA;
            len=lenB-lenA;
        }
        while(len>0){
            len--;
            pL=pL.next;
        }
        while(pL!=pS&&pL!=null){
            pL=pL.next;
            pS=pS.next;
        }
        if(pL==pS&&pS!=null){
            return pL;
        }
        return null;
    }
    public static void createCut(ListNode headA,ListNode headB){
        headA.next.next=headB.next.next.next;
    }

    public static ListNode  mergeTwoLists(ListNode headA, ListNode headB){
        ListNode node=new ListNode(-1);
        ListNode tmp=node;
        while(headA!=null&&headB!=null) {
            if (headA.data < headB.data) {
                tmp.next = headA;
                headA = headA.next;
                tmp = tmp.next;
            } else {
                tmp.next = headB;
                headB = headB.next;
                tmp = tmp.next;
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
        MySignalList mySignalList = new MySignalList();
        MySignalList mySignalList1= new MySignalList();

        mySignalList.addFirst(1323);
        mySignalList.addFirst(223);
        mySignalList.addFirst(33);
        mySignalList.addFirst(12);
        mySignalList.addFirst(1);

        mySignalList1.addLast(2);
        mySignalList1.addLast(3);
        mySignalList1.addLast(63);
        mySignalList1.addLast(83);
        ListNode node=mergeTwoLists(mySignalList.head,mySignalList1.head);
        mySignalList.display(node);
//        createCut(mySignalList.head,mySignalList1.head);
//        System.out.println(getIntersectionNode(mySignalList.head,mySignalList1.head).data);
    }
}





//import java.util.Scanner;
////class Solution {
////    public String defangIPaddr(String address) {
////        String a=""+address.charAt(0);
////        for (int i = 1; i <address.length() ; i++) {
////            if(address.charAt(i)=='.'){
////                a+="[.]";
////            }else{
////                a+=address.charAt(i);
////            }
////        }
////        System.out.println(a);
////        return a;
////
////    }
////}
//
//class Solution {
//    public String defangIPaddr(String address) {
//        return address.replace(".","[.]");
////        for (int i = 0; i <address.length() ; i++) {
////        if(address.charAt(i)=='.'){
////            System.out.print("[.]");
////        }else{
////            System.out.print(address.charAt(i));
////        }
////    }
////        return address;
//    }
//}
//public class test {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("adress=");
//        String s=sc.nextLine();
//        Solution d=new Solution();
//        System.out.println(d.defangIPaddr(s));
//
//    }
//}
