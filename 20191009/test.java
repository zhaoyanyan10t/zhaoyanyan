public class test {
	public static void main(String[] args){
		int a=10;
		int b=20;
		int c=30;
		int max=(((a>b)?a:b)>c)?((a>b)?a:b):c;
		int min=(((a<b)?a:b)<c)?((a<b)?a:b):c;
		System.out.println("max="+max);
		System.out.println("min="+min);
	}
	public static void main2(String[] args){
		int a=10;
		int b=20;
		int tmp;
		tmp=a;
		a=b;
		b=tmp;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}