#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<windows.h>
int main()
{
	int a[4][5] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	printf("%d\n", a[1] + 3);
	system("pause");
	return 0;
}

//int main()
//{
//	int i,j,a=0;
//	for (i = 0; i < 2; i++)
//	{
//		for (j = 0; j < 4; j++)
//		{
//			if (j% 2)
//			     break;
//		    a++;
//		}
//		a++;
//	}
//	printf("%d\n", a);
//	system("pause");
//	return 0;
//}