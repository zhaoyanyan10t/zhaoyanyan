#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<windows.h>
int dig(int n)
{
	if (n <10)
	{
		printf("%d", n);
	}
	else{
		printf("%d", dig(n/10)+(n%10));
	}
}
int main()
{
	dig(233);
	system("pause");
	return 0;
}