import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class test1 {
    public static void main(String[] args) {
        Set<String> s=new TreeSet<>();
        s.add("b");
        s.add("a");
        s.add("d");
        s.add("c");
        s.add(null);
        System.out.println(s.size());
        System.out.println(s.contains("e"));
        System.out.println(s);
        Object[] o=s.toArray();
        for (int i = 0; i <o.length; i++) {
            System.out.println(o[i]);
        }
        for (Object y:o) {
            System.out.print(y+" ");
        }
    }
}
