import java.util.Scanner;
class Solution{
    public boolean Find(int target, int [][] array) {
        int r=0,c=array[0].length-1;
        while(r<array[0].length&&c>=0) {
            if(target<array[r][c]){
                c--;
            }
            else if(target>array[r][c]){
                r++;
            }
          else{
                return true;
            }
        }
        return false;
    }
}
public class test {
    public static void main(String[] args) {
        int[][] arr={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        Scanner sc=new Scanner(System.in);
        int find=sc.nextInt();
        Solution s=new Solution();
        System.out.println(s.Find(find,arr));

    }
}
