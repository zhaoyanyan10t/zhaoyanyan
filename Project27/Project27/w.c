#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<windows.h>
int Max(int a, int b)
{
	return a > b ? a : b;
}
int main()
{
	int a= 10;
	int b = 2;
	Max(10, 2);
	printf("%d\n",Max(10,2));
	system("pause");
	return 0;
}