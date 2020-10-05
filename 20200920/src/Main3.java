import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int count=0;
        StringBuffer str=new StringBuffer();
        for (int i = 0; i <s1.length() ; i++) {
            char ch=s1.charAt(i);
            if(s2.contains(String.valueOf(ch))&&(!str.toString().contains(String.valueOf(ch)))){
                str.append(ch);
                count++;
            }
        }
        System.out.println(count);
    }
}
