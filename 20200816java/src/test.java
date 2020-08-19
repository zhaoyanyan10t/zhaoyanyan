public class test {
        public static boolean Find(int target, int [][] array) {
            if(array.length<0){
                return false;
            }
            int row=array.length-1;
            int col=0;
            while(row>=0&&col<=array.length-1){
                if(array[row][col]==target){
                    return true;
                }else if(array[row][col]>target){
                    row--;
                }else{
                    col++;
                }
            }
            return false;
        }

    public static void main(String[] args) {
            int[][] arr={};
        System.out.println(Find(16,arr));
    }
}
