#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
//int h(int n)
//{
//	int i, count = 0;
//	for (i = 0; i < 32; i++)
//	{
//		if ((n>>i)& 1)
//		{
//			count++;
//		}
//	}
//	return count;
//}
//int main()
//{
//	h(3);
//	printf("%d\n", h(3));
//	system("pause");
//	return 0;
//}
//int h(int arr[5][5])
//{
//	int i, j, k;
//	for (i = 0; i <= 4; i++)
//	{
//		for (k = 0; k <4- i; k++)
//		{
//			printf(" ");
//		}
//		for (j = 0; j <= i; j++)
//		{
//			if (j == 0 || i == j)
//			{
//				arr[i][j] = 1;
//				printf("%d ", arr[i][j]);
//			}
//			else{
//				arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
//				printf("%d ", arr[i][j]);
//			}
//		}
//		printf("\n");
//	}
//}
//int main()
//{
//	int arr[5][5] = { 0 };
//	h(arr);
//	system("pause");
//	return 0;
//}
int h(int arr[5][5])
{
	int i, j, k;
	for (i = 0; i <= 4; i++)
	{
	
		for (j = 0; j <= i; j++)
		{
			if (j == 0 || i == j)
			{
				arr[i][j] = 1;
				printf("%d ", arr[i][j]);
			}
			else{
				arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
				printf("%d ", arr[i][j]);
			}
		}
		printf("\n");
	}
}
int main()
{
	int arr[5][5] = { 0 };
	h(arr);
	system("pause");
	return 0;
}