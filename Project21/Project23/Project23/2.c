#include<stdio.h>
#include<Windows.h>
int main()
{
	int a, b;
	for (a = 0; a < 4; a++)
	{
		b = a + 2;
	}
	printf("%d\n", b);
	/*char *str1 = "add";
	char str[] = { 'a','c' };*/
	/*printf("%s\n", str1);
	printf("%s\n", str);*/
	system("pause");
	return 0;
}