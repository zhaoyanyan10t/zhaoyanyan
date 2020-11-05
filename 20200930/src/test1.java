import java.util.Random;

public class test1 {
    public int[] getTenGeneral(){
        int[] num=new int[10];
        Random ran =new Random();
        for (int i = 0; i <num.length ; i++) {
            num[i]=ran.nextInt(5);//生成10个1到5的数字，不包括5；
        }
        return num;
    }
    public double Count(int[] num){
        int sum=0;
        for (int i = 0; i <num.length; i++) {
            if(3==num[i]){
                sum++;
            }
        }
        double result=sum*0.1;
        return result;
    }
    public static void main(String[] args) {
        Random ran =new Random();
        double n=ran.nextDouble();
        double m=ran.nextDouble();
        System.out.println(n);
        System.out.println(m);
    }
}
