#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>
int main()
{
	int a[10], b[10], i;
	printf("请输入十个整数\n");
	for (i = 0; i<10; i++)
	{
		scanf("%d", &a[i]);
	}
	int min = a[0];
	for (i = 0; i <10; i++)
	{
		if (min>a[i])
		{
			min = a[i];
		}
	}
	printf("%d\n", min);
	for (i= 0; i<10; i++)
	{
		if (min==a[i])
		{
			printf("%d\n", i);
			break;
		}
	}
	system("pause");
	return 0;
}
