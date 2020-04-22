import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class test1 {
    public static void main(String[] args) {
        Set<String > s=new HashSet<>();
        s.add("a");
        s.add("d");
        s.add("jy");
        s.add("fy");
        s.add("c");
        System.out.println(s);
        System.out.println("------------");

        System.out.println(s.add("b"));
        System.out.println(s.size());
        System.out.println(s);
        System.out.println("------------");

        System.out.println(s.add("a"));
        System.out.println(s.size());
        System.out.println(s);
        System.out.println("------------");

//        元素遍历：使用迭代器
        Iterator<String> it=s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("------------");

        System.out.println(s.remove("b"));
        System.out.println(s.remove("f"));
        System.out.println(s);
        System.out.println("------------");
        s.clear();
        System.out.println(s.size());




    }
}
