#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<windows.h>
int mao(int arr[],int len)
{
	int i,j,hu,count=0;
	for (i = 1; i < len; i++)//趟数
	{
		for(j = 0; j<len-1; j++)//从第一个数开始进行，数组是从0号下标开始的
		{
           if (arr[j]>arr[j + 1])
		    {
			hu = arr[j];
			arr[j] = arr[j + 1];
			arr[j + 1] = hu;
			count++;
		    }
		}
		
	}
	for (i = 1; i <len; i++){
		printf("%d ", arr[i]);
	
	}
	
}
int main()
{
	int arr[] = { 12, 51, 5, 1, 9 };
	int len = sizeof(arr) / sizeof(arr[0]);
	mao(arr,len);
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