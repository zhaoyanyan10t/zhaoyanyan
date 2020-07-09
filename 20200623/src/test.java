import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        //加密
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想要加密的内容(不区分大小写):");
        String s = scanner.nextLine();
        int[] ints = new int[s.length()];
        //将输入的内容转换为0-25
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            ints[i] = (int) c - 97;
        }
        int[][] getkey1 = test.getkey1();//存储密文的数组
        int[] ints1 = new int[4];//用来接收矩阵运算的结果
        int num = 0;
        for (int i = 0; i < getkey1.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                num += ints[j] * getkey1[j][i];
            }
            ints1[i] = num % 26;
            num = 0;
        }
        System.out.print("密文是：");
        for (int i : ints1) {
            System.out.print((char) (i + 97));
        }

         // 解密
        int[][] getkey2 = test.getkey2();//用来接收矩阵运算的结果
        int num1 = 0;//用来接收明文的数组
        int[] ints2 = new int[4];
        for (int i = 0; i < getkey2.length; i++) {
            for (int j = 0; j < ints1.length; j++) {
                num1 = num1 + ints1[j] * getkey2[j][i];
            }
            ints2[i] = num % 26;
            num = 0;
        }
        System.out.println();//打印前先换行
        System.out.println("解密出的明文是(不区分大小写)：");
        for (int anInt : ints) {
            System.out.print((char) (anInt + 97));
        }
    }
    public static int[][] getkey1() {
        int[][] ints1 = {
                {8, 6, 9, 5},
                {6, 9, 5, 10},
                {5, 8, 4, 9},
                {10, 6, 11, 4}
        };
        return ints1;
    }

    public static int[][] getkey2() {
        int[][] ints2 = {
                {23, 20, 5, 1},
                {2, 11, 18, 1},
                {2, 20, 6, 25},
                {25, 2, 22, 15}
        };
        return ints2;
    }

}
