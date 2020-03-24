public class test {
	public static void main(String[] args){
		int a = 10;   
		int b = 20;   
		print(a, b);  
		} 
 
	public static void print(int x, int y) {   
		System.out.println("x = " + x + " y = " + y);  
		}  
	public static void main7(String[] args){
		int i;
		float c,sum1=0,sum2=0,sum;
		for(i=1;i<=100;i+=2)
		{
			c=(float)1/i;
			sum1=sum1+c;
		}
		for(i=2;i<=100;i+=2)
		{
			c=(float)1/i;
			sum2=sum2+c;
		}
		sum=sum1-sum2;
		System.out.println(sum);
	}
	public static void main6(String[] args){
		int i=18,j=20,c;
		while(i%j!=0)
		{
			c=i%j;
			i=j;
			j=c;
		}
		System.out.println(j);
	}
	public static void main5(String[] args){
		int i,j,ret;
		for(i=1;i<=9;i++)
		{
			for(j=1;j<=i;j++)
			{
				ret=i*j;
				System.out.printf("%d*%d=%d ",j,i,ret);
			}
			System.out.println();
		}
	}
	public static void main4(String[] args){
	    int i;
		for(i=1000;i<=2000;i++)
		{
			if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
			{
			System.out.println(i);
			}
		}
	}
	
	public static void main2(String[] args){
		int i=18,j;
		for(j=2;j<i;j++)
		{
			if(i%j==0)
			{
				System.out.printf("%d不是素数",i);
				break;
			}
		}
		if(j==i)
		{
			System.out.printf("%d是素数",i);
		}
	}
	public static void main3(String[] args){
		int i,j;
		for(i=1;i<=100;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					break;
				}
			}
			if(j==i)
			{
				System.out.println(i);
			}
		}
	}
	public static void main1(String[] args){
		int age=87;
		if(age<=18)
		{
			
		}
		else if(age>=19&&age<=28)
		{
			System.out.println("青年");
		}
		else if(age>=29&&age<=55)
		{
			System.out.println("中年");
		}
		else if(age>=56)
		{
			System.out.println("老年");
		}
	}
}