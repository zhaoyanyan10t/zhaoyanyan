#include<stdio.h>
#include<windows.h>
int N(int n)
{
	if (n < 10){
		printf("%d", n);
	}
	else{
		N(n / 10);
		printf("%d", n / 10);
	}
}
int main()
{
	N(12);
	system("pause");
	return 0;
}