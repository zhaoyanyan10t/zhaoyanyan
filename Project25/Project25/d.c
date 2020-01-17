#include<stdio.h>
#include<windows.h>
int main()
{
	int i, j,count=0;
	for (i = 100; i <= 200; i++)
	{
		for (j = 2; j < i; j++)
		{
			if (i%j == 0)
			{
				break;
			}
		}
		if (i <= j)
		{
			count++;
			printf("%d ", i);
		}
	}
	printf("%d\n", count);
	system("pause");
	return 0;
}