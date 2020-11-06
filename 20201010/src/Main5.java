import java.util.ArrayList;

public class Main5 {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        int len=triangle.size();
        if(len==0){
            return 0;
        }
        int[][] arr=new int[len][len];
        arr[0][0]=triangle.get(0).get(0);
        for (int i = 1; i <len ; i++) {
            for (int j = 0; j <=i ; j++) {
                //对于第0列只能是+arr[i-1][0];
                if(j==0){
                    arr[i][j]=arr[i-1][j]+arr[i][j];
                }else if(i==j){
                    //对于最后一列
                    arr[i][j]=arr[i-1][j-1]+arr[i][j];
                }else{
                    arr[i][j]=Math.min(arr[i-1][j-1],arr[i-1][j])+arr[i][j];
                }
            }
        }
        int max=arr[len-1][0];
        for (int i = 0; i <len ; i++) {
            max=Math.max(max,arr[len-1][i]);
        }
        return max;
    }
}
