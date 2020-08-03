public class Main {
    public static void main(String[] args) {
        String str1="hello";
        String str2=str1;
        System.out.println(str1);
        System.out.println(str2);
        str1="www";
        System.out.println(str1);
        System.out.println(str2);
        for (int i = 0; i <1 ; i++) {
            str1+=i;
        }
        System.out.println(str1);
    }
}
