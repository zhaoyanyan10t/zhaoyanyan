import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int t=0;
        long sum=0;
        for (int i = str.length()-1; i>=0; i--) {
            char ch=str.charAt(i);
            int tmp;
            if(ch>='0'&&ch<='9'){
                tmp=ch;
            }else{
                tmp=ch-55;
            }
            sum+=tmp*Math.pow(36,i);
        }
        String str1=sum+"";
        if(str1.length()>19){
            System.out.println("0");
        }
       else  if(sum <= Math.abs(9223372036854775807.0)){
            System.out.println(sum);
        }else{
            System.out.println("0");
        }
    }
}
