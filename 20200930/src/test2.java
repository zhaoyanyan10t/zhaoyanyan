public class test2 {
    public static void main(String[] args) {
        int i=130;
        int j=130;
        Integer x=130;
        Integer y=new Integer(130);
        Integer z=new Integer(130);
        int t=28;
        Integer r=28;
        Integer tt=new Integer(28);
        System.out.println(i==j);
        System.out.println(i==x);
        System.out.println(i==y);
        System.out.println(x==y);
        System.out.println(z==y);
        System.out.println(z==x);
        System.out.println(t==tt);
        System.out.println(r==tt);

    }
}
