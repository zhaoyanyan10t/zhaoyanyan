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

    //单链表
    public void display() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
}
public class testdemo {
    public static void main(String[] args) {
        MySignalList mySignalList=new MySignalList();
        mySignalList.addFirst(1);
        mySignalList.addFirst(2);
        mySignalList.addFirst(3);
        mySignalList.addFirst(4);
        mySignalList.display();
    }

    }
