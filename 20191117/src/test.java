import java.util.Scanner;

public class test {
    public static boolean judgeSquareSum(int c) {

        for (int i = 0; i <=Math.sqrt(c); i++) {
            for (int j = 0; j <=i; j++) {
                if (Math.pow(i, 2) + Math.pow(j, 2) == c) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个数");
        int a=sc.nextInt();
        System.out.println(judgeSquareSum(a));
    }

}
