import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        String[] arr=new String[k];
        for (int i = 0; i <k ; i++) {
            arr[i]=sc.next();
        }
        int sum=0;
        for (int i = 0; i <k ; i++) {

            String[] s=arr[i].split(",");
            int len=s.length;
            int tmp=Integer.parseInt(s[len-n]);
            sum+=tmp;
        }
        System.out.println(sum);
    }
}
