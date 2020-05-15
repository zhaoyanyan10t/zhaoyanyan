import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String, Integer> m=new LinkedHashMap<String, Integer>();
        while(sc.hasNext()){
            String str=sc.next();
            int c=sc.nextInt();
            String [] s=str.split("\\\\");
            String tmp=s[s.length-1];
            if(tmp.length()>16){
                tmp=tmp.substring(tmp.length()-16);
            }
            String s1=tmp+" "+c;
            if(m.containsKey(s1)){
                int count=m.getOrDefault(s1,0);
                m.put(s1,count+1);
            }else{
                m.put(s1,1);

            }
        }
        int count=1;
        for (String s2:m.keySet()) {
            if(count>(m.size()-8)){
                System.out.println((s2)+" "+m.get(s2));
            }
            count++;
        }
    }
}