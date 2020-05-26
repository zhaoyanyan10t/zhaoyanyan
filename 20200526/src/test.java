import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] num=new int[n];
            for (int i = 0; i < n; i++) {
                num[i]=sc.nextInt();
            }
            int max=0x80000000;
            int sum=0;
            for (int i = 0; i <n; i++) {
                if(sum<0){
                    sum=num[i];
                }else{
                    sum+=num[i];
                }
                if(sum>max){
                    max=sum;
                }
            }
            System.out.println(max);
        }
    }
}
