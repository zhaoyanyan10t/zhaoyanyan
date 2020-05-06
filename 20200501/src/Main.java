import java.util.Scanner;

public class Main {
    public static String  len(String str){
        if(str.length()<=8){
            return "NG";
        }
            return "OK";
    }
    public static String contain(String str){
        int l1=0,l2=0,l3=0,l4=0;
        for (int i = 0; i <str.length();  i++) {
            char ch=str.charAt(i);
            if(ch>='A'&&ch<='Z'){
                 l1=1;
            }else if(ch>='a'&&ch<='z'){
                 l2=1;
            }else if(ch>='0'&&ch<='9'){
                 l3=1;
            }else{
                 l4=1;
            }
        }
        if(l1+l2+l3+l4>=3){
            return "OK";
        }
        return "NG";
    }
    public static String len1(String str){
            for (int j = 0; j <str.length()-3 ; j++) {
                String str1=str.substring(j,j+3);
                String str2=str.substring(j+3);
                if(str2.contains(str1)){
                    return "NG";
                }
            }
            return "OK";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            if(len(str)=="OK"&&contain(str)=="OK"&&len1(str)=="OK"){
                System.out.println("OK");
            }else{
                System.out.println("NG");
            }
        }
    }
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int num= (int) Math.pow(n,2);
            String str=String.valueOf(n);
            String str1=String.valueOf(num);
            for (int i = str.length()-1,j=str1.length()-1; i>=0 ; i--,j--) {
                if(str.charAt(i)!=str1.charAt(j)){
                    System.out.println("No!");
                    break;
                }
                if(i==0){
                    System.out.println("Yes!");
                }
            }
        }
    }
}
