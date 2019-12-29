import java.util.ArrayList;
import java.util.Arrays;

//class Solution {
//    public int MoreThanHalfNum_Solution(int [] array) {
//        if(array.length<1){
//            return 0;
//        }
//        for (int i = 0; i <array.length ; i++) {
//            int count=0;
//            for (int j = 0; j <array.length ; j++) {
//                if(array[i]==array[j]){
//                    count++;
//                }
//            }
//            if(count>(array.length/2)){
//                return array[i];
//            }
//        }
//        return 0;
//    }
//}
class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> a=new ArrayList<>();
        if(input.length<k){
            return a;
        }
        Arrays.sort(input);
        for (int i = 0; i <k ; i++) {
            a.add(input[i]);
        }
        return a;
    }
}

public class test {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,6,99,43,66};
        int k=8;
        Solution e=new Solution();
        System.out.println(e.GetLeastNumbers_Solution(arr,k));
//        int[] arr={1,2,3,2,4,2,5,2};
//        Solution s=new Solution();
//        System.out.println(s.MoreThanHalfNum_Solution(arr));
//        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
//        char[] data=str.toCharArray();
//        permutation(data);
    }
//    public static void permutation(char[] chars){
//        if(chars==null||chars.length<1){
//            return;
//        }
//        //进行排列操作
//        permutation(chars,0);
//    }
//    public static void permutation(char[] chars,int begin){
//        //最后一个元素，输出排列结果
//        if(chars.length-1==begin){
//            System.out.print(new String(chars)+"");
//        }else{
//            char tmp;
//            //每个元素作为当前处理位置的元素
//            for (int i = begin; i <chars.length ; i++) {
//                tmp=chars[begin];
//                chars[begin]=chars[i];
//            chars[i]=tmp;
//            //处理下一个位置
//            permutation(chars,begin+1);
//            }
//        }
//    }
}

