class MyValue{
    public int num;
}
public class testdemo1 {
    public static void swap(MyValue myvalue1,MyValue myvalue2) {
        int tmp=myvalue1.num;
        myvalue1.num=myvalue2.num;
        myvalue2.num=tmp;
    }
    public static void main(String[] args) {
        MyValue myvalue1=new MyValue();
        myvalue1.num=10;
        MyValue myvalue2=new MyValue();
        myvalue2.num=0;
        System.out.println(myvalue1.num+" "+myvalue2.num);
        swap(myvalue1,myvalue2);
        System.out.println(myvalue1.num+" "+myvalue2.num);
    }
}
