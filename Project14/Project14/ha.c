#define _CRT_SECURE_NO_WARNINGS 
#include<stdio.h>
#include<Windows.h>                                    
void sele(int arr, int len)
{
	int i, j,hu;
	for (i = 0; i < len - 1; i++)
	{
		for (j = i + 1; j < len; j++)
		{
			if (arr[j]>arr[j + 1])
			{
				hu = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = hu;
			}
		}
	}
	for (i = 0; i < len; i++)
	{
		printf("%d ", arr[i]);
	}
}
int main()
{
	int arr[] = { 1, 2, 32, 4, 6, 3 };
	int len = sizeof(arr) / sizeof(arr[0]);
	sele(arr[], len);
	system("pause");
	return 0;
}