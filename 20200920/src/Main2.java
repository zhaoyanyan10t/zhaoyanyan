import java.util.Scanner;

public class Main2 {
    public static String judge(String str){
        for (int i = 0; i <str.length() ; i+=3) {
            String s1=str.substring(i,i+3);
            for (int j = i+3; j <str.length(); j+=3) {
                String s2=str.substring(j,j+3);
                if((s1.charAt(0)==s2.charAt(0) &&s1.charAt(1)==s2.charAt(1))
                        ||(s1.charAt(0)==s2.charAt(0)&&s1.charAt(2)==s2.charAt(2))
                        ||(s1.charAt(2)==s2.charAt(2)&&s1.charAt(1)==s2.charAt(1))){
                    continue;
                }else{
                    return "NO";
                }
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] ss=new String[n];
        for (int i = 0; i <n; i++) {
            ss[i]=sc.next();

        }
        for (int i = 0; i < ss.length; i++) {
System.out.println(judge(ss[i]));
        }

    }
}
