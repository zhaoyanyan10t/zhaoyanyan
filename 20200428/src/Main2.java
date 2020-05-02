import java.util.Scanner;

public class Main2 {
    public static void ip(String ip){
        String[] result=ip.split("\\.");
        StringBuffer s=new StringBuffer();
        for (int i = 0; i <result.length ; i++) {
            String n=Integer.toBinaryString(Integer.valueOf(result[i]));
            s.append(n);
        }
        long a=Integer.parseInt("s",2);
        System.out.println(a);
    }
    public static void str(String str){

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        while(sc.hasNext()){
            String ip="10.0.3.193";
//            String str=sc.next();
            ip(ip);
        }
//    }
}
