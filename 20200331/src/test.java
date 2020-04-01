public  class test{
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
//public class test {
//    //判断回文
//    public  static  boolean hui(String s){
//        int len=s.length();
//        for (int i = 0; i <Math.sqrt(len); i++) {
//            if (s.charAt(i) != s.charAt(len - 1-i)) {
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String A=sc.nextLine();
//        String B=sc.nextLine();
//
//        int count=0;
//        for (int i = 0; i <=A.length(); i++) {
//            StringBuffer s=new StringBuffer(A);
//            s.insert(i,B);
//            if(hui(s.toString())){
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}
