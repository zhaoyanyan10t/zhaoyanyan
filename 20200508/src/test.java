public class test {
    private static int count;
     private  abstract class d{

    };
    public String name="abc";
    public static void main(String[] args) {
        test test=new test();
        test testB=new test();
        System.out.println(test);
        System.out.println(testB);
        System.out.println(test.equals(testB)+","+test.name.equals(testB.name));

    }
//        test test=new test(88);
//        System.out.println(count);
//    }
//    test(int a)
//        {
//            count=a;
//        }
    public static void main1(String[] args) {
        Integer i1=59;
        int i2=59;
        Integer i3=Integer.valueOf(59);
        Integer i4=new Integer(59);
        System.out.println(i1==i2);
        System.out.println(i1==i3);
        System.out.println(i1==i4);
        System.out.println(i3==i4);
        System.out.println(i4==i2);
    }
}
