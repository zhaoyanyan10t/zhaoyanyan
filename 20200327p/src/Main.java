import java.util.Scanner;

public class Main {
    public static int result(int n){
        int sum=0;
//        while(n>=3){
//            if(n/3==0){
//                sum+=n/3;
//                n=n%3;
//            }else{
//                sum+=n/3;
//                n=n%3+n/3;
//            }
//        }
//        if(n==2){
//            sum=sum+1;
//        }
        while(n>1){
            if(n>=3){
                sum+=n/3;
                n=n%3+n/3;
            }
            if(n==2){
                sum=sum+1;
                break;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            int n=sc.nextInt();
            if(n!=0){
                System.out.println(result(n));
            }
        }
    }
}
