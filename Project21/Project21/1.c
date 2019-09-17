#include<stdio.h>
#include<windows.h>
int main()
{
	char *str = "hello\0";
	char str1[] = { 'a', 'b', 'c' };
	printf("%s\n", str);
	printf("%s\n", str1);
	system("pause");
	return 0;
}