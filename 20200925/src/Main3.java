import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuffer s=new StringBuffer();
        char ch=str.charAt(0);
        if(ch>='A'&&ch<='Z'||(ch>'0'&&ch<='9')){
            String s1=String.valueOf(ch).toLowerCase();
            s.append(s1);
        }else if(ch>='a'&&ch<='z'||(ch>'0'&&ch<='9')){
            String s1=String.valueOf(ch);
            s.append(s1);
        }
        for (int i = 1; i <str.length(); i++) {

            char ch1=str.charAt(i-1);
            char ch2=str.charAt(i);
            if((ch1>'9'&&ch1<'A')||(ch1>'Z'&&ch1<'a')||ch1>'z'||ch1<'0'){

                if(ch2>='A'&&ch2<='Z'||(ch2>'0'&&ch2<='9')){
                    String s2=String.valueOf(ch2);
                    s.append(s2);
                }else if(ch2>='a'&&ch2<='z'||(ch2>'0'&&ch2<='9')){
                    String s3=String.valueOf(ch2).toUpperCase().toUpperCase();
                    s.append(s3);
                }
            }else{
                if(ch2<'A'||(ch2>'Z'&&ch2<'a')||ch2>'z'){
                    continue;
                }else {
                    if((ch1>='A'&&ch1<='Z')||(ch1>='a'&&ch1<='z')||(ch1>='0'&&ch1<='9')){
                        String  s4=String.valueOf(ch2).toLowerCase();
                        s.append(s4);
                    }

                }
            }
        }
        String ss=s.toString();
        StringBuffer ss2=new StringBuffer();
        if(ss.charAt(0)>='A'&&ss.charAt(0)<='Z'){
            String ss1=ss.substring(0,1);
            ss2.append(ss1.toLowerCase());
            ss2.append(ss.substring(1));
        }else{
            ss2.append(0);
        }

        System.out.println(ss2);
    }
}
