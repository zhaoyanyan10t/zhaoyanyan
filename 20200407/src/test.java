import java.util.Arrays;
import java.util.Scanner;
public class test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
//        String[] strs = str.split(" ");
        int[] num = new int[str.length()];
        for (int i = 0; i < num.length; i++) {
            int n=Integer.valueOf(str.charAt(i));
            num[i] = Integer.valueOf(str.charAt(i));
        }
        Arrays.sort(num);
        System.out.print(num[(num.length)/2-1]);
    }
}


//import java.util.Scanner;
//
//public class test{
//    static Scanner sc=new Scanner(System.in);
//    static int n=sc.nextInt();
//    static int[] num=new int[n+1];
//    //N为剩余物品的重量，n为剩余可选物品的个数
//    static int count=0;
//    public static void Count(int N,int n){
//        //代表刚装满
//        if(N==0){
//            count++;
//            return;
//        }
//        if(N<0||n<1){
//            return ;
//        }
//        Count(N-num[n],n-1);
//        Count(N,n-1);
//    }
//    public static void main(String[] args) {
//
//        for (int i = 1; i <=n; i++) {
//            num[i]=sc.nextInt();
//        }
//        Count(40,n);
//        System.out.println(count);
//
//    }
//}

//import java.util.Scanner;
//
//public class test {
//    String str=new String("good");
//    char[]ch={'a','b','c'};
//    public static void main(String[] args) {
//        test ex=new test();
//        ex.change(ex.str,ex.ch);
//        System.out.print(ex.str+" and ");
//        System.out.print(ex.ch);
//    }
//    public  void change(String str,char ch[]){
////引用类型变量，传递的是地址，属于引用传递。
//        str="test ok";
//        ch[0]='g';
//    }
////        StringBuffer a=new StringBuffer("A");
////        StringBuffer b=new StringBuffer("B");
////        operate(a,b);
////        System.out.println(a+"."+b);
////    }
////    static void operate(StringBuffer x,StringBuffer y) {
////        x.append(y);
////        y=x;
////    }
//
//
//// Scanner sc = new Scanner(System.in);
////        while (sc.hasNext()) {
////            char[] ch = sc.nextLine().toCharArray();
////            String str = sc.nextLine();
////            for (int i = 0; i < ch.length; i++) {
////                if (!str.contains(String.valueOf(ch[i]))) {
////                    System.out.print(ch[i]);
////                }
////            }
////        }
////    }
//}
