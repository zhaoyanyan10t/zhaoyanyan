import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        judge(str);
    }
    public static void judge(String str){
        int t=0;
        long sum=0;
        for (int i = str.length()-1; i>=0; i--) {

            char ch=str.charAt(i);
            int tmp=0;

            if(ch>='0'&&ch<='9'){
                tmp=ch;
            }else if(ch>='a'&&ch<='z'){
                tmp=ch-87;
            }else if(i==0&&ch=='-'){
                tmp=0;
            }else{
                System.out.println("0");
                return ;
            }
            sum+=tmp*Math.pow(36,t++);
        }

        if(Math.abs(sum) <= 9223372036854775807.0){

            if(str.charAt(0)=='-'){
                System.out.println("-"+sum);
            }else{
                System.out.println(sum);
            }
        }else{
            System.out.println("0");
        }
    }
}
