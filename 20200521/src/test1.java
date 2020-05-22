import java.util.Scanner;

public class test1 {
    public static boolean judge(String str){
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if(ch<'0'||ch>'9'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            String[] str=s.split(";");
            int x=0,y=0;
            for (int i = 0; i <str.length ; i++) {
                char ch=str[i].charAt(0);
                String str1=str[i].substring(1);
                if(judge(str1)){
                    int s1=Integer.valueOf(str1);
                    if(ch=='A'){
                        x-=s1;
                    }
                    if(ch=='D'){
                        x+=s1;
                    }if(ch=='W'){
                        y+=s1;
                    }if(ch=='S'){
                        y-=s1;
                    }
                }
            }
            System.out.println(x+","+y);
            }

    }
}
