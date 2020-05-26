import java.util.Scanner;

public class Mian5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
//            把不是字母的全部换成空格
            StringBuilder str1=new StringBuilder();
            for (int i = 0; i <str.length(); i++) {
                char ch=str.charAt(i);
                if(ch<'A'||(ch>'Z'&&ch<'a')||ch>'z'){
                    ch=' ';
                }
                str1.append(ch);
            }
            System.out.println(str1);
            String[] s1=str1.toString().split(" ");
            StringBuilder s2=new StringBuilder();
            for (int i = s1.length-1; i >=0; i--) {

                if(i==0){
                    s2.append(s1[i]);
                }else{
                    s2.append(s1[i]+" ");
                }
            }
            System.out.println(s2.toString().trim());
        }
    }
}
