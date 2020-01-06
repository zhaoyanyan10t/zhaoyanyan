import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//import java.util.LinkedList;
//import java.util.Queue;
//class MyStack {
//    public Queue<Integer> q1;
//    public Queue<Integer> q2;
//    public MyStack() {
//        q1=new LinkedList<>();
//        q2=new LinkedList<>();
//    }
//    public void push(int x) {
//        q1.offer(x);
//    }
//    public int pop() {
//        //将q1中size-1个元素搬移到q2中
//        while(q1.size()>1){
//            q2.offer(q1.poll());
//        }
//        //删除q1中的对头元素
//        int ret=q1.poll();
//       //把q2中的元素给q1
//        Queue<Integer> tmp=q1;
//        q1=q2;
//        q2=tmp;
//        return ret;
//    }
//    public int top() {
//        while(q1.size()-1>0){
//            q2.offer(q1.poll());
//        }
//       int ret=q1.peek();
//        q2.offer(q1.poll());
//        Queue<Integer> tmp=q1;
//        q1=q2;
//        q2=tmp;
//        return ret;
//    }
//    public boolean empty() {
////        if(q1.isEmpty()){
////            return true;
////        }
////        return false;
//        return q1.isEmpty();
//    }
//}
//class MyQueue {
//    public Stack<Integer> s1;//模拟入队列
//    public Stack<Integer> s2;//模拟出队列
//    public MyQueue() {
//        s1=new Stack();
//        s2=new Stack();
//    }
//    public void push(int x) {
//        s1.push(x);
//    }
//    public int pop() {
//        if(s2.empty()){
//            while(!s1.empty()){
//                s2.push(s1.pop());
//            }
//        }
//        return s2.pop();
//    }
//    public int peek() {
//        if(s2.empty()){
//            while(!s1.empty()){
//                s2.push(s1.pop());
//            }
//        }
//        return s2.peek();
//    }
//    public boolean empty() {
//        return s1.empty()&&s2.empty();
//
//    }
//}

class MyCircularQueue {
    public int[] array=null;
    public int capacity=0;//容量
    public int size=0;//有size个数
    public int front=0;//队列的头部
    public int rear=0;//队尾
    public MyCircularQueue(int k) {
        array=new int[k];
        capacity=k;
    }
    public boolean enQueue(int value) {
        if(size==capacity){
            return false;
        }
        array[rear++]=value;
//        rear%=capacity;
        if(rear==capacity){
            rear=0;
        }
        size++;
        return true;
    }
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        front++;
        if(front==capacity){
            front=0;
        }
        size--;
        return true;
    }
    public int Front() {
        if(isEmpty())
            return -1;
        return array[front];
    }
    public int Rear() {
//        return array[(rear-1+capacity)%capacity];
        if(isEmpty())
            return -1;
        if(rear==0){
            return array[rear-1+capacity];
        }
        return array[rear-1];
    }
    public boolean isEmpty() {
        return 0==size;
    }
    public boolean isFull() {
        return size==capacity;
    }
}
public class test {
    public static void main(String[] args) {



//        MyQueue e=new MyQueue();
//        e.push(1);
//        e.push(2);
//        e.push(3);
//        System.out.println(e.peek());


//        MyStack e=new MyStack();
//        e.push(1);
//        e.push(2);
//        System.out.println(e.top());
//        e.pop();
//        System.out.println(e.pop());




//        Queue<String > e=new LinkedList<>();
//        System.out.println(e.isEmpty());
//        System.out.println(e.size());
//        System.out.println(e);
//        e.offer("1");
//        e.offer("2");
//        e.offer("3");
//        System.out.println(e.peek());
//        e.poll();
//        System.out.println(e.isEmpty());
//        System.out.println(e.size());
//        System.out.println(e);
    }
}
