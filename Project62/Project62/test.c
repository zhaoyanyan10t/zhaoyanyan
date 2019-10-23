#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main()
{
	int i, c, j, t, b, n;
	int a[11] = { 1, 2, 3, 4, 5, 6, 8, 85, 98, 100 };
	printf("输入一个数字:");
	scanf("%d", &b);
	n = a[9];
	if (b>n)
		a[10] = b;
	else
	{
		for (i = 9; i >= 0; i--)
		{
			if (a[i]<b)
			{
				t = a[i + 1];
				a[i + 1] = b;
				for (j = i + 1; j<10; j++)
				{
					c = a[j + 1];
					a[j + 1] = t;
					t = c;
				}
				break;
			}
		}
	}
	//printf("%d\n", a[i]);
	for (i = 0; i <= 10; i++)
		printf("%d ", a[i]);
	printf("\n");
	system("pause");
	return 0;
}
