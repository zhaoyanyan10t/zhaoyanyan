#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<Windows.h>
int yu(int num)
{
	int count = 0;
	while ((num>>1)!= 0)
	{
		
			count++;
		num = num >> 1;
	}
	return count;
	
}
	int main()
	{
		int num =9;
		printf("%d", yu(num));
		system("pause");
		return 0;
	}
//int main()
//{
//	int num=11;
//	int count = 0;
//	while (num != 0)
//	{
//		if ((num &1)!= 0)
//		{
//				count++;
//		}
//		num = num >> 1;
//	}
	

//#define _CRT_SECURE_NO_WARNINGS
//#include"game.h"
//void menu()
//{
//	printf("*******************\n");
//	printf("******0.exit*******\n");
//	printf("******1.play*******\n");
//	printf("*******************\n");
//}
//void game()
//{
//	char ret = 0;
//	char board[ROW][ROW] = { 0 };// '0'  '\0'   0   NULL
//	InitBoard(board, ROW, ROW, ' ');
//	ShowBoard(board, ROW, ROW);
//	while (1)
//	{
//		PlayerMove(board, ROW, ROW);//���ÿ��һ������Ҫ�ж���Ӯ
//		ret = IsWin(board, ROW, ROW);
//		if (ret != ' ')
//		{
//			ƽ�ֻ���һ��ʤ��
//			break;
//		}
//		ShowBoard(board, ROW, ROW);
//		������
//		ComputerMove(board, ROW, ROW);
//		ret = IsWin(board, ROW, ROW);
//		if (ret != ' ')
//		{
//			ƽ�ֻ�һ��ʤ��
//			break;
//		}
//		ShowBoard(board, ROW, ROW);
//	}
//	�ж�ret
//	if (ret == 'x')
//	{
//		printf("���ʤ��\n");
//	}
//	if (ret == 'O')
//	{
//		printf("����ʤ��\n");
//	}
//	if (ret == 'Q')
//	{
//		printf("ƽ��\n");
//	}
//}
//int main()
//{
//	int input = 0;
//	do
//	{
//		menu();
//		printf("����������ѡ��-��");
//		scanf("%d", &input);
//		switch (input)
//		{
//		case 1:
//			printf("��Ϸ��ʼ\n");
//			game();
//			break;
//		case 0:
//			printf("��Ϸ�˳�\n");
//			break;
//		default:
//			printf("��������ȷ�Ĳ���\n");
//			break;
//		}
//	} 
//	while (input);
//	system("pause");
//	return 0;
//}
//
