import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class test2 {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(1,2);
        map.put(3,4);
        map.put(5,6);
        System.out.println(map);
        int s=map.get(1);
       // int s1=map.get(4);
        System.out.println(s);
        //System.out.println(s1);
        Collection<Integer> vv=map.values();
        vv.remove(4);
        System.out.println(vv);
        System.out.println(map);
    }
}
