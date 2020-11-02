import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuffer s=new StringBuffer();
        int count=1;
        char ch=str.charAt(0);
        for (int i = 1; i <str.length(); i++) {

//            if(i<str.length()-1)
//            char ch1=str.charAt(i+1);
            if(ch==str.charAt(i)){
                count++;
            }else{
                s.append(ch+"_"+count+"_");
                count=1;
                ch=str.charAt(i);
            }
        }
        s.append(ch+"_"+count);
        System.out.println(s.toString());
    }
}
