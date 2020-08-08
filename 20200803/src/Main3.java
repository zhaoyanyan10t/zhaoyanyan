import java.util.LinkedList;
import java.util.Queue;

public class Main3 {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        System.out.println(q);
        q.remove();
        q.poll();
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.isEmpty());
    }
}
