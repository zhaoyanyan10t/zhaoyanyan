import java.util.concurrent.atomic.AtomicBoolean;

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String str=""+x;
        int[] arr=new int[str.length()];
        for (int i = 0; i <str.length(); i++) {
            arr[i]=Integer.parseInt(String .valueOf(str.charAt(i)));
        }
        for (int i = 0; i <arr.length ; i++) {
            int j=arr.length;
            if(arr[i]!=arr[j-1-i]){
                return false;
            }
        }
        return true;
    }
}
public class test {
    public static void main(String[] args) {
        Solution e=new Solution();
        System.out.println(e.isPalindrome(1211));


//        int sum=0;
//        int[] tmp={1,2,3};
//        for(int j=0;j<tmp.length;j++){
//            sum=sum*10+tmp[j];
//        }
//        System.out.println(sum);
//        int num=123;
//        String str = String.valueOf(num);//num为需要转化的整数
//         int[] tmp1 = new int[str.length()];
//         for(int i=0;i<str.length();i++){
////             str.charAt(i)//是char类型
//              tmp1[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
//         }
//        for (int i = 0; i <tmp1.length ; i++) {
//            System.out.print(tmp1[i]+" ");
//        }
//        String str4="123";
//        String str5="123";
//        System.out.println(str4==str5);
//
//
//        int i=123;
//        String str=Integer.toString(i);
//        System.out.println(str);
//        String str1="121";
//        String str2="11";
//        String s=String.valueOf(i);
//        System.out.println(str=="121");
//        if(s!=str1) {
//            System.out.println("1+");
//        }

//        int i = 7;
//        do {
//            System.out.println(--i);
//            --i;
//        } while (i != 0);
//        System.out.println(i);
    }
}
