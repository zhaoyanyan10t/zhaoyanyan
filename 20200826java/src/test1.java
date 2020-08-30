public class test1 {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("e ee");
        String s1=str.toString();
        String s2=s1.replaceAll(" ","%20");
        System.out.println(s2);
        String s3=new String("222");
        String s4=new String("222");
        String s5="222";
        String s6=new String("222");



        System.out.println(s3==s4);
        System.out.println(s3==s5);
        System.out.println(s5==s6);
    }
}
