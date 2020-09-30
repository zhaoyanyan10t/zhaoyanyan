import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] str=s.split(" ");
        for (int i = 0; i <str.length ; i++) {
            String s1=str[i];
            System.out.println(judge(s1));
        }
    }
    public static int judge(String s){
        boolean a=false;
        boolean b=false;
        boolean c=false;
        boolean d=false;

            if(s.length()<8||s.length()>120){
                return 1;
            }
        for (int i = 0; i <s.length() ; i++) {
                char ch=s.charAt(i);
            if(ch>='0'&&ch<='9'){
                a=true;
            }else if(ch>='A'&&ch<='Z'){
                c=true;
            }else if(ch>='a'&&ch<='z'){
                d=true;
            }else{
                b=true;
            }
        }
        if(a&&b&&c&&d){
                return 0;
        }
        return 2;
        }
}
