#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
//int main()
//{
//	int a, x;
//	for (a = 0, x = 0; a <= 1 && !x++; a++)
//	{
//		a++;
//	}
//	printf("%d %d", a, x);
//	system("pause");
//	return 0;
//}
//void Func1(int num)
//{
//	int i = 0;
//	for (i = 1; i <=31; i += 2)
//	{
//		printf("%d", (num >> i) & 1); //偶数位
//	}
//	printf("\n");
//	for (i = 0; i <=31; i += 2)
//	{
//		printf("%d", (num >> i) & 1);//奇数位
//	}
//}
//int main()
//{
//	Func1(10);
//	//0000 1010
//	system("pause");
//	return 0;
//}

int f(int *arr, int len)
{
	int left = 0, right = len - 1;
	while (left < right)
	{
		while (arr[left] % 2 != 0)
		{
			left++;
		}
		while (arr[right] % 2 == 0)
		{
			right--;
		}
		if (left < right)
		{
			int tmp = arr[right];
			arr[right] = arr[left];
			arr[left] = tmp;
			
	    }
	}
	
}
int main()
{
	int arr[] = { 1, 23, 4, 5, 6, 7, 8 };
	int len = sizeof(arr) / sizeof(arr[0]);
	f(arr, len);
	system("pause");
	return 0;
}
//int fib(int N)
//{
//	if (N==0)
//	{
//		return 0;
//	}
//	if ( N== 1)
//	{
//		return 1;
//	}
//	if (N > 1)
//	{
//		return fib(N - 1) + fib(N - 2);
//	}
//}
//int main()
//{
//	int i;
//	printf("请输入求得第几个数：");
//	scanf("%d", &i);
//	printf("%d\n", fib(i));
//	system("pause");
//	return 0;
//}