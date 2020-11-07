import java.util.HashMap;
import java.util.Stack;

public class test {
    public String getMaxChar(String str) {

        HashMap<Character, Integer> map = new HashMap<>();
        StringBuffer s=new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = map.get(ch);
            map.put(ch,count+1);

        }
        int max=0;
        for (Character cc:map.keySet()) {

        }
        for(int i=0;i<map.size();i++){
            s.append(map)
            if(map.k)
        }
    }


    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=0;
        c=a+++b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        System.out.println(s.size());
    }
}
