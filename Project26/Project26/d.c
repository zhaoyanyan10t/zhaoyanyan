#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<windows.h>

int main()
{
	int i = 10;
     printf("%d\n",~i);
	system("pause");
	return 0;
}
//int main()
//{
//	int i, count = 0;
//	for (i = 1; i <= 100; i++)
//	{
//		if (i % 10 == 9 || i / 10 == 9)
//		{
//			count++;
//		}
//	}
//	printf("%d\n", count);
//	system("pause");
//	return 0;
//}
//int main()
//{
//	int a, b;
//	double sum1 = 0, sum2 = 0,sum;
//	for (a = 1; a <= 99; a +=2)
//	{
//		sum1 = sum1 + (double) 1 / a;
//	}
//	for (b = 2; b <= 100; b += 2)
//	{
//		sum2 = sum2 + (double)1 / b;
//	}
//	sum = sum1 - sum2;
//	printf("%f\n",sum);
//	system("pause");
//	return 0;
//}
//int main()
//{
//	int a[] = { 1, 2, 3, 4, 5 };
//	int b[] = { 6, 7, 8, 9 ,10};
//	int c,i;
//	for (i = 0; i < 5; i++)
//	{
//      c = a[i];
//	  a[i] = b[i];
//	  b[i] = c;
//	}
//	for (i = 0; i < 5; i++)
//	{
//		printf("%d ", a[i]);
//	}
//	printf("\n");
//
//	for (i = 0; i < 5; i++)
//	{
//		printf("%d ", b[i]);
//	}
//	system("pause");
//	return 0;
//}