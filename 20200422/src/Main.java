import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            String s=sc.nextLine();
            Map<Character,Integer> m1=new HashMap<>();
            for (int i = 0; i <str.length() ; i++) {
                int count= m1.getOrDefault(str.charAt(i),0);
                m1.put(str.charAt(i),count+1);
            }
            int t=0;
            for (int i = 0; i <s.length() ; i++) {
                char ch=s.charAt(i);
                if(m1.containsKey(ch)){
                    int value=m1.get(ch);
                    if(value>0){
                        int count=value;
                        m1.put(s.charAt(i),count-1);
                    }else{
                        t++;
                    }
                }else{
                    t++;
                }
            }
            if(t==0){
                System.out.println("Yes "+(str.length()-s.length()));
            }else{
                System.out.println("No "+t);
            }
        }
    }
}
