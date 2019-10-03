#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int findMaxConsecutiveOnes(int* nums, int numsSize)
{
	
	int i, max = 0;
	int count = 0;
	for (i = 0; i <numsSize; i++)
	{
		if (nums[i] == 1)
		{
			count++;
		}
		if (count>max)
		{
			max = count;
		}
		if (nums[i] == 0)
		{
			count = 0;
		}
	}
	return max;
}

int main()
{
	int nums[] = {1,0,1,1,0,1};
	int numsSize = sizeof(nums) / sizeof(nums[0]);
	printf("%d\n", findMaxConsecutiveOnes(nums, numsSize));
	system("pause");
	return 0;
}
//int main()
//{
//	int a, b, c, d,i,max,min;
//	printf("输入四个整数:");
//	scanf("%d%d%d%d", &a, &b, &c, &d);
//	int arr[] = { a, b, c, d };
//	#define _CRT_SECURE_NO_WARNINGS
//	max = min = arr[0];
//
//	for (i = 0; i < 4; i++)
//	{
//		
//		if (max < arr[i])
//		{
//			max = arr[i];
//		}
//		if (min>arr[i])
//		{
//			min = arr[i];
//		}
//	}
//	printf("%d %d\n",max,min);
//	system("pause");
//	return 0;
//
//}
