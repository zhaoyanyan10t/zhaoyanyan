#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<windows.h>
int fib(int n)
{
	int c, a = 1, b = 2;
	if (n ==1)
	{
		return 1;
	}
	if (n==2)
	{
		return 2;
	}
	while (n>2)
	{
		c = a + b;
		a = b;
		b = c;
		n--;
	}
	return c;
}
int main()
{
	int n;
	printf("«Î ‰»Î ˝:");
	scanf("%d", &n);
	printf("%d ", fib(n));
	system("pause");
	return 0;
}
//void UpAngle(int arr[][5], int row, int col)
//{
//	int i, j, temp = 1;
//	for (i = 0; i < row; i++)
//	{
//		for (j = 0; j < col; j++)
//		{
//			if (j >= i)
//			{arr[i][j] = temp++;
//			}
//			else{
//            arr[i][j] = arr[j][i];
//			}
//				printf("%d  ", arr[i][j]);
//		
//		}
//		printf("\n");
//	}
//}
//int main()
//{
//	int arr[5][5] = { 0 };
//	UpAngle(arr, 5, 5);
//	system("pause");
//	return 0;
//}

//#include<stdio.h>
//#include<windows.h>
//int main()
//{
//	int arr[3][4] = { 0 };
//	int i, j;
//	for (i = 0; i < 3; i++)
//	{
//		for (j = i; j< 4; j++)
//		{
//			arr[i][j] = i * 4 + j;
//			printf("%d ", arr[i][j]);
//		}
//		printf("\n");
//	}
//	system("pause");
//	return 0;
//}
////
////void h(int arr[5][5])
////{
////	int i, j,count=0;
////	for (i = 0; i <= 4; i++)
////	{
////		for (j = i; j <= 4; j++)
////		{
////			arr[i][j] = count;
////			count++;
////			printf("%d ", arr[i][j]);
////		}
////		printf("\n");
////	}
////}
////int main()
////{
////	int arr[5][5];
////	h(arr);
////	system("pause");
////	return 0;
////}