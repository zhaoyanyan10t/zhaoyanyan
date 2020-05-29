package code1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> m=new LinkedHashMap<>();
        while(sc.hasNext()){
            String str=sc.next();//文件名
            int n=sc.nextInt();//行号
            String[] s1=str.split("\\\\");
            String s2=s1[s1.length-1];
            if(s2.length()>16){
                s2=s2.substring(s2.length()-16);
            }
            String s3=s2+" "+n;
            if(m.containsKey(s3)){
                int count=m.get(s3);
                m.put(s3,count+1);
            }else{
                m.put(s3,1);
            }
        }
        //输出最后8条记录
        int t=m.size();
        for (String s4:m.keySet()) {
            if(t<9){
                System.out.println(s4+" "+m.get(s4));
            }
            t--;
        }
    }
}
