import java.util.Stack;

//import java.util.Stack;
//class Solution {
//    public boolean isValid(String s) {
//        Stack<Character> ss=new Stack();
//        for (int i = 0; i <s.length() ; i++) {
//            char c=s.charAt(i);
//            //如果是左括号，则入栈，进行下一次循环（下一个元素）
//            if(c=='('||c=='['||c=='{'){
//                ss.push(c);
//            }//如果是右括号 则与栈顶的左括号进行匹配
//            else if(c==')'||c==']'||c=='}'){
//                //如果栈为空，则右括号比左括号多，不必进行下次循环
//                if(ss.empty()){
//                    return false;
//                }else{//如果不为空，则进行匹配
//                    //cleft  刚才入栈的左括号
//                    char cleft=ss.peek();
//                    //进行匹配
//                    if(cleft=='('&&c==')'||cleft=='['&&c==']'||cleft=='{'&&c=='}'){
//                        //如果匹配成功，则移除栈顶元素，进行下一次循环（下一个元素）
//                        ss.pop();
//                    }else{//不成功，则不匹配，不必进行下一次循环
//                        return false;
//                    }
//                }
//            }
//        }
//        //左括号比右括号多（s=“（“）这种情况 直接false
//        if(!ss.empty()){
//            return false;
//        }
//        return true;
//    }
//}
//class Node{
//    public Node(int data){
//        next=null;
//        this.data=data;
//    }
//    public  int data;
//    public Node next;
//}

class MinStack {
   public Stack<Integer> data;
   public Stack<Integer> min;
    /** initialize your data structure here. */
    public MinStack() {
        data=new Stack();
        min=new Stack();
    }

    public void push(int x) {
        data.push(x);
        if(min.empty()||x<=min.peek()){
            min.push(x);
        }
    }

    public void pop() {
//        if(data.peek()==min.peek()){//比的是地址
        if(data.peek().equals(min.peek())){
        min.pop();
        }
        data.pop();//如果放在第一行，则删除了栈顶元素，则之后的栈顶元素和最小就不匹配，无法删除
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        return min.peek();
    }
}

public class test {
//    public static void print(Node head){// 递归
//        if(head!=null){
//            print(head.next);
//            System.out.println(head.data);
//        }
//    }
//    public static void print1(Node head){//循环
//        Node node=head;
//        Stack<Node> s=new Stack<>();
//        //让所有元素入栈
//        while(node!=null){
//            s.push(node);
//            node=node.next;
//        }
//        //让所有元素出栈
//        while(!s.empty()){
//            System.out.println(s.peek().data);
//            s.pop();
//        }
//    }
    public static void main(String[] args) {

        MinStack e=new MinStack();
        e.push(-2);
        e.push(0);
        e.push(-3);
        System.out.println(e.getMin());
        e.pop();
        e.top();
        System.out.println(e.getMin());
//        Node n1=new Node(1);
//        Node n2=new Node(12);
//        Node n3=new Node(13);
//        Node n4=new Node(14);
//        n1.next=n2;
//        n2.next=n3;
//        n3.next=n4;
//        print1(n1);

//        Solution e=new Solution();
//        System.out.println(e.isValid(""));
//

//        Stack<String> s=new Stack<>();
//        Stack<String> s=new Stack<>();
//        s.push("1");
//        s.push("2");
//        s.push("3");
//        s.push("4");
//        System.out.println(s.size());
//        System.out.println(s.empty());
//        System.out.println(s);
//        System.out.println(s.peek());
//        s.pop();
//        s.push("99");
//        System.out.println(s);
//        System.out.println(s.size());
//        System.out.println(s.peek());
    }
}
