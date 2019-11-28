import java.util.Arrays;
import java.util.Scanner;
class Solution {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i <A.length ; i++) {
//            A[i]=(int)Math.pow(A[i],2);
            A[i]*=A[i];
        }
//冒泡排序
//        for (int i = 0; i <A.length ; i++) {
//            for (int j = 0; j < A.length-1; j++) {
//                if(A[j]>A[j+1]){
//                    int tmp=A[j];
//                    A[j]=A[j+1];
//                    A[j+1]=tmp;
//                }
//            }
//        }
        Arrays.sort(A);
        for (int i = 0; i <A.length ; i++) {
            System.out.print(A[i]+" ");
        }

        return A;
    }
}
public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for (int i = 0; i <arr.length ; i++) {
             arr[i]=sc.nextInt();
        }
//        for (int j = 0; j <arr.length ; j++) {
//            System.out.print(arr[j]+" ");
//        }
        Solution solution=new Solution();
        solution.sortedSquares(arr);
//        String str = "1a233";
//        System.out.println(fun(str));
//    }
//    public static boolean fun(String str){
//        for (int i = 0; i <str.length() ; i++) {
//            if(str.charAt(i)<'0'||str.charAt(i)>'9'){
//                return false;
//            }
//        }
//        return true;

// 将字符串变为字符数组
// char[] data = str.toCharArray() ;
// for (int i = 0; i < data.length; i++) {
//     System.out.print(data[i]+" ");
// }

// 字符数组转为字符串
// System.out.println(new String(data));
 // 全部转换
//         System.out.println(new String(data,5,5));
         // 部分转换

// char[] array={'a','b','c','d','e','f'};
//        String str=new String(array);
//        System.out.println(str);
//        String str2=new String(array,1,2);
//        System.out.println(str2);
//        System.out.println(str);

//        String str=new String("abcdef");
//        String str4="abc"+"def";
//        String str5="abc"+new String("def");
//        String str6="abc";
//        String str7="def";
//        String str8=str6+str7;
//        String str9=null;
//
//        char[] array={'a','b','c'};
//        String str11=new String(array).intern();
//        String str10="abc";
//        String str12="abcdef";
//        str12="h"+str12.substring(2);
//        System.out.println(str==str4);
//        System.out.println(str==str5);
//        System.out.println(str==str8);
//        System.out.println(str8.equals(str9));
//        System.out.println("=============");
//        System.out.println(str10==str11);
//        System.out.println("=============");
//        System.out.println(str12);
    }
}
