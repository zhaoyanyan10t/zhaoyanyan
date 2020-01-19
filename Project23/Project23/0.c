#include<stdio.h>
int T(int arr[],int len)
{
	int arr1[] = { 0 };
	int left = 0, right = len - 1;
	int i;
	for (i = 0; i < len; i++)
	{
		if (arr[i] % 2 != 0)
		{
			arr1[left] = arr[i];
			left++;
		}
		else
		{
			arr1[right] = arr[i];
			right--;
		}
	}
	for (i = 0; i < len; i++)
	{
      printf("%d ", arr1[i]);
	}
		
}
int main()
{
	int arr[] = {1,2,3,4,5,6,7,8,9,10,11 };
	int len = sizeof(arr) / sizeof(arr[0]);
	T(arr,len);
	system("pause");
	return 0;
}