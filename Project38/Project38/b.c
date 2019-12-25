#define _CRT_SECURE_NO_WARNINGS     
#include<stdio.h>
int mylen(char *str)
{
	int len=0;
	while (*str)
	{
		len++;
		str++;
	}
	return len;
}
int r(char *str)
{
	int len=mylen(str);
	char *left = str;
	char *right = str + len - 1;
	while (left < right)
	{
		char tmp = *left;
		*left = *right;
		*right = tmp;
		left++;
		right--;
	}
	return str;
}

int main()
{
	char str[] = "i am s";
	
	printf("%s\n", r(str));
	system("pause");
	return 0;
}