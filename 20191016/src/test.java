public class test {
    public static int f(int n){
        int a=1;
        int b=2;
        int c=1;
        int i;
        if(n==1){
            c=1;
        }
        if(n==2){
            c=2;
        }
       for(i=3;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
//            return f(n-1)+f(n-2);
        }
        return c;
    }
    public static void main(String[] args){
        System.out.println(f(4));
    }

}
