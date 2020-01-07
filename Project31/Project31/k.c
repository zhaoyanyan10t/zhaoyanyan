#include<stdio.h>
#include<windows.h>
int main()
{
	int i,count=1;
	for (i = 0; i <= 999999; i++)
	{
		int tmp = i;
		do{
			count++;
		    tmp = tmp / 10;
		} while (i>9);
		int t1 = i / 100000;
		int t2 = (i / 10000) % 10;
		int t3= (i / 1000) % 10;
		int t4 = (i / 100) % 10;
		int t5 = (i / 10) % 10;
		int t6 = i % 10;
		if (i == t1^count + t2^count + t3^count + t4^count + t5^count + t6^count)
		{
			printf("%d ", i);
		}
	}
	system("pause");
	return 0;
}