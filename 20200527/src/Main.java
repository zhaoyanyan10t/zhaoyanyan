import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String A=sc.next();
            String B=sc.next();
            if(judje(A,B)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
    public static boolean judje(String A,String B){
        Map<Character,Integer> ma=new HashMap<>();
        for (int i = 0; i <A.length() ; i++) {
            char ch=A.charAt(i);
            int count=ma.getOrDefault(ch,0);
            ma.put(ch,count+1);
        }
        for (int i = 0; i <B.length() ; i++) {
            char ch=B.charAt(i);
            //查找有没有ch
//                如果没有直接返回false
            if(!ma.containsKey(ch)){
                return false;
            }
            else{
                int count=ma.get(ch);
                if(count==0){
                    return false;
                }
                ma.put(ch,count-1);
            }
        }
        return true;
    }
}
