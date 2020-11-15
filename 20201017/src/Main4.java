import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main4 {
    public static void main(String[] args) {
        Set<Integer> se=new HashSet<>();
        Map<Integer,Integer> m=new HashMap<>();
        se.add(1);
        se.add(2);
        se.add(1);
        System.out.println(se);
        m.put(1,2);
        m.put(3,4);
        m.put(1,5);
        m.put(6,5);

        System.out.println(m);
    }
}
