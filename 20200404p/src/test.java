public class test{
    public static void main(String[] args) {
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"*"+i+"="+i*j+" ");
            }
            System.out.println();
        }
    }
}
//import java.util.Scanner;
//
//public class test{
//    //最da公约数
//    public static int min(int x,int y){
//        int z=1;
//        while(x%y!=0){
//             z=x%y;
//            x=y;
//            y=z;
//        }
//        return z;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int x=sc.nextInt();
//        int y=sc.nextInt();
//        int t=x*y;
//        System.out.print(t/min(x,y));
//    }
//}
//
////import java.util.Scanner;
////
////public class test {
////    public static void main(String[] args) {
////        Scanner sc=new Scanner(System.in);
////        int x=sc.nextInt();
////        int y=sc.nextInt();
////        if(x%4==0||y%4==0){
////            System.out.print(x*y/2);
////        }else{
////            System.out.print(x*y/2+1);
////        }
////    }
////}
