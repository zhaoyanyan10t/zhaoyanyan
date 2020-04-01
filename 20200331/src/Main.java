import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
        String s="abcd12345ed125ss123456789";
        String  s1="";
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                int count=1;
                int index=i;
                for (int j = i+1; j <s.length() ; j++) {
                    if(s.charAt(j)>='0'&&s.charAt(j)<='9'){
                        count++;
                        index=j;
                    }else{

                        break;
                    }
                }
                if(count>s1.length()){
                    s1=s.substring(i,index+1);
                }
            }else{
                continue;
            }
        }
        System.out.println(s1);
    }
}
