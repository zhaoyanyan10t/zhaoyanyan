#include<stdio.h>
#include<windows.h>
int main()
{
	int arr[3][4] = { 0 };
	int i, j;
	for (i = 0; i < 3; i++)
	{
		for (j = 0; i < 4; j++)
		{
			arr[i][j] = i * 4 + j;
			printf("%d ", arr[i][j]);
		}
		printf("\n");
	}
}
//
//void h(int arr[5][5])
//{
//	int i, j,count=0;
//	for (i = 0; i <= 4; i++)
//	{
//		for (j = i; j <= 4; j++)
//		{
//			arr[i][j] = count;
//			count++;
//			printf("%d ", arr[i][j]);
//		}
//		printf("\n");
//	}
//}
//int main()
//{
//	int arr[5][5];
//	h(arr);
//	system("pause");
//	return 0;
//}