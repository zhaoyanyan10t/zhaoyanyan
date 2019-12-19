import static java.lang.Math.pow;
class Solution {
    public int JumpFloor(int target) {
      return (int) pow(2,target-1);
    }
}
public class test{
    public static int NumberOf1(int n) {
        int count=0;
        for(int i=0;i<32;i++){
            if(((n>>i)&1)==1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(NumberOf1(5));
//        Solution e=new Solution();
//        System.out.println(e.JumpFloor(3));
    }
}

//class Solution {
//    public int Fibonacci(int n) {
//        if(n==0){
//            return 0;
//        }
//        if (n == 1) {
//            return 1;
//        } else {
//            return Fibonacci(n - 1) + Fibonacci(n - 2);
//        }
//
////        int a=0;
////        int b=1;
////        int c=0;
////        if(n==1){
////            return 1;
////        }
////        while(n>1){
////            c=a+b;
////            a=b;
////            b=c;
////            n--;
////        }
////        return c;
//    }
//}
//public class test {
////    public static int Fibonacci(int n) {
////        if(n==0){
////            return 0;
////        }
////        if (n == 1) {
////            return 1;
////        } else {
////            return Fibonacci(n - 1) + Fibonacci(n - 2);
////        }
////    }
////        public static void main(String[] args) {
////            int s=5;
////            System.out.println(Fibonacci(s));
////        }
//    public static void main(String[] args) {
//        int s=5;
//        Solution e=new Solution();
//        System.out.println(e.Fibonacci(s));
//    }
//}
