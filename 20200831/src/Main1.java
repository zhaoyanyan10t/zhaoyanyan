import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num=new int[n];
        for (int i = 0; i <n ; i++) {
            num[i]=sc.nextInt();
        }

        System.out.println(judge(num));
    }
    public static String judge(int[] arr){
        boolean f=false;
        boolean t=false;
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                f=true;
            }
            if(arr[i]==5){
                t=true;
            }
        }
        if(f==false){
            return "-1";
        }
        if(t==false){
            return "0";
        }
        int count5=0;
        int count0=0;
        for (int i =0; i<arr.length ; i++) {
            if(arr[i]==5){
                count5++;
            }
            if(arr[i]==0){
                count0++;
            }
        }
        StringBuffer str=new StringBuffer();
        StringBuffer str1=new StringBuffer();
        for (int i = 0; i <count5 ; i++) {
            str.append("5");
            str1.append("5");
        }
        for (int i = 0; i <count0 ; i++) {
            str.append("0");
        }
        int COUNT=count5;
        while(count5>0){

            long SUM=0;
            for (int i = 0; i <count5 ; i++) {
                long nn = (long) (5*Math.pow(10,i));
                SUM+=nn;
            }
            if((SUM % 9) == 0){
                return str.substring(COUNT-count5).toString();
            }else{
                count5--;
//                str.deleteCharAt('5');
//                str.delete(0,1);
            }
        }
        return "-1";
    }
}
