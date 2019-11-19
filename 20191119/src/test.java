import java.util.Scanner;

public class test {
    public static int game(int[] guess, int[] answer) {
        int count = 0;
        for (int j = 0; j < 3; j++) {
            if (guess[j] == answer[j]) {
                count++;
            }
        }
        System.out.println(count);
        return 0;
    }
    public static void main(String[] args) {
        int[] g=new int[3];
        int[] a=new int[3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            g[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++){
            a[i]=sc.nextInt();
        }

        game(g,a);


    }
}

//class Solution {
//    public int game(int[] guess, int[] answer) {
//        int count=0;
//        for(int j=0;j<3;j++){
//            if(guess[j]==answer[j]){
//                count++;
//            }
//        }
//
//        return count;
//    }
//}
//public class test {
//
//
//    public static void main(String[] args) {
//        int[] g=new int[3];
//        int[] a=new int[3];
//        Scanner sc=new Scanner(System.in);
//        for(int i=0;i<3;i++){
//           g[i]=sc.nextInt();
//        }
//        for(int i=0;i<3;i++){
//            a[i]=sc.nextInt();
//        }
//        Solution w=new Solution();
//        int t=w.game(g,a);
//        System.out.println(t);
//
//    }
//}
