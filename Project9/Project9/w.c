#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<windows.h>
int strlen(char *str)
{
	if (*str != '\0')
	{
		return 1 + strlen(str + 1);

	}
	else{
		return 0;
	}
}
int main()
{
	char *str = "abde";
	printf("%d\n", strlen(str));
	system("pause");
	return 0;
}
