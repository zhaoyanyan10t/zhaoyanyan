#include<stdio.h>
#include<windows.h>
int yu(int n)
{
	if (n < 10){
		printf("%d", n);
	}
	else{
		yu(n / 10);
		printf("%d", n / 10);
	}
}
int main()
{
	yu(12);
	system("pause");
	return 0;
}