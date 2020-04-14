import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class test {
    public static void main(String[] args) {
        Set<String > set=new HashSet<>();
        set.add("apple");
        set.add("orange");
        set.add("banana");
        set.add("zron");
        System.out.println(set);

    }
    public static void main1(String[] args) {
        Map<String,String> m1=new TreeMap<>();
//        Map会保证key是一个有序的序列，
//        会对key进行英文字母的排序

        m1.put("zpple","果");
        m1.put("apple","苹果");
        m1.put("orange","橘子");
        System.out.println(m1);
        System.out.println(m1.size());
//        如果key存在，就更新value的值，如果不存在，就直接添加.
        m1.put("orange","橙子");
        System.out.println(m1);
//        m1.put(null,"橙子");//插入期间，key值不能为空，如果为空，会抛异常，key为空，无法比较就会报异常
        m1.put("banana",null);
        m1.put("sd","苹果");
        System.out.println(m1);
        //value 可以为空，
        for(String value:m1.values()){
            System.out.println(value);
        }


    }
}
