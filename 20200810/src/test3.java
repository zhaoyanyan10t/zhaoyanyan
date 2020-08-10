import java.util.*;

public class test3 {
    public static void main(String[] args) {
        String str="7_This_is_a_test";
        String str1="_hs_s_a_es";
        String str2=str.toUpperCase();
        String str3=str1.toUpperCase();
        Map<Character,Integer> m=new HashMap<>();
        Set<Character> s=new HashSet<>();
        for (int i = 0; i <str3.length() ; i++) {
            char ch=str3.charAt(i);
            s.add(ch);
        }
        List<Character> list=new ArrayList<>();
        for (int i = 0; i <str2.length() ; i++) {
            char ch=str2.charAt(i);
            if(!s.contains(ch)){
                if(!list.contains(ch))
                list.add(ch);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static void main1(String[] args) {
        String str="7_This_is_a_test";
        String str1="_hs_s_a_es";
        StringBuffer s=new StringBuffer();
        String str2=str.toUpperCase();
        String str3=str1.toUpperCase();
        for (int i = 0; i<str2.length() ; i++) {
            String ch=str2.charAt(i)+"";
            if(!str3.contains(ch)){
                if(!s.toString().contains(ch)){
                    s.append(ch);
                    System.out.print(ch);
                }
            }
        }
    }
}
