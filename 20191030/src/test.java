class ListNode {
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
        }
        else{
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
    public boolean contains(int key){
        ListNode cur = this.head;
        while(cur!=null){
            if(cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    private ListNode searchPrev(int key) {
        ListNode prev=this.head;
        while(prev.next!=null) {
            if (prev.next.data == key) {
                return prev;
            }
            prev=prev.next;
        }
        return null;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key){
        ListNode cur = this.head;
        if(this.head == null) {
            System.out.println("单链表为空");
            return;
        }
        //0、删除的节点是否是头结点
        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }

        //1、找到key的前驱  如果返回空

        ListNode prev = searchPrev(key);
        if(prev==null){
            return ;
        }


        //2、删除节点
        ListNode del=prev.next;
        prev.next=del.next;
    }

    //删除所有值为key的节点
    public void removeAllKey(int key){
        ListNode cur = this.head.next;
        ListNode prev = this.head;
        if(prev==null){
            return ;
        }
        while(cur!=null){
            if(prev.next.data == key){
                prev.next=cur.next;
                cur=cur.next;
            }
            if(prev.next.data != key){
                prev=cur;
                cur=cur.next;
            }
        }
        if(this.head.data==key){
            this.head=this.head.next;
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
    //单链表的中间节点
    public ListNode middleNode() {
        ListNode fast =head;
        ListNode slow =head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    //    单链表
    public void display1( ListNode newHead) {
            ListNode cur = newHead;
            while (cur != null) {
                System.out.print(cur.data+" ");
                cur=cur.next;
            }
            System.out.println();
        }
    public void display() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }

}
public class test {
    public static void main(String[] args) {
        MySignalList mySignalList=new MySignalList();
        mySignalList.addFirst(1);
        mySignalList.addFirst(2);
        mySignalList.addFirst(3);
        mySignalList.addFirst(4);
        mySignalList.addFirst(5);

//        mySignalList.removeAllKey(2);
        mySignalList.display();
//       ListNode node=mySignalList.middleNode();
//        System.out.println(node.data);
       ListNode head=mySignalList.reverseList();
        mySignalList.display1(head);
    }

}
