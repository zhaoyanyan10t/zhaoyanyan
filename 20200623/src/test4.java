import java.util.Scanner;

import static java.lang.Math.random;

public class test4 {

    public static int mm(int a,int b,int mod){
        int ans=0;
        while(b!=0)	{
            if((b&1)!=0) ans=(ans+a)%mod;
            a=(a+a)%mod;
            b>>=1;
        }
        return ans;
    }
    //快速幂取模
     public static int f(int x,int n,int mod){
         int ans=1;
        while(n!=0)	{
            if((n&1)!=0) ans=mm(ans,x,mod);
            x=mm(x,x,mod);
            n>>=1;
        }
        return ans;
    }
    public static boolean miller_rabin(int n){
        if(n==2)
            return true;
        else if(n==1||n%2==0)
            return false;
        int u=n-1,t=0;
        while(u%2==0)
            u/=2;
        t++;
        //n-1=u*2^t
         for(int i=0;i<10;i++)	{
             //随机选取一个底数a
              int a=(int)random()%(n-1)+1;
              //计算(a^(n-1))%n=(a^(u*2^t))%n
              	int x=f(a,u,n);
              	//先计算(a^u)%n
              for(int j=1;j<=t;j++){
                  //再经过t次循环计算得到 ( (a^u)^(2^t) )%n
                   		int y=mm(x,x,n);
                   		if(y==1&&x!=1&&x!=n-1)//如果不满足二次探测定理，则不是素数
                   		     return false;
                   		x=y;
              }
              if(x!=1) return false;//如果不满足费马小定理，则不是素数
              } 	 return true;//是素数
         }

    public static void main(String[] args) {
        int t;
        int  n;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t--!=0)	{
            n=sc.nextInt();
            System.out.printf("%s\n",miller_rabin(n)?"Yes":"No");
        }
    }
}
