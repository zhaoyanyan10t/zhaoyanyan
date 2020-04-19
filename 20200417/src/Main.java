import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(10*30+"万元");
        int total=0;
        for (int i = 0; i <30 ; i++) {
            int t= (int) Math.pow(2,i);
            total+=t;
        }
        System.out.println(total+"分钱");
    }
    public static void main2(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=sc.nextInt();
//        String str="AACTGTGCACGACCTGA";
//        int n=5;
        int j = 0;
        int max=0;
        int end=0;
        while(j<=str.length()-n) {
            int count=0;
            for (int i = j; i < j+n; i++) {
                if (str.charAt(i) == 'C' || str.charAt(i) == 'G') {
                    count++;
                    if(max<count){
                        max=count;
                        end=j;
                    }
                }
            }
            j++;
        }
        System.out.println(str.substring(end,end+n));
    }
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            int N = sc.nextInt();
            int[] score = new int[N];
            for (int i = 0; i < N; i++) {
                score[i] = sc.nextInt();
            }
            int S = sc.nextInt();
            int count=0;
            for (int i = 0; i <N ; i++) {
                if(S==score[i]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
