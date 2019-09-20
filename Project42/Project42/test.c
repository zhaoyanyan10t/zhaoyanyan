#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int Find(int t, int arr[3][3])
{
	int r = 0, c = 2;
	while (r <= 2 && c >= 0)
	{
		if (arr[r][c] > t)
		{
			c--;
		}
		else if (arr[r][c] < t)
		{
			r++;
		}
		else
		{
			return 1;
		}
	}
	return 0;
}
int main()
{
	int t;
	int arr[3][3] = { 1, 2, 3, 2, 3, 4, 3, 4, 5 };
	printf("输入要查找的数t：");
	scanf("%d", &t);
	Find(t, arr);
	if (Find(t, arr) == 1)
	{
		printf("有数\n");
	}
	if (Find(t, arr) == 0)
	{
		printf("没有\n");
	}
	system("pause");
	return 0;
}
//int T(int arr[],int len)
//{
//	int arr1[10] = { 0 };
//	int left = 0, right = len-1;
//	for (int i = 0; i <len; i++)
//	{
//		if (arr[i] % 2 == 1)
//		{
//			arr1[left] = arr[i];
//			left++;
//		}
//		else
//		{
//			arr1[right] = arr[i];
//			right--;
//		}
//	}
//	for (int i = 0; i < len; i++)
//	{
//		printf("%d ", arr1[i]);
//	}
//}
//int main()
//{
//	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
//	int len = sizeof(arr) / sizeof(arr[0]);
//	T(arr,len);
//	system("pause");
//	return 0;
//}