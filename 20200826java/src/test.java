import java.util.*;

public class test {

    public static void main(String[] args) {
        String str1="";
        String str2="12345ef";
        System.out.println(LCS(str1,str2));

    }
    public static String LCS (String str1, String str2) {
        // write code here
        if(str1.length()<=0||str2.length()<=0){
            return "-1";
        }
        int len1=str1.length();
        int len2=str2.length();
        int max=0;
        int start=0;
        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                int a=i;
                int b=j;
                int len=0;
                while(i<len1&&j<len2&&str1.charAt(a)==str2.charAt(b)){
                    len++;
                    a++;
                    b++;

                }
                if(max<len){
                    max=len;
                    start=i;
                }

            }
        }
        return str1.substring(start,start+max);
    }
}