import java.util.ArrayList;
import java.util.List;

class ListNode {
         int val;
         ListNode next = null;

         ListNode(int val) {
             this.val = val;
         }
     }
class Solution {
    public ListNode head;
    public ListNode val;

    public Solution() {
        this.head = null;
    }

    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> s=new ArrayList<Integer>();
        while(listNode!=null){
            s.add(0,listNode.val);
            listNode=listNode.next;
        }
        return s;
    }
}
public class test{
    public static void main(String[] args) {
//        List<Integer> s=new ArrayList<>();
//        s.add(0,1);
//        s.add(1,2);
//        s.add(2,3);
//        s.add(3,4);
//        System.out.println(s);

        Solution t=new Solution();
        t.addFirst(1);
        t.addFirst(2);
        t.addFirst(3);
        t.addFirst(4);
        t.addFirst(5);
        System.out.println(t.printListFromTailToHead(t.head));
    }
}
//import java.util.Scanner;
//
//class Solution {
//
//}
//public class test {
//    public static String replaceSpace(StringBuffer str) {
//    return str.toString().replaceAll(" ","%20");
//}
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
//        StringBuffer buider=new StringBuffer();
//        for (int i = 0; i <str.length() ; i++) {
//            buider.append(str.charAt(i));
//        }
//        System.out.println(replaceSpace(buider));
//    }
//}
//
////import java.util.Scanner;
////
////class Solution {
////    public String replaceSpace(StringBuffer str) {
////        return str.toString().replaceAll(" ","%20");
////    }
////}
////public class test {
////    public static void main(String[] args) {
////        Scanner sc=new Scanner(System.in);
////        String str=sc.nextLine();
////        StringBuffer buider=new StringBuffer();
////        for (int i = 0; i <str.length() ; i++) {
////            buider.append(str.charAt(i));
////        }
////        Solution s=new Solution();
////        System.out.println(s.replaceSpace(buider));
////    }
////}
