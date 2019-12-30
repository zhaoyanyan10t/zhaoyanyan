#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main()
{
	int a = 10,b=20;
	int c = (a > b, a = b + 11, a, b = a + 1);
	printf("%d\n",c);
	system("pause");
	return 0;
}