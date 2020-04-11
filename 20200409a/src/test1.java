import java.util.Arrays;
import java.util.Scanner;

import java.util.*;

import java.util.*;

class GrayCode {
    public String[] getGray(int n) {
        // write code here
        String[] str=null;
        if(n==1){
            str=new String []{"0","1"};
        }else{
            String[] str1=getGray(n-1);
            int t=str1.length;
            str=new String [2*t];
            for (int i = 0; i <str1.length; i++) {
                str[i]="0"+str1[i];
                str[str.length-1-i]="1"+str1[i];
            }

        }
        return str;
    }
}
public class test1 {
    public static void main(String[] args) {
        int[] num={1,2,3,4};
        String str=Arrays.toString(num);
        System.out.println(str);
    }
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int[] num=new int[str.length()-1];
        for (int i = 0; i <num.length ; i++) {
            num[i]=Integer.valueOf(str.charAt(i))-'0';
        }
        int k=Integer.valueOf(str.charAt(num.length))-'0';
        Arrays.sort(num);
        for (int i = 0; i <k ; i++) {
            System.out.println(num[i]);
        }
    }
}
