#define _CRT_SECURE_NO_WARNINGS     
#include<stdio.h>
int mylen(char *str)
{
	int len = 0;
	while (*str!='\0')
	{
		len++;
		str++;
	}
	return len;
}
int r(char *str, char *left, char *right)
{
	while (left < right)
	{
		char tmp = *left;
		*left = *right;
		*right = tmp;
		left++;
		right--;
	}
}
int rs(char *str)
{
	int len = mylen(str);
	char *cur = str;
	char *left = str;
	char *right = str + len - 1;
	r(str, left, right);
	while (*cur!='\0')
	{
		char *start = cur;
		while (*cur != ' '&&*cur != '\0')
		{
			cur++;
		}
		r(str,start,cur-1);
		if (*cur == ' ')
		{
			cur++;
		}
	}
	return str;
}
int main()
{
	char str[] = "i am  a student";	
		printf("%s\n", rs(str));
		system("pause");
		return 0;
}
//int mylen(char *str)
//{
//	int len=0;
//	while (*str)
//	{
//		len++;
//		str++;
//	}
//	return len;
//}
//int r(char *str)
//{
//	int len=mylen(str);
//	char *left = str;
//	char *right = str + len - 1;
//	while (left < right)
//	{
//		char tmp = *left;
//		*left = *right;
//		*right = tmp;
//		left++;
//		right--;
//	}
//	return str;
//}
//
//int main()
//{
//	char str[] = "i am s";
//	
//	printf("%s\n", r(str));
//	system("pause");
//	return 0;
//}
//int ave(int a, int b)
//{
//	int ave;
//	int sum = 0;
//	sum = ((a&b) << 1) + (a^b);
//	//求和，先写成进制形式，a&b代表求相同的位数，左移一位相当于乘以2的一次方，a^b相当于求a和b 不同的数 不需要除以2；
//	//如果求平均数，就给他除以2；
//	ave = (a&b) + ((a^b) >> 1);
//	//这是给他们除以2，a^b除以2 就是给他右移一位；
//	return ave;
//}
//int main()
//{
//	printf("%d\n", ave(1, 7));
//	system("pause");
//	return 0;
//}

//unsigned int reverse_bit(unsigned int value)
//{
//	unsigned int i;
//	int sum = 0;
//	for (i = 0; i < 32;i++)
//	{
//		sum += (((value >> i) & 1) * pow(2, 31 - i));
//    }
//	return sum;
//}
//int main()
//{
//	printf("%d\n", reverse_bit(25));
//	system("pause");
//	return 0;
//}
/*int main()
{
	char k;
	for (k = 'a'; k <= 'd'; k++)
	{
		if ((k != 'a') + (k == 'c') + (k == 'd') + (k != 'd') == 3){
            printf("%c\n", k);
		}
			
	}
	system("pause");
	return 0;
}*/
//#if 0
//void fun(int num)
//{
//	if (num > 9)
//	{
//		fun(num / 10);
//	}
//		printf("%d\n", num%10);
//		return 0;
//}
//int main()
//{
//	fun(1234);
//
//	system("pause");
//	return 0;
//}
//
//int count_one_bits(unsigned int value)
//{
//	int count = 0;
//	int i;
//	for (i = 0; i < 32; i++)
//	{
//		if(((value>>i)&1))
//		{
//			count++;
//		}
//	}
//	return count;
//}
//int main()
//{
//	printf("%d\n", count_one_bits(2));
//	system("pause");
//	return 0;
//}
//#endif
