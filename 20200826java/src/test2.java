import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next().toLowerCase();
        char c1=sc.next().toLowerCase().charAt(0);
        char c2=sc.next().toLowerCase().charAt(0);
        int max1=0,min1=0;
        int max2=0,min2=0;
        for (int i = 0; i <str.length(); i++) {
            char ch=str.charAt(i);
            if(ch==c1){
                min1=i;
            }
            if(ch==c2){
                min2=i;
            }
        }
        for (int i = str.length()-1; i >=0; i--) {
            char ch=str.charAt(i);
            if(ch==c1){
                max1=i;
            }
            if(ch==c2){
                max2=i;
            }
        }
        int cha1=Math.abs(max1-min2);
        int cha2=Math.abs(max2-min1);
        if(cha1>cha2){
            System.out.println(cha1);
        }else{
            System.out.println(cha2);
        }
    }

}
