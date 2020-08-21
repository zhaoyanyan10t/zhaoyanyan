package lesson1;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        sc.hasNext();
//        String str=sc.next();
//        sc.hasNextLine();
//        String str=sc.nextLine();
        sc.nextInt();
        int str=sc.nextInt();
        System.out.println(str);
    }
}
