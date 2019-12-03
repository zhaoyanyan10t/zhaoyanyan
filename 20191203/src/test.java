import java.util.Scanner;

public class test {
    public static int fun(){
       try{
           return 10;
       }catch(Exception e){
           return 20;
       }finally{
           System.out.println("l");;
       }
    }
    public static void main(String[] args) {
        System.out.println(fun());
//        try{
//
//            fun();
//        }catch(NullPointerException e){
//            e.printStackTrace();
//            System.out.println("oo");
//        }
//        System.out.println("ppp");
//        int[] arr={1,2};
//        try{
//            System.out.println("hahah");
//            arr=null;
//            System.out.println(arr[90]);
//            System.out.println("s");
//        }catch(ArrayIndexOutOfBoundsException e){
////            e.printStackTrace();
//            System.out.println("oo");
//        }
//        System.out.println("pp");

    }
}
