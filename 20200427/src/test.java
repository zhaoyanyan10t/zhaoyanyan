import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num=sc.nextDouble();

    }
    public static float ji(int n,int[] num,int[] score){
        float t=0;
        float ss=0;
        for (int i = 0; i < n; i++) {
            if (score[i] <= 100 && score[i]>= 90) {
                t=4.0f;
            }else if(score[i]>=85){
                t=3.7f;
            }else if(score[i]>=82){
                t=3.3f;
            }else if(score[i]>=78){
                t=3.0f;
            }else if(score[i]>=75){
                t=2.7f;
            }else if(score[i]>=72){
                t=2.3f;
            }else if(score[i]>=68){
                t=2.0f;
            }else if(score[i]>=64){
                t=1.5f;
            }else if(score[i]>=60){
                t=1.0f;
            }else{
                t=0;
            }
            ss+=t*num[i];
        }
        return ss;
    }
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num=new int[n];//学分
        int sum=0;
        int[] score=new int[n];
        for (int i = 0; i <n; i++) {
            num[i]=sc.nextInt();
            sum+=num[i];
        }
        for (int i = 0; i <n ; i++) {
            score[i]=sc.nextInt();
        }
        float nn=ji(n,num,score)/sum;
        System.out.printf("%.2f",nn);
    }
}
