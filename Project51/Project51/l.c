#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<math.h>
int main()
{
	int a, b, c, d, e, f, g;//����a��ʾ��������֣�bΪ��λ��cΪʮλ��dΪ��λ��eΪǧλ��fΪ��λ��gΪλ��*��λ���ֵ���˼*
	printf("������һ������:");
	scanf("%d", &a);
	if (a>9999)
		g = 5;
	else if (a>999)
		g = 4;
	else if (a>99)
		g = 3;
	else if (a>9)
		g = 2;
	else
		g = 1;
	printf("�����ֵ�λ��Ϊ:%d\n", g);
	printf("�����ֵ�ÿһλ����Ϊ:\n");
	f = (a / 10000);
	e = (a - f * 10000) / 1000;
	d = (a - f * 10000 - e * 1000) / 100;
	c = (a - f * 10000 - e * 1000 - d * 100) / 10;
	b = (a - d * 10000 - e * 1000 - d * 100 - c * 10);
	switch (g)
	{
	case 5:printf("%d %d %d %d %d", f, e, d, c, b);
		printf("ת��Ϊ:\n");
		printf("%d %d %d %d %d", b, c, d, e, f);
		break;
	case 4:printf("%d %d %d %d", e, d, c, b);
		printf("ת��Ϊ:\n");
		printf(" %d %d %d %d", b, c, d, e);
		break;
	case 3:printf("%d %d %d", d, c, b);
		printf("ת��Ϊ:\n");
		printf("%d %d %d", b, c, d);
		break;
	case 2:printf("%d %d", c, b);
		printf("ת��Ϊ:\n");
		printf("%d %d", b, c);
		break;
	case 1:printf("%d", b);
		printf("ת��Ϊ:\n");
		printf("%d", b);
		break;
	}
	system("pause");
	return 0;
}

//int main()
//{
//	int day, month, year, sum, leap;
//	printf("\nplease input year,month,day\n");
//	scanf("%d,%d,%d", &year, &month, &day);
//	switch (month)
//	{
//	case 1:sum = 0;
//		break;
//	case 2:sum = 31;
//		break;
//	case 3:sum = 59;
//		break;
//	case 4:sum = 90;
//		break;
//	case 5:sum = 120;
//		break;
//	case 6:sum = 151;
//		break;
//	case 7:sum = 181;
//		break;
//	case 8:sum = 212;
//		break;
//	case 9:sum = 243;
//		break;
//	case 10:sum = 273;
//		break;
//	case 11:sum = 304;
//		break;
//	case 12:sum = 334;
//		break;
//	default : 
//		break;
//	}
//	sum = sum + day;
//	if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
//		leap = 1;
//	else
//		leap = 0;
//	if (leap == 1 && month>2)sum++;
//	printf("It is the %dth day.", sum);
//	system("pause");
//	return 0;
//}