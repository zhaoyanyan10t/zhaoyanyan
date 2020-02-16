#include <stdio.h>
#include<windows.h>
void print(int n)
{
	if (n > 9)
	{
		print(n / 10);
	}
	else{
     printf("%d ", n % 10);
	}
	
}
int main()
{
	int num=19;
	print(num);
	system("pause");
	return 0;
}



//int main()
//{
//	int i;
//	for (i = 1000; i <= 2000; i++)
//	{
//		if (((i % 4) == 0 && (i % 100) != 0) || (i % 400) == 0)
//		{
//			printf("%d ", i);
//		}
//	}
//	system("pause");
//	return 0;
//}