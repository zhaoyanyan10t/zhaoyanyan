import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
//        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        if(sum<3)return list;
//        int start = 0;
//        int end = array.length-1;
//        while(start < end){
//            if(array[start]+ array[end] == sum){
//                list.add(array[start]);
//                list.add(array[end]);
//                result.add(new ArrayList<Integer>(list));
//                end--;
//            }
//            else if(array[start]+ array[end] > sum){
//                end--;
//            }else {
//                start ++;
//            }
//        }
//        if(result.size() == 0)return list;
//        else if(result.size() == 1){
//            return result.get(0);
//        }
//        else {
//            list.clear();
//            int length = result.size() - 1;
//            list = result.get(0);
//            int mul = list.get(0) * list.get(1);
//            for (int i = 1; i <= length; i++) {
//                int tmp = result.get(i).get(0) * result.get(i).get(1);
//                if (tmp < mul) {
//                    list.clear();
//                    list = result.get(i);
//                    mul = tmp;
//                }
//            }
//            return list;
//        }


        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();

        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if((array[i]+array[j])==sum){
                    list.add(array[i]);
                    list.add(array[j]);
                    result.add(new ArrayList<Integer>(list));
                    break;
                }
            }
//if(!list.isEmpty())
//            result.add(new ArrayList<Integer>(list));
        }
        if(result.size()==0){
            return list;
        }else if(result.size()==1){
            return result.get(0);
        }else{
            list.clear();
            int length = result.size() - 1;
            list = result.get(0);
            int min = list.get(0)*list.get(1);

            for(int i=1;i<=length;i++){
                int tmp = result.get(i).get(0)*result.get(i).get(1);
                if(tmp<min){
                    list.clear();
                    list=result.get(i);
                    min = tmp;
                }
            }
            return list;
        }
    }
}
//class Solution {
//    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
//        ArrayList<ArrayList<Integer>> e=new ArrayList<>();
//        for (int i = 1; i <=sum/2 ; i++) {
//            ArrayList<Integer> list=new ArrayList<>();
//            int count=0;
//            for (int j = i; j <sum; j++) {
//                count+=j;
//                list.add(j);
//                if(count>sum){
//                    break;
//                }else if(count==sum){
//                    e.add(list);
//                    break;
//                }
//            }
//        }
//        return e;
//    }
//}
//class Solution {
//    public int InversePairs(int [] array) {
//        int count=0;
//        for (int i = 0; i <array.length ; i++) {
//            for (int j = i; j <array.length ; j++) {
//                if(array[i]>array[j]){
//                    count++;
//                }
//            }
//        }
//        return count%1000000007;
//    }
//}
public class test {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int sum=21;
        Solution r=new Solution();
        System.out.println(r.FindNumbersWithSum(arr,sum));


//        Solution r=new Solution();
//        System.out.println(r.FindContinuousSequence(3));
//       int[] arr={1,2,3,4,5,6,7,0};
//       Solution e=new Solution();
//       int r=e.InversePairs(arr);
//        System.out.println(r);
//        System.out.println(r%100000007);
    }
}
