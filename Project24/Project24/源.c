#include<stdio.h>
#include<windows.h>
int main()
{
	int i,j;
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
			printf("%d ", i);
		}
		system("pause");
		return 0;
}


	/*printf("%d\n", strlen("abcdef"));
	printf("%s\n","c:\est");*/
	/*int a, b;
	for (a = 0; a < 4; a++)
	{
		b = a + 2;
	}
	printf("%d\n", b);*/
	/*char *str1 = "add";
	
	char str[] = { 'a','c' };*/
	/*printf("%s\n", str1);
	printf("%s\n", str);*/
	