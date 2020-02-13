#include<stdio.h>
#include<windows.h>
void N(int n)
{
	if (n < 10){
		printf("%d", n / 10);
	}
	
		 N(n / 10);
		
}
int main()
{
	int n = 123;
	N(n);
	system("pause");
	return 0;
}