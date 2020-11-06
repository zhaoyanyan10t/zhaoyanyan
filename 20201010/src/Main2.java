import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=sc.nextInt();
        if(n!=0) {
            String s = sc.next();
            StringBuffer s1=new StringBuffer();
            for (int i = 0; i <s.length() ; i++) {
                char ch=s.charAt(i);
                if(ch!='-'){
                 s1.append(ch);
                }else{
                    break;
                }
            }
            StringBuffer s2=new StringBuffer();
            for (int i = s.length()-1; i>=0 ; i--) {
                char ch=s.charAt(i);
                if(ch!='>'){
                    s1.append(ch);
                }else{
                    break;
                }
            }
            String ss=str.replace(s1,s2);
            System.out.println(ss);
        }
        if(n==0){

        }
        for (int i = 0; i <n ; i++) {

        }
    }
}
