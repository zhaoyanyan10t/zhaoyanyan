public class Main {
    public  static int judge(int[][] arr,int re){
        int r=arr.length-1;//行
        int c=0;//列
        while(r>=0&&c<arr[0].length){
                if(re==arr[r][c]){
                    return  re;
                }else if(re>arr[r][c]){
                    c++;
                }else{
                    r--;
                }

        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
