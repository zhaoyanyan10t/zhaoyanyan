import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        String[] ss = str.split(",");

        int[] arr = new int[ss.length];
        for (int i = 0; i < ss.length; i++) {
            arr[i] = ss[i].charAt(0) - 48;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == n) {
//                    System.out.println(arr[i] + "," + arr[j]);
                    int[] nnn={arr[i],arr[j]};
                    System.out.println(nnn[0]+"，"+nnn[1]);
                }
            }
        }
    }
}
