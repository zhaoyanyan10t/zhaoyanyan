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
		printf("����������ѡ��-��");
		scanf("%d", &input);
		switch (input)
		{
		case 1:
			printf("��Ϸ��ʼ\n");
			game();
			break;
		case 0:
			printf("��Ϸ�˳�\n");
			break;
		default:
			printf("��������ȷ�Ĳ���\n");
			break;
		}
	} while (input);
	return 0;
}
