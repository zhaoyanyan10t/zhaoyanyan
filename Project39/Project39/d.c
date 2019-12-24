#define _CRT_SECURE_NO_WARNINGS     
#include <stdio.h> 
#include<assert.h>
char * strcpy(char * dst, const char * src) {
	char * p = dst;
	while (*p != '\0')
	{
		*p++;
		*src++;
	}
	return src;
}

int main()
{
	char *p = "abcdef";
	char *src=NULL;
	int l=strcpy(p, src);
	printf("%s\n", l);
	system("pause");
	return 0;
}
//int my_strlen(const char *str) 
//{
//	int count = 0;
//	assert(str != NULL);
//	while(*str)//ÅĞ¶Ï×Ö·û´®ÊÇ·ñ½áÊø
//	{
//		count++;
//		str++;
//	}
//	return count;
//}
//int main()
//{
//	const char* p = "abcdef"; //²âÊÔ
//	int len = my_strlen(p);
//	printf("len = %d\n", len);
//	system("pause");
//	return 0; 
//}