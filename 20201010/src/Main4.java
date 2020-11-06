import java.util.Scanner;
import java.util.Set;

public class Main4 {
    public boolean wordBreak(String s, Set<String> dict) {
        boolean[] arr=new boolean[s.length()];//初始化为false；
        for(int i=0;i<s.length();i++){
            //首先看整体是否可以在词典中找到
            if(dict.contains(s.substring(0,i+1))){
                arr[i]=true;
                continue;
            }
            for(int j=i-1;j>=0;j--){
                if(arr[j]&&dict.contains(s.substring(j+1,i-j))){
                    arr[i]=true;
                    break;
                }
            }
        }
        return arr[s.length()-1];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(" ");
        int[] arr=new int[s.length];
        for (int i = 0; i <s.length; i++) {
            arr[i]=Integer.parseInt(s[i]);
        }
//     int[] arr={6,-3,-2,7};

//     int a=arr[0];
     int re=arr[0];
     int max=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            int tmp=re;

            re=Math.max(re+arr[i],arr[i]);
            if(max<re){
                max=re;
            }
        }
        System.out.println(max);
    }
}
