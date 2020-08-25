import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.next();
        }
        int count=0;
        for (int i = 0; i <n ; i++) {
            String str=arr[i];
            if(str.length()<10&&judge(str)){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean judge(String str){
        for (int j = 0; j <str.length() ; j++) {
            char ch=str.charAt(j);
            if(ch<'A'||(ch>'Z'&&ch<'a')||ch>'z'){
                return false;
            }
        }
        return true;
    }
}
