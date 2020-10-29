import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s1=sc.next();
        String s2=sc.next();
        int count=judge(s1,s2);
        System.out.println(count);
    }
    public static int judge(String s1,String s2){
        String str1="2"+s1;
        String str2="1"+s2;
        int[][] num=new int[s1.length()+1][s2.length()+1];
        for (int i = 0; i <str1.length() ; i++) {
            for (int j = 0; j <str2.length() ; j++) {
                if(i==0||j==0){
                    num[i][j]=0;
                }else if(str1.charAt(i)==str2.charAt(j)){
                    num[i][j]=(num[i-1][j-1]+1);
                }else{
                    if(num[i-1][j]>num[i][j-1]){
                        num[i][j]=num[i-1][j];
                    }else{
                        num[i][j]=num[i][j-1];
                    }
                }
            }

        }
        return num[str1.length()-1][str2.length()-1];
    }
}
