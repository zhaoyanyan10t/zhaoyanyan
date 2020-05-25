import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static int change(char c){
        int t=0;
        if(c>='A'&&c<='C'){
            t=2;
        }else if(c>='D'&&c<='F'){
            t=3;
        }else if(c>='G'&&c<='I'){
            t=4;
        }else if(c>='J'&&c<='K'){
            t=5;
        }else if(c>='M'&&c<='O'){
            t=6;
        }else if(c>='P'&&c<='S'){
            t=7;
        }else if(c>='T'&&c<='V'){
            t=8;
        }else if(c>='W'&&c<='Z'){
            t=9;
        }else if(c>='0'&&c<='9'){
            t=c-48;
        }
        return t;
    }
    public static void main(String[] args) {

        String num1="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String num2="222333444555666777788899991234567890";
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            ArrayList<String> list=new ArrayList<>();
            for (int i = 0; i <n; i++) {
                String str=sc.next();
//                str=str.replace("-","");
                String s1="";
                StringBuilder s2=new StringBuilder();
                for (int j = 0; j <str.length() ; j++) {
//                    char ch=str.charAt(j);
//                    s1+=num2.charAt(num1.indexOf(ch+""));
                    char ch=str.charAt(j);
                        if((ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9')){
                    int f=change(ch);
                    if(j==3){
//                        s1+="-";
                        s2.append("-");
                    }
//                    s1+=f+"";
                    s2.append(f);
                        }
                }

                if(!list.contains(s2.toString())){
                    list.add(s2.toString());
                }
            }
            for (int i = 0; i <list.size(); i++) {
                System.out.println(list.get(i));
            }
            System.out.println();
        }
    }
}
