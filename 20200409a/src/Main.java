import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int[] num=new int[10];
        for (int i = 0; i <str.length() ; i++) {
            int t=str.charAt(i)-'0';
            num[t]++;
        }
        for (int t = 0; t < 10; t++) {
            if(num[t]!=0){
                System.out.println(t+":"+num[t]);
            }
        }

    }
}
//    public int[] mutiply(int[] A) {
////        B[i]=B[i]左边的乘积*B[i]右边的乘积
//        int[] B=new int[A.length];
//        for (int i = 0; i < B.length; i++) {
//            B[i]=1;
//            for (int j = 0; j <A.length ; j++) {
//                if(i==j){
//                    continue;
//                }
//                B[i]=A[j]*B[i];
//            }
//        }
//        return B;
//    }
//}
//    public static void main(String[] args) {
////        char n='c';
////        String str=String.valueOf(n);
//
////        char[] ch=new char[]{'a','b'};
////        String str1=String.valueOf(ch);
//
////        char n='c';
////        String str2=Character.toString(n);
//
////        char n='c';
////        String str3=n+"";
//
//        char[] ch=new char[]{'a','b'};
//        String str4=new String(ch);
////        String str="123";
////        for (int i = 0; i < str.length(); i++) {
////            char c=str.charAt(i);
////        }
//
////        String str="123456";
////        char[] c=str.toCharArray();
////        for (int i = 0; i < c.length; i++) {
////            System.out.println(c[i]);
////        }
//
////         char v='1';
////         int n=v-'0';
////        System.out.println(n);
//
////        int n=12;
////        String str=String.valueOf(n);
////        System.out.println(str);
////        String s="100";
////
////        int h=new Integer(s);
////        System.out.println(h);
//
//    }
//    public static void main1(String[] args) {
//        String str="1234";
////        int n=Integer.valueOf(str);
//        int n=Integer.parseInt(str);
//        System.out.println(n);
//    }
//
////    public static void main4(String[] args) {
////        Scanner sc=new Scanner(System.in);
////        String str=sc.nextLine();
////        int[] num=new int[str.length()];
////        for (int i = 0; i <num.length ; i++) {
////            num[i]=Integer.valueOf(str.charAt(i))-'0';
////        }
////        }
////    public static void main2(String[] args) {
////        Scanner sc=new Scanner(System.in);
////        String str=sc.nextLine();
////        int[] num=new int[str.length()];
////        for (int i = 0; i <num.length ; i++) {
//////            直接将字符串中的全部数字转化为int
////            num[i]=Integer.valueOf(str);
////        }
//////    public static void main1(String[] args) {
//////        Scanner sc=new Scanner(System.in);
//////        String str=sc.nextLine();
//////        int[] num=new int[str.length()];
//////        for (int i = 0; i <num.length ; i++) {
////////            当字符串转为单个字符，再转为单个字符串，在转为int型
////////            Integer.parseInt和Integer.valueOf 意思相同
//////            num[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
//////            num[i]=Integer.valueOf(String.valueOf(str.charAt(i)));
//////
//////        }
////    }
//////
////// public static void main(String[] args) {
//////        Scanner sc=new Scanner(System.in);
//////        String str=sc.nextLine();
//////        int t=str.charAt(1)-'0';
//////        System.out.println(t);
//////        int[] num=new int[str.length()];
//////        for (int i = 0; i <str.length() ; i++) {
////////            num[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
////////            num[i]=Integer.valueOf(str);
////////            num[i]=Integer.valueOf(String.valueOf(str.charAt(i)));
//////            num[i]=Integer.valueOf(str.charAt(i))-'0';
//////        }
//////        String[] strs = str.split(" ");
//////        for (int i = 0; i <strs.length ; i++) {
//////            System.out.print(strs[i]+" ");
//////        }
//////
//////
//////        for (int i = 0; i <num.length ; i++) {
//////            System.out.println(num[i]);
//////        }
//////    }
//////    public static int countWays(int x, int y) {
//////        // write code here
//////        //递归 从左上角开始走，递归到下一层计算
//////        // 从左上角格子的右边格到右下角加上左上角格子的下面格子到右下角
//////        // ，如此递归下去
//////        if(x==1||y==1){
//////            return 1;
//////        }
//////        return countWays(x-1,y)+countWays(x,y-1);
//////    }
//////    public static void main(String[] args) {
//////        Scanner sc=new Scanner(System.in);
//////        int num=sc.nextInt();
//////        int a=0;
//////        int b=1;
//////        while(b<num){
//////            int tmp=a+b;
//////            a=b;
//////            b=tmp;
//////        }
//////        if(b-num>num-a){
//////            System.out.println(num-a);
//////        }else{
//////            System.out.println(b-num);
//////        }
////    }
//}
