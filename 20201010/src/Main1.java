import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.nextLine().charAt(0);
        int n=sc.nextInt();
        String[]  s=new String[n];
        for (int i = 0; i <n ; i++) {
            s[i]=sc.next();
        }
        StringBuffer str=new StringBuffer();
        str.append(ch);
        int count=0;
        for (int i = 0; i <n ; i++) {
            String ss=s[i];
            if(str.toString().contains(String.valueOf(ss.charAt(0)))){
                if(!str.toString().contains(String.valueOf(ss.charAt(ss.length()-1))))
                count++;
                str.append(ss.charAt(ss.length()-1));
            }
        }
        System.out.println(count);
    }
}
