import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[][] arn=new int[3][2];
        int[] arr=new int[]{1,2,3};
        func(arr);
        for(int x:arr){
            System.out.println(x);
        }
    }

    public static void func(int[] a) {
        a[0]=10;
        for (int x:a) {
            System.out.println(x);
        }
    }
    public static void main2(String[] args) {
        int i=1;
        System.out.println(i);
//        print(1234);
        print2(1234);
        System.out.println(sum(4));
    }
    public static int sum(int num){
        if(num==1){
            return 1;
        }
        return num+sum(num-1);
    }
    private static void print2(int i) {

        System.out.println(i%10);
        if(i>9){
            print2(i/10);
        }

    }
    private static void print(int i) {
        if(i>9){
            print(i/10);

        }
            System.out.println(i%10);

    }

    public static void main1(String[] args) {
        int a=10;
        int b=20;
        int ret=add(a,b);
        System.out.println(ret);

        double a1=10.5;
        double b2=20.5;

    }

    public static int add(int x,int y) {
        return x+y;
    }



    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list=new ArrayList<>();
        int a,b,c,max=Integer.MAX_VALUE;
        for (int i = 0; i <array.length ; i++) {
            for (int j = array.length-1; j >i ; j--) {
                if(array[i]+array[j]>sum){
                    continue;
                }else if(array[i]+array[j]<sum){
                    break;
                }else{
                    c=array[i]*array[j];
                    if(c<max){
                        list.clear();
                        list.add(array[i]);
                        list.add(array[j]);

                        max=c;
                    }
                }
            }
        }
        return list;
    }

}
