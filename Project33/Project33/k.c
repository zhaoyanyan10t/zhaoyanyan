#include<stdio.h>
#include<windows.h>
int main()
{
	int count = 0;
	int tmp = 6666;
	do{
		count++;
		tmp = tmp / 10;
	} while (tmp != 0);
	printf("%d\n", count);
	system("pause");
	return 0;
}

//int main()
//{
//	int i, count = 1;
//	for (i = 0; i <= 999999; i++)
//	{
//		int tmp = i;
//		do{
//			count++;
//			tmp = tmp / 10;
//		} while (tmp!=0  );
//		int t1 = i / 100000;
//		int t2 = (i / 10000) % 10;
//		int t3 = (i / 1000) % 10;
//		int t4 = (i / 100) % 10;
//		int t5 = (i / 10) % 10;
//		int t6 = i % 10;
//		if (i == pow(t1, count) + pow(t2, count) + pow(t3, count) + pow(t4, count) + pow(t5, count) + pow(t6, count) )
//		{
//			printf("%d ", i);
//		}
//	}
//	system("pause");
//	return 0;
//}