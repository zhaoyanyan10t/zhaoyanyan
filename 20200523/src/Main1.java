import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str1=sc.nextLine();
            String str2=sc.nextLine();
            System.out.println(Encrypt(str1));
            System.out.println(unEncrypt(str2));
        }
    }
    //加密
    public static StringBuilder Encrypt(String s){
        StringBuilder s1=new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            //小写加密
            if(ch>='a'&&ch<='z'){
                if(ch=='z'){
                    ch=(char)(ch-57);
                }else {
                    ch = (char) (ch - 31);
                }
                s1.append(ch);
            }
            //大写加密
            else if(ch>='A'&&ch<='Z'){
                if(ch=='Z'){
                    ch=(char)(ch+7);
                }else{
                    ch=(char)(ch+33);
                }
                s1.append(ch);
            }
            //数字加密
            else if(ch>='0'&&ch<='9'){
                if(ch=='9'){
                    ch='0';
                }else{
                    ch=(char)(ch+1);
                }
                s1.append(ch);
            }
        }
        return s1;
    }


    //解密
    public static StringBuilder unEncrypt(String s){
        StringBuilder s1=new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            //小写解密
            if(ch>='a'&&ch<='z'){
                if(ch=='a'){
                    ch=(char)(ch-7);
                }else {
                    ch = (char) (ch - 33);
                }
                s1.append(ch);
            }
            //大写加密
            else if(ch>='A'&&ch<='Z'){
                if(ch=='A'){
                    ch=(char)(ch+57);
                }else{
                    ch=(char)(ch+31);
                }
                s1.append(ch);
            }
            //数字加密
            else if(ch>='0'&&ch<='9'){
                if(ch=='0'){
                    ch='9';
                }else{
                    ch=(char)(ch-1);
                }
                s1.append(ch);
            }
        }
        return s1;
    }
}
