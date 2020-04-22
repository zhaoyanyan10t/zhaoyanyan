import java.util.Map;
import java.util.TreeMap;

public class test {
    public static void main(String[] args) {
        Map<String,Integer> m=new TreeMap<>();
        m.put("a",1);
        m.put("d",2);
        m.put("c",3);
        m.put("r",null);
        m.put("s",8);
        m.put("b",8);
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.entrySet());

        System.out.println(m.remove("a"));
        System.out.println(m.remove(("jjjjj")));
        System.out.println(m.put("ppp",999));
        System.out.println(m.put("a",1));

        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m);
        System.out.println(m.get("梨"));
        System.out.println(m.get("p"));
//        System.out.println(m.get(null));
        System.out.println(m.getOrDefault("橘",4));

    }
}
