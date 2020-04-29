import java.util.Scanner;

public class Main {
    public static void sort(int[] arr,int a,int b){
        a=Math.max(a,b);
        b=Math.min(a,b);

        int max=0;
        for (int i = a-1; i <=b-1; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int N=sc.nextInt();
            int M=sc.nextInt();
            int[] Num=new int[N];
            for (int i = 0; i <N ; i++) {
                Num[i]=sc.nextInt();
            }
            for (int j = 0; j <M; j++) {
                String  ch=sc.next();
                int A=sc.nextInt();
                int B=sc.nextInt();
                    if(ch.equals("Q")){
                        sort(Num,A,B);
                    }else if(ch.equals("U")){
                        Num[A-1]=B;
                    }
            }

        }
    }
}
