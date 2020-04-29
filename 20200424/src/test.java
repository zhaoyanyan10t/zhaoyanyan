import java.util.Scanner;

import static java.lang.Math.abs;

public class test {
    public static int max(int a,int b){
        while(a%b!=0){
            int c=a%b;
            a=b;
            b=c;
        }
        return b;
    }
    public static void main3(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int[] num=new int[n+1];
            num[1]=0;
            for (int i = 1; i <=n ; i++) {
                num[i]=sc.nextInt();
            }
            for (int i = 1; i <=n ; i++) {
                if(num[i]<=a){
                    a=a+num[i];
                }else{
                    a+=max(num[i],a);
                }
            }
            System.out.println(a);
        }
    }

    public static void main2(String[] args) {
        int a=1;
        int b=9;
        System.out.println(Math.abs(a-b));
    }
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num=new int[n];
        for (int i = 0; i <n ; i++) {
            num[i]=sc.nextInt();
        }
        int A1=0,A2=0,A3=0,A5=0;
        float A4=0;
        int count=0;
        float sum4=0;
        int count4=0;
        for (int i = 0; i <n ; i++) {
            if(num[i]%2==0&&num[i]%5==0){
                A1+=num[i];
            }else if(num[i]%5==1){
                A2+=num[i]*Math.pow(-1,count);
                count++;
            }else if(num[i]%5==2){
                A3++;
            }else if(num[i]%5==3){
                sum4+=num[i];
                count4++;
                A4=sum4/count4;
            }else{
                if(A5<num[i]){
                    A5=num[i];
                }
            }
        }
        System.out.print((A1!=0)?(A1+" "):"N ");
        System.out.print((A2!=0)?(A2+" "):"N ");
        System.out.print((A3!=0)?(A3+" "):"N ");
        if(A4!=0){
            System.out.printf("%.1f ",A4);
        }else{
            System.out.print("N ");
        }
        System.out.print((A5!=0)?A5:"N");

    }
}
