import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuffer s1=new StringBuffer();
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);

            while(ch>='0'&&ch<='9'){
                s1.append(ch);
                ch=str.charAt(i++);
            }
            long l=Integer.parseInt(s1.toString());
            if(l>=1000&&l<=3999)
            System.out.println(l);
        }
    }
}
