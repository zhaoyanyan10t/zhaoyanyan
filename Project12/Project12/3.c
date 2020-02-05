#define _CRT_SECURE_NO_WARNINGS 
#include<stdio.h>
#include<Windows.h>
void show(int arr[], int len)
{
	int i = 0;
	for (i = 0; i < len; i++)
	{
		printf("%d",arr[i]);
	}
	printf("%d\n,len");
}
int main()
{
	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	int len = sizeof(arr) / sizeof(arr[0]);
	show(arr[10], len);
	system("pause");
}