public class test{
    private int x,y;//x，y作为待交换的变量，将其变为某个类的成员变量
    void change(test a) {
        int temp;//作为交换的中介
        temp=a.x;
        a.x=a.y;
        a.y=temp;
    }
    public static void main(String[] args) {
        test a=new test();
        a.x=1;
        a.y=2;
        System.out.println("交换前x="+a.x+"y="+a.y);
        a.change(a);
        System.out.println("交换后x="+a.x+"y="+a.y);
    }
}

//class Calculator{
//    private double num1;
//    private double num2;
//    public double add(double num1,double num2) {
//        this.num1 = num1;
//        this.num2 = num2;
//        return this.num1+this.num2;
//    }
//    public double sub(double num1,double num2) {
//        this.num1 = num1;
//        this.num2 = num2;
//        return this.num1-this.num2;
//    }
//    public double mul(double num1,double num2) {
//        this.num1 = num1;
//        this.num2 = num2;
//        return this.num1*this.num2;
//    }
//    public double div(double num1,double num2) {
//        this.num1 = num1;
//        this.num2 = num2;
//        return this.num1/this.num2;
//    }
//    public int num;
//}
//public class test {
//
//    public static void swap(Calculator myvalue,Calculator myvalue1) {
//        int tmp=myvalue.num;
//        myvalue.num=myvalue1.num;
//        myvalue1.num=tmp;
//    }
//    public static void main(String[] args) {
//            Calculator myvalue=new Calculator();
//            myvalue.num=10;
//            Calculator myvalue1=new Calculator();
//            myvalue1.num=2;
//        swap(myvalue,myvalue1);
//        System.out.println(myvalue.num+" "+ myvalue1.num);
//
//        }
//    public static void main1(String[] args) {
//        Calculator calculator = new Calculator( );
//        System.out.println(calculator.add(2.0,3.0));
//        System.out.println(calculator.sub(2.0,3.0));
//        System.out.println(calculator.mul(2.0,3.0));
//        System.out.println(calculator.div(2.0,3.0));
//    }
//}