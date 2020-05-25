import java.util.ArrayList;
import java.util.Scanner;

public class Main {
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
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            ArrayList<String> list=new ArrayList<>();
            for (int i = 0; i <n; i++) {
                String str=sc.nextLine();
                str=str.replace("-","");
                String s1="";
                    for (int j = 0; j <str.length() ; j++) {
                        char ch=str.charAt(j);
//                        if((ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9')){
                            int f=change(ch);
                            s1+=f;
//                        }
                    }
                    s1=s1.substring(0,3)+"-"+s1.substring(3,7);
                    if(!list.contains(s1)){
                        list.add(s1);
                    }
            }
            for (int i = 0; i <list.size(); i++) {
                System.out.println(list.get(i));
            }
            System.out.println();
        }
    }
}
