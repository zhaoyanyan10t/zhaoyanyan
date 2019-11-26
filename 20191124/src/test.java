import java.util.Scanner;

class Solution {
    public String toLowerCase(String str) {
        String r="";
        for (int i = 0; i <str.length() ; i++) {
            char c=str.charAt(i);
            if(c>='A'&&c<='Z'){
                c+=32;
            }
//            if(c>=65&&c<=90){
//                c+=32;
//            }
            r+=c;
        }
        return r;
    }
}
public class test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入字母：");
        String s=sc.nextLine();
        Solution solution=new Solution();

        System.out.println(solution.toLowerCase(s));
    }
}

//import java.util.Scanner;
//
//class Solution {
//    public int minTimeToVisitAllPoints(int[][] points) {
//        int res = 0;
//        for (int i = 1; i < points.length; i++) {
//            // 横坐标距离之差
//            int dx = Math.abs(points[i][0] - points[i - 1][0]);
//            // 纵坐标距离之差
//            int dy = Math.abs(points[i][1] - points[i - 1][1]);
//            // 切比雪夫距离累加即可
//            res += Math.max(dx, dy);
//        }
//        return res;
//    }
//}
//public class test {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int[][] arrr;
//        System.out.println("points=");
//        for (int i = 0; i < arrr.length(); i++) {
//
//        }
//    }
//}
