#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<windows.h>
int F(int n)
{
	if (n >9)
	{
		F(n / 10);
	}
	printf("%d\n",(n % 10));
}
int main()
{
	F(2345);
	system("pause");
	return 0;
}