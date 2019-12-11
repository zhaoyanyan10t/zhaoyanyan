#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<math.h>
int main()
{
	int a, b, c;
	printf("请输入三个数：");
	scanf("%d%d%d", &a, &b, &c);
	if (a > b)
	{
		if (a > c)
		{
			printf("max=%d\n", a);
		}
		else
		{
			printf("max=%d\n", c);
		}
	}
	else if (b > c)
	{
		printf("max=%d\n", b);
	}
	else {
		printf("max=%d\n", c);
	}
	system("pause");
	return 0;
}
