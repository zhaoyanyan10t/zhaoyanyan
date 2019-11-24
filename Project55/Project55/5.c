#include<stdio.h>
#include<math.h>
int main()
{
	int i;
	float d, c, sum = 0;
	for (i = 1; i <= 100; i++)
	{
		d = pow(-1, i + 1);
		c = (float)1 / i*d;
		sum = sum + c;
	}
	printf("%f\n", sum);
	system("pause");
	return 0;
}
//int main()
//{
//	int a, b;
//	double sum1 = 0, sum2 = 0, sum;
//	for (a = 1; a <= 99; a += 2)
//	{
//		sum1 = sum1 + (double)1 / a;
//	}
//	for (b = 2; b <= 100; b += 2)
//	{
//		sum2 = sum2 + (double)1 / b;
//	}
//	sum = sum1 - sum2;
//	printf("%f\n", sum);
//	system("pause");
//	return 0;
//}
