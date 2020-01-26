#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<windows.h>
int mao(int arr[], int len)
{
	int i, j, hu, count = 0;
	for (i = 1; i < len; i++)//趟数
	{
		for (j = 0; j<len - 1; j++)//从第一个数开始进行，数组是从0号下标开始的
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
	mao(arr, len);
	system("pause");
	return 0;
}