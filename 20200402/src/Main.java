import java.util.Scanner;

public class Main {    //判断回文
    public static boolean hui(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        int count = 0;
        for (int i = 0;
             i <= A.length(); i++)

        {
            StringBuffer s = new StringBuffer(A);
            s.insert(i, B);
            if (hui(s.toString())) {
                count++;
            }
        }
        System.out.println(count);
    }
}