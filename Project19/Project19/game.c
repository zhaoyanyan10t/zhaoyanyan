#define _CRT_SECURE_NO_WARNINGS 
#include"game.h"    
void InitBoard(char board[][ROW],int row,int col,char set)  
{   
	int i,j;  
	for (i = 0; i < row; i++)
	{
		for (j = 0; j < row; j++)
		{
			board[i][j] =' ';
		}

	}
}
void ShowBoard(char board[][ROW], int row, int col)
{
	int i, j;
	for (i = 0; i < row; i++)
	{
		for (j = 0; j < col; j++)
		{
			printf(" %c ", board[i][j]);
			if (j < col - 1)
			{
				printf("|");
			}
		}
		printf("\n");
		if (i < row - 1)
		{
			for (j = 0; j < col; j++)
			{
				printf("\n");
				if (j < col - 1)
				{
					printf("|");
				}
			}
			printf("\n");
		}
	}
}
