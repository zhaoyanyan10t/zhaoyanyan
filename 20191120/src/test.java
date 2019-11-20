class ListNode{
    public static ListNode head;
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class MySignalList{
    public ListNode head;
    public MySignalList() {
        this.head = null;
    }
//头插法
    public void addFirst(int data) {
        ListNode node=new ListNode(data);
        if(this.head==null){
            this.head=node;
        }else{
            node.next=head;
            head=node;
        }
    }
    //尾插法
    public void addLast(int data) {
        ListNode node=new ListNode(data);
        if(this.head==null){
            this.head=node;
        }else{
            ListNode cur=this.head;
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=node;
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        ListNode cur=this.head.next;
        ListNode prev=this.head;
        if(prev==null){
            return ;
        }
        while(cur!=null){
            if(prev.next.data==key){
                prev.next=cur.next;
                cur=cur.next;
            }
            if(prev.next.data!=key){
                prev=cur;
                cur=cur.next;
            }
            }
            if(this.head.data==key){
                this.head=this.head.next;
        }
    }

    public void display( ){
        ListNode cur=this.head;
        while(cur!=null){
            System.out.println(cur.data+" ");
            cur=cur.next;
        }
    }
}
public class test{
    public static void main(String[] args) {
        MySignalList mySignalList=new MySignalList();
        mySignalList.addLast(2);
        mySignalList.addLast(23);
        mySignalList.addLast(24);
        mySignalList.addLast(25);
        mySignalList.removeAllKey(23);
        mySignalList.display();
    }
}



//import java.util.Scanner;
//
//class Solution {
//    public int numJewelsInStones(String J, String S) {
//        int count = 0;
//        for (int i = 0; i < J.length(); i++){
//            for (int j = 0; j < S.length(); j++) {
//                if (J.charAt(i) == S.charAt(j)) {
//                    count++;
//                }
//            }
//    }
//      return count;
//    }
//}
//
//public class test {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("J=");
//        String s=sc.nextLine();
//        System.out.println("S=");
//        String t=sc.nextLine();
//        Solution d=new Solution();
//        System.out.println(d.numJewelsInStones(s,t));
//
//    }
//}


//public class test {
//    public static void main(String[] args) {
//        String s="srznjs";
//        char re=s.charAt(1);
//        System.out.println(re);
//    }
//}
