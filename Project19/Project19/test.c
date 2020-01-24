#define _CRT_SECURE_NO_WARNINGS 1
#include"game.h"
void menu()
{
	printf("*******************\n");
	printf("******0.exit*******\n");
	printf("******1.play*******\n");
	printf("*******************\n");
}
void game()
{

	char board[ROW][ROW] = { 0 };// '0'  '\0'   0   NULL
	InitBoard(board, ROW, ROW, ' ');
	ShowBoard(board, ROW, ROW);
}
int main()
{
	int input = 0;
	do
	{
		menu();
		printf("请输入您的选择：-》");
		scanf("%d", &input);
		switch (input)
		{
		case 1:
			printf("游戏开始\n");
			game();
			break;
		case 0:
			printf("游戏退出\n");
			break;
		default:
			printf("请输入正确的操作\n");
			break;
		}
	} while (input);
	return 0;
}
