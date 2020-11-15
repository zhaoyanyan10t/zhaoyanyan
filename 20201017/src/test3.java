import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().replaceAll(" ","");

        StringBuffer s0=new StringBuffer();
        StringBuffer s1=new StringBuffer();
        StringBuffer s2=new StringBuffer();
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if(ch>='0'&&ch<='9'){
                s0.append(ch);
            }else  if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
             s1.append(ch);
            }else{
                s2.append(ch);
            }
        }
        System.out.println(s0+" "+s0.length());
        System.out.println(s1+" "+s1.length());
        System.out.println(s2+" "+s2.length());
    }
}
