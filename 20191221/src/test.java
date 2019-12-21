import java.util.Scanner;

class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        for (int i = 0; i <numbers.length ; i++) {
            for (int j =i+1; j <numbers.length ; j++) {
                if(numbers[i]==numbers[j]){
                    duplication[0]=numbers[i];
                    System.out.println(duplication[0]);
                    return true;
                }
            }
        }
        return false;
    }
}

public class test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < str.length(); i++) {
                char tmp = str.charAt(i);
                if (!sb.toString().contains(tmp + "")) {
                    sb.append(tmp);
                }
            }
            System.out.println(sb.toString());
        }

    }
}
//class Solution {
//    public int Sum_Solution(int n) {
//        if(n==1){
//            return 1;
//        }
//        return n+Sum_Solution(n-1);
//    }
//}
//class Solution {
//    public String ReverseSentence(String str) {
//        String[] result=str.split(" ");
//        StringBuffer sb=new StringBuffer();
//        for (int i = result.length-1; i>=0 ; i--) {
//            sb.append(result[i]+" ");
//        }
////        System.out.println(str);
//
//     return sb.toString();
//    }
//}
//public class test{
//    public static void main(String[] args) {
//        int[] numbers={1,2,3,4,5,6};
//        int[] duplicate=new int[1];
//        Solution e=new Solution();
//        System.out.println(e.duplicate(numbers,6,duplicate));






//        int n=3;
//        Solution e=new Solution();
//        System.out.println(e.Sum_Solution(n));
//        String str=" ";
//       Solution e=new Solution();
//        System.out.println(e.ReverseSentence(str));
//    }
//}
//public class test {
//    public static void main(String[] args) {
//        String str="student a am I";
//        String[] result=str.split(" ");
//        int right=result.length-1;
//        int left=0;
//        while(left<=right){
//            String s=result[left];
//            result[left]=result[right];
//            result[right]=s;
//            left++;
//            right--;
//        }
//        for (String s:result) {
//            System.out.print(s+" ");
//        }
//    }
//
//}
