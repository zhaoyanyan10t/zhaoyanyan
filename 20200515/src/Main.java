import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s1=sc.next().toUpperCase();
            String s2=sc.next().toUpperCase();
            Set<Character> s=new HashSet<>();

            for (int i = 0; i <s1.length() ; i++) {
                char c=s1.charAt(i);
                if(!s2.contains(String.valueOf(c))){
                    if(s.add(c)){
                        System.out.print(c);
                    }
                }
            }
        }
    }

//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while(sc.hasNext()) {
//            String s1 = sc.next().toUpperCase();
//            String s2 = sc.next().toUpperCase();
//            StringBuffer s = new StringBuffer();
//            for (int i = 0; i < s1.length(); i++) {
//                char c=s1.charAt(i);
//                if(!s2.contains(String.valueOf(c))){
//                    if(!s.toString().contains(String.valueOf(c)))
//                    s.append(c);
//                }
//            }
//            System.out.println(s);
//        }
//    }
}
