package lesson4;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){//空格 换行符
            System.out.print(sc.next());
        }
//        while(sc.hasNextLine()){//只读取到换行符
//            System.out.println(sc.nextLine());
//        }
//        while(sc.hasNextInt()){
//            System.out.print(sc.nextInt());
//        }
    }
}
