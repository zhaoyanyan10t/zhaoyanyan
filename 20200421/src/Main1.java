import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            String str1=sc.nextLine().toUpperCase();
            String str2=sc.nextLine().toUpperCase();
            StringBuffer str=new StringBuffer();
            Set<Character> s = new HashSet<>();
            Set<Character> s1 = new HashSet<>();
            for (int i = 0; i <str2.length(); i++) {
                s.add(str2.charAt(i));
            }
            for (int i = 0; i <str1.length() ; i++) {
                if(!s.contains(str1.charAt(i))){
                    if(s1.add(str1.charAt(i)))
                    System.out.print(str1.charAt(i));
                }
            }
//            for (int i = 0; i < str1.length(); i++) {
//                if(!s.contains(str1.charAt(i))&&!str.toString().contains(String.valueOf(str1.charAt(i)))){
//                    str.append(str1.charAt(i));
//                }
//            }
//            System.out.println(str);
        }
     }
    public static void main5(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str1=sc.nextLine().toUpperCase();
            String str2=sc.nextLine().toUpperCase();
            StringBuffer str=new StringBuffer();
            for (int i = 0; i <str1.length() ; i++) {
                if(!str2.contains(String.valueOf(str1.charAt(i)))){
                    if(!str.toString().contains(String.valueOf(str1.charAt(i))))
                    str.append(str1.charAt(i));
                }
            }
            System.out.println(str);
        }
    }
    public static void main3(String[] args) {
        String S="aAAbbbb";
        String J="z";
        int sum=0;
        Map<Character,Integer> m=new HashMap<>();
        for (int i = 0; i <S.length() ; i++) {
            int count=m.getOrDefault(S.charAt(i),0);
            m.put(S.charAt(i),count+1);
        }
        for (int i = 0; i <J.length(); i++) {
            sum+=m.getOrDefault(J.charAt(i),0);
        }
        System.out.println(sum);
    }
    public static void main2(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            StringBuffer str1=new StringBuffer();
            for (int i = 0; i <str.length() ; i++) {
                char ch=str.charAt(i);
                if(ch>='F'&&ch<='Z'){
                    str1.append((char)(ch-5));
                }else if(ch>='A'&&ch<'F'){
                    str1.append((char)(ch+21));
                }else{
                    str1.append(ch);
                }
            }
            System.out.println(str1);
        }
    }
    public static int ra(int n){
        if(n==1||n==2){
            return 1;
        }
        return ra(n-1)+ra(n-2);
    }
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(ra(n));
        }

    }
}
