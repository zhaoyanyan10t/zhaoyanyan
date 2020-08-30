import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] num=new int[n];
        int sum=0;
        for (int i = 0; i <n  ; i++) {
            num[i]=sc.nextInt();
            sum+=num[i];
        }
        Arrays.sort(num);
        System.out.print(result(num,m));
    }

    private static int  result(int[] num,int m) {
        if(num.length==1){
            return 1;
        }
        if(num[0]+m<num[1]){
            return 1;
        }else if(num[0]+m==num[1]){
            return 2;
        }

        int start=0;
        for (int i = num.length-1; i >=0; i--) {
            int tmp=0;
            int sum=num[i];
            for (int j = i-1; j >=0 ; j--) {
                tmp+=num[i]-num[j];
                sum+=num[j];
            }
            if(tmp==m){
                return i+1>num.length?num.length:i+1;
            }else if(tmp<m){
                int r=i+1;
                return r>num.length?num.length:r;
            }
        }
        return 0;
    }

}
