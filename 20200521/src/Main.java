import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str1=sc.nextLine();
            String[] str2=str1.split(" ");
            StringBuilder str=new StringBuilder();
            for (int i = str2.length-1; i >=0; i--) {
                str.append(str2[i]);
                if(i!=0)
                    str.append(" ");
            }
            System.out.println(str);
        }
    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while(sc.hasNext()){
//            String str1=sc.nextLine();
//            String str2=sc.nextLine();
//            StringBuilder str=new StringBuilder();
//            for (int i = 0; i <str1.length() ; i++) {
//                char ch=str1.charAt(i);
//                if(!str2.contains(String.valueOf(ch))){
//                    str.append(ch);
//                }
//            }
//            System.out.println(str);
//        }
//    }
}
