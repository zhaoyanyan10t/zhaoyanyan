import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class test1 {
    public void sayHello() {
        System.out.println("Hello");
    }

    public int sayHello(String name) {
        System.out.println("Hello" + " " + name);
        return  1;
    }
    public static void main(String[] args) {
        int t=1;
        double r=4.2;
        int d= (int) r;
        double dd=(double)t;
        int[] s={1,2,3};
        Set<Integer> set=new HashSet<>();

        set.add(1);
        set.add(5);
        set.add(3);
        set.add(2);
        set.add(null);
        System.out.println(set);
        List<Integer> list=new LinkedList<>(set);
        System.out.println(list.get(3));
    }
}
