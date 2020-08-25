import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1="";
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if(i==0||ch=='n'){
                char ch1= (char) (ch-32);
                str1+=ch1;
            }else {
                str1 += ch;
            }
        }
        for (int i = 0; i < str1.length(); i++) {
            char ch=str1.charAt(i);
            if(ch>='A'&&ch<='Z'&&i!=0){
                System.out.println();
            }
            System.out.print(str1.charAt(i));
        }
//        System.out.println(str1.charAt(str1.length()-1));
    }
}
