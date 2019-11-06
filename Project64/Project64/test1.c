#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <math.h>
int main()
{
	int a[10], b[10], i, min;
	printf("请输入十个整数\n");
	for (i = 0; i<10; i++)
	{
		scanf("%d", &a[i]);
	}
	for (i = 0; i <10; i++)
	{
		b[i] = a[9 - i];
	}
	for (min = 0; min<10; min++)
	{
		printf("%d ", b[min]);
	}
	system("pause");
	return 0;
}
