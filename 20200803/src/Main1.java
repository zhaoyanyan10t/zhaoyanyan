import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("b");
        System.out.println(list);
        System.out.println(list.get(1));
//        System.out.println(list.get(8));
        System.out.println(list.subList(1,3));
        System.out.println(list.contains("u"));
        System.out.println(list.contains("e"));
        System.out.println(list.indexOf("b"));
        System.out.println(list.lastIndexOf("b"));
        System.out.println(list.size());
        list.set(3,"ddd");
        System.out.println(list.get(3));

    }
}
