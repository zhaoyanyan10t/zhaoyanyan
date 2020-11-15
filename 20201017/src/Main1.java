import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=s.charAt(0);
        int n=1;
        for (int i = 1; i <s.length() ; i++) {
            char c=s.charAt(i);
            if(ch!=c){
                ch=s.charAt(i);
                n++;
            }
        }
        double d=s.length()*1.0/n;
        System.out.println(d);
    }
}
