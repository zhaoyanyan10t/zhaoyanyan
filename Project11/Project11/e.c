#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<windows.h>
int prime(int n)
{
	int a;
	for (a = 2; a < n; a++)
	{
		if (n % a == 0)
		{
			return 0;		
		}
		return 1;
	}
}
	int main()
	{
		int n;
		printf("������:");
		scanf("%d", &n);
		if (prime(n) == 1)
		{
			printf("%d����", n);
		}
		else{
			printf("%d��������", n);
		}
     	system("pause");
		return 0;
	}
		