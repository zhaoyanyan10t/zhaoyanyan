#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<math.h>
int main()
{
	int n = 0, m = 0, sum = 0, ave = 0;        //  n为输入的数，m为个数，ave为平均数
	for (; n != -1;)
	{sum = sum + n;
		scanf("%d", &n);
		m = m + 1;
		
	}
	m = m - 1;
	ave = sum / m;
	printf("m:%d\nave = %d", m, ave);
	system("pause");
	return 0;
}

//int main()
//{
//	int x, c = 0;
//	float sum=0,a;
//	printf("shuru");
//	scanf("%d", &x);
//	for (; x != 0;)
//	{
//		sum = sum + x;
//-		scanf("%d", &x);
//
//		c++;
//	}
//	a = sum / c;
//	printf("ping%f", a);
//	system("pause");
//	return 0;
//}

//int main()
//{
//	int i;
//	float n, sum = 0;
//	for (i = 1; i <= 200; i++)
//	{
//		n = (float)1 / i;
//		sum = sum + n;
//	}
//	printf("%f", sum);
//	system("pause");
//	return 0;
//}