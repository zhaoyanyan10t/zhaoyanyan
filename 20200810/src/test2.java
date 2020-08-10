import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test2 {
    public static void main(String[] args) {
        String J="aA";
        String S="aAAbbbb";
        Map<Character,Integer> m=new HashMap<>();
        for (int i = 0; i <S.length() ; i++) {
            char ch=S.charAt(i);
            int count=m.getOrDefault(ch,0);
            m.put(ch,count+1);
        }
        int sum=0;
        for (int i = 0; i <J.length() ; i++) {
            char ch=J.charAt(i);
            sum+=m.getOrDefault(ch,0);
        }
        System.out.println(sum);
    }
    public static void main1(String[] args) {
        String J="aA";
        String S="aAAbbbb";
        int count=0;
        for (int i = 0; i <J.length() ; i++) {
            char ch=J.charAt(i);
            for (int j = 0; j <S.length() ; j++) {
                if(ch==S.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
