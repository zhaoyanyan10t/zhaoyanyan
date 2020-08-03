import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        String str5="192.168.0.1";
        String[] str6=str5.split("\\.");
        for (String s:str6) {
            System.out.println(s);
        }
    }
    public static void main1(String[] args) {


        String str2="hello world change world";
        String[] str3=str2.split(" ");
//        for (int i = 0; i <str3.length ; i++) {
//            System.out.print(str3[i]);
//        }
        System.out.println(Arrays.toString(str3));
        System.out.println(str2.toCharArray());
        String [] str4=str2.split(" ",2);
        for (String s:str4) {
            System.out.println(s);
        }



        char[] chars={'a','b','c'};
        String str=new String(chars);
//        System.out.println(str);
//        System.out.println(new String(chars,1,2));
        String str1="123445";
//        System.out.println(str1.startsWith("1"));
//        System.out.println(str1.startsWith("2",1));
        System.out.println(str1.indexOf("45"));
//        System.out.println(is(str1));
    }
    public static boolean is(String str){
        char[] chars=str.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            if(chars[i]<'0'||chars[i]>'9'){
                return false;
            }
        }
        return true;
    }
}
