import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class test {
    public static void main(String[] args) {
        Map<String ,Integer> m=new TreeMap<>();
        m.put("a",1);
        m.put("b",2);
        m.put("c",3);
        m.put("d",4);
//        m.put(null,7);
        m.put("ff",null);
        m.put("c",88);
        m.put("gg",88);

        System.out.println(m);
        System.out.println(m.size());
        System.out.println(m.get("a"));
        System.out.println(m.get("e"));
        System.out.println(m.getOrDefault("b",5));
        System.out.println(m.getOrDefault("p",6));
        System.out.println(m.remove("a"));
        System.out.println(m.size());
        System.out.println(m);
        for (String s:m.keySet()) {
            System.out.print(s);
        }
        for (Integer e:m.values()) {
            System.out.println(e);
        }
        for (Map.Entry<String,Integer> ww:m.entrySet()) {
            System.out.println(ww);
        }

    }
}
