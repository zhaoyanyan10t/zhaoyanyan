package code1;

import java.util.SortedMap;

class MaxGap {
    public int judge(int left,int mid,int right,int[] A){
        int max1=A[left];
        for (int i = 0; i <= mid; i++) {

            if(A[i]>max1)
                max1=A[i];
        }
        int max2=A[mid+1];
        for (int i = mid+1; i <right; i++) {
            if(A[i]>max2)
                max2=A[i];
        }
        int max=Math.abs(max1-max2);
        return max;
    }
    public int findMaxGap(int[] A, int n) {
        // write code here
        int MAX=0;
        for (int k = 0; k <=n-2 ; k++) {
            int m=judge(0,k,n,A);
            if(m>MAX){
                MAX=m;
            }
        }
        return MAX;

    }
}
class Printer {
    public int[] clockwisePrint(int[][] mat, int n, int m) {
        // write code here
        int[] arr=new int[n*m];
        int k=0;
        int i=0;//i行
        int j=0;//j列
        int Sx=0;//代表横轴开始位置（代表第0列
        int Ex=m-1;//代表最后一列
        int Sy=0;//代表第0行
        int Ey=n-1;//第最后一行
        while(Sx<=Ex&&Sy<=Ey){
            //判断是不是最后一行
            if(Sy==Ey){
                for(;j<=Ex;j++)
                 arr[k++]=mat[Sy][j];
                return arr;
            }
            //判断是不是最后一列
            if(Sx==Ex){
                for(;i<=Ey;i++)
                    arr[k++]=mat[i][Sx];
                return arr;
            }

            //从左到右，行不变，列++
            for(;j<Ex;j++){
                arr[k++]=mat[i][j];
            }//走完循环，i=0,j=m-1;

            //从上到下，列不变，行++
            for(;i<Ey;i++){
                arr[k++]=mat[i][j];
            }//走完循环，i=n-1,j=m-1;

            //从右到左，行不变，列--
            for(;j>Sx;j--){
                arr[k++]=mat[i][j];
            }//走完循环，i=n-1,m=0

            //从下到上，列不变，行--
            for(;i>Sy;i--){
                arr[k++]=mat[i][j];
            }//走完循环，i=0,j=0;
            i++;
            j++;
            Sx++;
            Ex--;
            Sy++;
            Ey--;
        }
        return arr;
    }
}
public class Main {
    public static void main(String[] args) {
        MaxGap e=new MaxGap();
        int[] A={2,7,3,1,1};
        System.out.println(e.findMaxGap(A,5));
    }
}
