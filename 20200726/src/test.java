import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(input);
        for (int i = 0; i <k; i++) {
            list.add(input[i]);
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num=new int[n];
        for (int i = 0; i <n; i++) {
            num[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(GetLeastNumbers_Solution(num,k));
    }
}
