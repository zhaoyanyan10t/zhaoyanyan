import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int n1=nums1.length;
        int n2=nums2.length;
        List<List<Integer>> list=new ArrayList<>();
        if(n1<1||n2<1||k<1){
            return list;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[][] arr=new int[n1*n2][2];
        int index=0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                arr[index][0]=nums1[i];
                arr[index][1]=nums2[j];
                index++;
            }
        }
        for (int i = 0; i <k ; i++) {
            List<Integer> list1=new ArrayList<>();
            list1.add(arr[i][0]);
            list1.add(arr[i][1]);
            list.add(list1);
        }
        return list;
    }
}
public class test {
    public static void main(String[] args) {
        for (int i = 0,j=0; i <10&&j>100 ; i++,j++) {
            i=j+10;
        }
    }
}
