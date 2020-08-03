import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();
        m.put("apple",1);
        m.put("banana",2);
        m.put("pear",3);
        m.put("stu",null);
        System.out.println(m.containsKey("a"));
        System.out.println(m.containsKey("apple"));
        System.out.println(m.containsValue(1));
        System.out.println(m.containsValue(4));
        System.out.println(m.get("banana"));
        System.out.println(m.getOrDefault("hh",8));
        System.out.println(m.getOrDefault("apple",8));
        System.out.println(m.isEmpty());
        System.out.println(m.size());
        System.out.println("=========");
        for (Map.Entry<String,Integer> e:m.entrySet()) {
            System.out.println(e.getKey()+","+e.getValue());
        }

    }
    public static void main1(String[] args) {
        Collection<String> list=new ArrayList<>();
        System.out.println(list.isEmpty());
        list.add("wo");
        list.add("ai");
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.remove("e");
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.remove("wo");
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
