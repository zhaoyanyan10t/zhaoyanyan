#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<windows.h>
int ha(int arr[5][5], int row, int col)
{
	int i, j,temp=1;
	for (i = 0; i < row; i++)
	{
		for (j = 0; j < col; j++)
		{
			if (j >= i)
			{
				arr[i][j] = temp++;
			}
			else
			{
				arr[i][j] = 0;
			}
			printf("%d ", arr[i][j]);
		}
		printf("\n");
	}
	}
int main()
{
	int arr[5][5] = { 0 };
	ha(arr, 5, 5);
	system("pause");
	return 0;
}