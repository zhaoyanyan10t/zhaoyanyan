//import java.io.File;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static String fun(String str){
        String[] strs=str.split(" ");
        String ret="";
        for(String s:strs){
            System.out.print(s);
        }
        return ret;
    }
    public static void main4(String[] args) {
        try{
            System.out.println(divide(10, 0));
        }catch(Exception e){
            System.out.println("j");
            e.printStackTrace();

        }

    }

    public static int divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("抛出除 0 异常");
        }
        return x / y;
    }



    public static void main(String[] args) {
        System.out.println(readFile());
    }

    public static String readFile() {
        File file = new File("d:/test.txt");
        Scanner sc = null;
//        Scanner sc = new Scanner(file);
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sc.nextLine();
    }

    //    public static String fun(String str){
//        String[] strs=str.split(" ");
//        String ret="";
//        for(String s:strs){
//            ret+=s;
//        }
//        return ret;
//    }
    public static void main2(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ret=fun(str);
        System.out.println(ret);
    }
    public static void main3(String[] args) {
//        String str="f";
//        String str1="abcdefabc";
//        System.out.println(str1.indexOf(str));
//        System.out.println(str1.startsWith(str,0));
//        System.out.println(str1.endsWith(str));
//        str=str1.replaceAll("abc", "_");//所有的
//        System.out.println(str);
//        String str2=str1.replaceFirst("abc","l");
//        System.out.println(str2);
//        String[] s={"sss","se"};
//        System.out.println(Arrays.toString(s));
//        String str = "name=zhang san&age=18" ;
//        String[] result=str.split("=");
//        for(String s: result) {     System.out.print(s); }
//        String[] result = str.split("&") ;
//        System.out.println(result.length);
//        for (int i = 0; i < result.length; i++) {
//            String[] temp = result[i].split("=") ;
////            System.out.println(temp[0]+" = "+temp[1]);
//            for(String e:temp){
//            System.out.println(e);}
        String str="abcd";
        char[] value=str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(value[i]+" ");
        }
//        System.out.println(Arrays.toString(str));
//        }




        char[] value1={'s','d'};
        for (int i = 0; i <value1.length; i++) {
            System.out.print(value1[i]+" ");
        }
        System.out.println(new String(value1));
        System.out.println("====");
        String str2="adrg";
        System.out.println(str2.toString());
//string 变为stringbuffer
//        StringBuffer s=new StringBuffer(str2);
//        StringBuffer s1=new StringBuffer();
//        s1.append(str2);
//        System.out.println(str2);

        System.out.println("===");
        StringBuffer q=new StringBuffer(str2);
        System.out.println(q.toString());


        int[] arr = {1, 2, 3};
        try {
            System.out.println("before");
             System.out.println(arr[100]);//遇到异常 后续代码将不执行
             System.out.println("after");
        }//有异常则会执行catch  如果没有异常则不执行catch
        catch (ArrayIndexOutOfBoundsException e) {
            // 打印出现异常的调用栈    
             e.printStackTrace();
            System.out.println("异常");
        }finally {
            System.out.println("finally");//有无异常finaly都将会执行
        }
        System.out.println("after try catch");
        System.out.println("zhaoyan");
// 执行结果 before java.lang.ArrayIndexOutOfBoundsException: 100    at demo02.Test.main(Test.java:10) after try catch
    }
}
