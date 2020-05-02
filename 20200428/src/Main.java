import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] Num = new int[N];
            for (int i = 0; i < N; i++) {
                Num[i] = sc.nextInt();
            }
            for (int j = 0; j < M; j++) {
                String ch = sc.next();
                int A = sc.nextInt();
                int B = sc.nextInt();
                if (ch.equals("Q")) {
                    sort(Num, A, B);
                } else if (ch.equals("U")) {
                    Num[A - 1] = B;
                }

            }
        }
    }

    public static void sort(int[] arr, int a, int b) {
        int start = Math.min(a, b)-1;
        int end = Math.max(a, b);
        int max = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}