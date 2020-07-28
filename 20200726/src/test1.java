import java.util.Random;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        int t=random.nextInt(1000);
        while(true){
            System.out.println("qing");
            int n=sc.nextInt();
            if(n>t){
                System.out.println("da");
            }else if(n<t){
                System.out.println("xiao");
            }else{
                System.out.println("dui");
                break;
            }
        }
    }
    public static void main1(String[] args) {
        String a="hello";
        String b="world";
        String c=a+b ;
        System.out.println(c);
        int w=10;
        int d=20;
        final int r;
        String str=a+w+d;
        System.out.println(str);
        System.out.println(w+d);
        r=100;
        System.out.println(r);
    }
}
