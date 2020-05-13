
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String [] s1=new String[n];
        String [] s2=new String[n];
        for (int i = 0; i <n ; i++) {
            s1[i]=sc.next();
            s2[i]=sc.next();
        }
        Map<String,Integer> m1=new TreeMap<>();
        Map<String,Integer> m2=new TreeMap<>();
        m1.put("C",0);
        m1.put("J",0);
        m1.put("B",0);
        m2.put("C",0);
        m2.put("J",0);
        m2.put("B",0);
        int V=0,p=0,d=0;
        for (int i = 0,j=0; i < n&&j<n; i++,j++) {
            if(s1[i].equals(s2[j])){
                p=p+1;
            }
            if(s1[i].equals("C")&&s2[j].equals("J")||s1[i].equals("J")&&s2[j].equals("B")||s1[i].equals("B")&&s2[j].equals("C")){
                //甲赢
                V=V+1;
                int count=m1.get(s1[i]);
                m1.put(s1[i],count+1);
            }
            if(s1[i].equals("C")&&s2[j].equals("B")||s1[i].equals("J")&&s2[j].equals("C")||s1[i].equals("B")&&s2[j].equals("J")){
                //甲输
                d=d+1;
                int count=m1.get(s2[j]);
                m2.put(s2[j],count+1);
            }
        }
        System.out.println(V+" "+p+" "+d);
        System.out.println(d+" "+p+" "+V);
        System.out.println(getmax(m1)+" "+getmax(m2));
    }
    public static String getmax(Map<String,Integer> m){
        if(m.get("C")>=m.get("J")){
            if(m.get("C")>m.get("B")){
                return "C";
            }else{
                return "B";
            }
        }else{
            if(m.get("J")>m.get("B")){
                return "J";
            }else{
                return "B";
            }
        }
    }
}
