#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<conio.h>
#include<math.h>
#include<string.h>
#include<stdlib.h>

int i, row = 0, line = 0;
char test[1000];  //test文件中的字符 
int number[100]; //常数表 
char mark[100][5];   //标识符表

//词法分析
int wordanalysis()
{
	//标识符和保留字
	if ((test[i] >= 'A'&&test[i] <= 'Z') || (test[i] >= 'a'&&test[i] <= 'z'))
	{
		char word[10];
		//保留字表
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

		//判断该标识符是否为保留字
		for (n = 0; n < 100; n++)
		{
			if (strcmp(word, pro[n]) == 0)
			{
				printf(">> %s\t(%d,-) 保留字\n", pro[n], n + 1);
				return 3;
			}
		}

		//判断该标识符是否在标识符表中
		int m = 0;
		if (line != 0)
		{
			int q = 0;
			while (q<line)
			{
				if (strcmp(word, mark[q++]) == 0)
				{
					printf(">> %s\t(25,%d) 标识符\n", word, q);
					return 3;
				}
			}

		}

		//将该标识符保存到标识符表中
		strcpy(mark[line], word);

		printf(">> %s\t(25, %d) 标识符\n", word, line + 1);
		line++;
		return 3;

	}
	//数字 
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
		int num = atoi(x); //将字符串转换成int型

		//判断该常数是否存在于常数表中
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

		//将该常数保存到标识符表中
		number[row] = num;


		int line = row;
		printf(">> %d\t(26,%d)\n", num, line + 1);
		row++;

		return 3;
	}

	//各种符号
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
		case '\'': printf(">> '\t(49,-)\n"); return 3;//单引号
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



//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>
//#include<math.h>
//int f(int n)
//{
//	int z, ge, shi, bai;
//	ge = n % 10;
//	shi = n / 10 % 10;
//	bai = n / 100 % 10;
//	if (n== pow(ge, 3) + pow(shi, 3) + pow(bai, 3))
//	{
//		printf("%d ", n);
//	}
//}
//int main()
//{
//	int i;
//	for (i = 100; i<1000; i++)
//	{
//		f(i);
//	}
//	system("pause");
//	return 0;
//}
//int main()
//{
//	int p, q, a, b,count=0;
//	scanf("%d%d", &p, &q);
//	for (a = 0; a <= p; a++)
//	{
//		for (b = 0; b <= p; b++)
//		{
//			if (a + b == p&&a*b == q)
//			{
//				printf("(x+%d)+(x+%d)=0\n", a, b);
//				count++;
//			}
//		}
//	}
//	if (count == 0)
//	{printf("无\n");
//	}
//	
//	system("pause");
//	return 0;
//}