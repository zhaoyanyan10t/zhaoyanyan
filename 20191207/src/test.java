import java.util.Scanner;
public class test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

            String str=sc.nextLine();
            StringBuilder s=new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char tmp=str.charAt(i);
                if(!s.toString().contains(tmp+"")){
                    s.append(tmp);
                }
            }
            System.out.println(s.toString());

//        while(sc.hasNext()){
//            String str=sc.nextLine();
//            StringBuilder s=new StringBuilder();
//            for (int i = 0; i < str.length(); i++) {
//                char tmp=str.charAt(i);
//                if(!s.toString().contains(tmp+"")){
//                    s.append(tmp);
//                }
//            }
//            System.out.println(s.toString());
//        }
    }
}
//import java.util.Scanner;
//
//public class test {
//    public static void fun(String s){
//        System.out.print(s.charAt(0));
//        for (int i = 1; i <s.length() ; i++) {
//            int j=i-1;
//            int count=0;
//            while(j>=0){
//                if(s.charAt(i)==s.charAt(j)){
//                    count++;
//                }
//                j--;
//            }
//            if(count==0){
//                System.out.print(s.charAt(i));
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
//        fun(str);
//    }
//}
