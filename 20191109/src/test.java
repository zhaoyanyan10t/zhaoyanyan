class ListNode{
    public int data;
    public ListNode prev;
    public ListNode next;
    public ListNode(int data){
        this.data=data;
    }
}
class DoubleList {
    public ListNode head;
    public ListNode last;

    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
            this.last = node;
        } else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }

    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
            this.last = node;
        } else {
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }
    }

    public void display() {

        if (this.head == null) {
            return;
        }
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

//
////删除第一次出现关键字为key的节点
//private ListNode searchIndex(int index) {
//    if(index<0||index>getlength()||this.head==null){
//        return null;
//    }
//    ListNode cur=head;
//    while(index>0){
//        cur=cur.next;
//        index--;
//    }
//    return cur;
//}
//    //任意位置插入,第一个数据节点为0号下标
//    public boolean addIndex(int index, int data) {
//        if(index==0){
//            addFirst(data);
//            return true;
//        }
//        if(index==getlength()){
//            addLast(data);
//            return true;
//        }
//        ListNode cur=searchIndex(index);
//        if(cur==null){
//            return false;
//        }
//        ListNode node=new ListNode(data);
//        node.next=cur;
//        cur.prev.next=node;
//        cur.prev=cur.prev;
//        cur.prev=node;
//
//        return true;
//    }
//    public int getlength(){
//        if (this.head == null) {
//            return 0;
//        }
//        int count=0;
//        ListNode cur = this.head;
//        while (cur != null) {
//            count++;
//
//            cur = cur.next;
//        }
//        return count;
//    }
//
//    public  int remove(int key){
//        int oldData=-1;
//        ListNode cur=this.head;
//        while(cur!=null){
//            if(cur.data==key){
//                oldData=cur.data;
//                if(cur==this.head){
//                    this.head=this.head.next;
//                    this.head.prev=null;
//                    return oldData;
//                }else{
//                    cur.prev.next=cur.next;
//                    if(cur.next!=null){
//                        cur.next.prev=cur.prev;
//                    }else {
//                        last = cur.prev;
//                    }
//                    return oldData;
//                }
//            }
//            cur=cur.next;
//        }
//        return -1;
//    }



    //删除所有值为key的节点
    private ListNode searchIndex(int index) {
    if(index<0||index>getlength()||this.head==null){
        return null;
    }
    ListNode cur=head;
    while(index>0){
        cur=cur.next;
        index--;
    }
    return cur;
}
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index, int data) {
        if(index==0){
            addFirst(data);
            return true;
        }
        if(index==getlength()){
            addLast(data);
            return true;
        }
        ListNode cur=searchIndex(index);
        if(cur==null){
            return false;
        }
        ListNode node=new ListNode(data);
        node.next=cur;
        cur.prev.next=node;
        cur.prev=cur.prev;
        cur.prev=node;

        return true;
    }
    public int getlength(){
        if (this.head == null) {
            return 0;
        }
        int count=0;
        ListNode cur = this.head;
        while (cur != null) {
            count++;

            cur = cur.next;
        }
        return count;
    }

    public  int toremove(int key){
        int oldData=-1;
        ListNode cur=this.head;
        while(cur!=null){
            if(cur.data==key){
                oldData=cur.data;
                if(cur==this.head){
                    this.head=this.head.next;
                    this.head.prev=null;
//                    return oldData;
                }else{
                    cur.prev.next=cur.next;
                    if(cur.next!=null){
                        cur.next.prev=cur.prev;
                    }else {
                        last = cur.prev;
                    }
//                    return oldData;
                }
            }
            cur=cur.next;
        }
        return -1;
    }


    public void clear(){

    }
}
public class test {
    public static void main(String[] args) {
        DoubleList doubleList = new DoubleList();
        //1.
//        DoubleList doubleList = new DoubleList();
//        doubleList.addFirst(1);
//        doubleList.addFirst(2);
//        doubleList.addFirst(3);
//        doubleList.addFirst(4);
//        doubleList.addFirst(5);
//        doubleList.addIndex(2,44);
//        doubleList.display();

//2.
        doubleList.addLast(2);
        doubleList.addLast(2);
        doubleList.addLast(3);
        doubleList.addLast(4);
        doubleList.addLast(5);
        doubleList.toremove(2);
        doubleList.display();

        //3.
        doubleList.addLast(1);
        doubleList.addLast(2);
        doubleList.addLast(3);
        doubleList.addLast(4);
        doubleList.addLast(5);
    }

}
