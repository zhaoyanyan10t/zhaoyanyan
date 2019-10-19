#define _CRT_SECURE_NO_WARNINGS

#include<stdio.h>
#include<conio.h>
#include<math.h>
#include<string.h>
#include<stdlib.h>

int i, row = 0, line = 0;
char test[1000];  //test�ļ��е��ַ� 
int number[100];	//������ 
char mark[100][5];   //��ʶ����

//�ʷ�����
int wordanalysis()
{
	//��ʶ���ͱ�����
	if ((test[i] >= 'A'&&test[i] <= 'Z') || (test[i] >= 'a'&&test[i] <= 'z'))
	{
		char word[10];
		//�����ֱ�
		char pro[100][100] = { "PROGRAM", "BEGIN", "END", "VAR", "INTEGER", "WHILE",
			"IF", "THEN", "ELSE", "DO", "PROCEDURE", "char",
			"int", "if", "else", "var", "return", "break",
			"do", "while", "for", "double", "float", "short" };

		int n = 0;
		word[n++] = test[i++];
		while ((test[i] >= 'A'&&test[i] <= 'Z') || (test[i] >= '0' && test[i] <= '9') || (test[i] >= 'a'&&test[i] <= 'z'))
		{
			word[n++] = test[i++];
		}
		word[n] = '\0';
		i--;

		//�жϸñ�ʶ���Ƿ�Ϊ������
		for (n = 0; n < 100; n++)
		{
			if (strcmp(word, pro[n]) == 0)
			{
				printf(">> %s\t(%d,-) ������\n", pro[n], n + 1);
				return 3;
			}
		}

		//�жϸñ�ʶ���Ƿ��ڱ�ʶ������
		int m = 0;
		if (line != 0)
		{
			int q = 0;
			while (q<line)
			{
				if (strcmp(word, mark[q++]) == 0)
				{
					printf(">> %s\t(25,%d) ��ʶ��\n", word, q);
					return 3;
				}
			}

		}

		//���ñ�ʶ�����浽��ʶ������
		strcpy(mark[line], word);
		printf(">> %s\t(25, %d) ��ʶ��\n", word, line + 1);
		line++;
		return 3;

	}
	//���� 
	else if (test[i] >= '0' && test[i] <= '9')
	{
		char x[100];
		int n = 0;
		x[n++] = test[i++];

		while (test[i] >= '0' && test[i] <= '9')
		{
			x[n++] = test[i++];
		}
		x[n] = '\0';
		i--;
		int num = atoi(x); //���ַ���ת����int��

		//�жϸó����Ƿ�����ڳ�������
		if (row != 0)
		{

			for (int y = 0; y<row; y++)
			{
				if (number[y] == num)
				{
					printf(">> %d\t(26,%d)\n", num, y + 1);
					return 3;
				}
			}
		}

		//���ó������浽��ʶ������
		number[row] = num;


		int line = row;
		printf(">> %d\t(26,%d)\n", num, line + 1);
		row++;

		return 3;
	}

	//���ַ���
	else
		switch (test[i])
	{
		case ' ':
		case '\n':
			return -1;
		case '#': return 0;
		case '=':printf(">> =\t(27,-)\n"); return 3;
		case '<':
			i++;
			if (test[i] == '=')
			{
				printf(">> <= \t(28,-)\n");
				return 3;
			}
			else if (test[i] == '>')
			{
				printf(">> <>\t(29,-)\n");
				return 3;
			}
			else
			{
				i--;
				printf(">> <\t(30,-)\n");
				return 3;
			}
		case '>':
			i++;
			if (test[i] == '=')
			{
				printf(">> >=\t(31,-)\n");
				return 3;
			}
			else
			{
				i--;
				printf(">> >\t(32,-)\n");
				return 3;
			}
		case '+': printf(">> +\t(33,-)\n"); return 3;
		case '-': printf(">> -\t(34,-)\n"); return 3;
		case '*': printf(">> *\t(35,-)\n"); return 3;
		case '/':
			i++;
			if (test[i] != '/'){
				i--;
				printf(">> /\t(36,-)\n"); return 3;
			}

			else{

				while (1){
					if (test[i++] == '\n')
						return -1;
				}
				printf(">> //\t(37,-)\n"); return 3;

			}

		case ':': printf(">> :\t(38,-)\n"); return 3;
		case ';': printf(">> ;\t(39,-)\n"); return 3;
		case '(': printf(">> (\t(40,-)\n"); return 3;
		case ')': printf(">> )\t(41,-)\n"); return 3;
		case '{': printf(">> {\t(42,-)\n"); return 3;
		case '}': printf(">> }\t(43,-)\n"); return 3;
		case '[': printf(">> [\t(44,-)\n"); return 3;
		case ']': printf(">> ]\t(45,-)\n"); return 3;
		case '|': printf(">> |\t(46,-)\n"); return 3;
		case '"': printf(">> \"\t(47,-)\n"); return 3;
		case ',': printf(">> ,\t(48,-)\n"); return 3;
		case '\'': printf(">> '\t(49,-)\n"); return 3;//������
		case '&':
			i++;
			if (test[i] != '&'){
				i--;
				printf(">> &\t(50,-)\n"); return 3;
			}
			else{
				printf(">> &&\t(51,-)\n"); return 3;

			}
		case '\\': printf(">> \\\t(52,-)\n"); return 3;
	}

}

int main()
{

	int c = 0;
	int m;
	i = 0;
	FILE *fp;
	fp = fopen("F:\\test.txt", "r");
	if (fp == NULL)
	{
		printf("can't open file!\n");
		exit(0);
	}

	while (!feof(fp))
	{
		test[c++] = fgetc(fp);
	}
	test[c] = '#';
	do
	{
		m = wordanalysis();

		switch (m)
		{
		case -1:i++; break;
		case 0: i++; break;
		case 3: i++; break;
		}
	} while (m != 0);

	system("pause");
	return 0;
}
