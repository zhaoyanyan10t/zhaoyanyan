import java.util.ArrayList;
import java.util.Collections;
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
        }else if(c>='J'&&c<='L'){
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
            ArrayList<String> list = new ArrayList<String>();
            int n=sc.nextInt();
            for (int i = 0; i <n; i++) {
                String str=sc.next();

                    int count=0;
                    StringBuilder s1=new StringBuilder();
                    for (int j = 0; j <str.length() ; j++) {
                        char ch=str.charAt(j);
                        if((ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9')){

                            int f=change(ch);
                            if(count==3){
                                s1.append("-");
                            }
                            count++;
                            s1.append(f);
                        }
                    }
                    if(!list.contains(s1.toString())){
                        list.add(s1.toString());
                    }
            }
            Collections.sort(list);
            for (int i = 0; i <list.size(); i++) {
                System.out.println(list.get(i));
            }
            System.out.println();
        }
    }
}
