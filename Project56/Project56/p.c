#define _CRT_SECURE_NO_WARNINGS
#include<string.h>
#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>
//����ؼ���
char *Key[10] = { "main", "void", "int", "char", "printf", "scanf", "else", "if", "return" };
char Word[20], ch;      //�洢ʶ����ĵ�����
int IsAlpha(char c)      //�ж��Ƿ�Ϊ��ĸ
{
	if (((c <= 'z') && (c >= 'a')) || ((c <= 'Z') && (c >= 'A')))
		return 1;
	else
		return 0;
}

int IsNum(char c)           //�ж��Ƿ�Ϊ����
{
	if (c >= '0'&&c <= '9')
		return 1;
	else
		return 0;
}

int IsKey(char *Word)                 //ʶ��ؼ��ֺ���
{
	int m, i;
	for (i = 0; i<9; i++)
	{
		if ((m = strcmp(Word, Key[i])) == 0)
		{
			if (i == 0)
				return 2;
			else
				return 1;
		}
	}
	return 0;
}

void scanner(FILE *fp)     //ɨ�躯��
{
	char Word[20] = { '\0' };
	char ch;
	int i, c;
	ch = fgetc(fp);       //��ȡ�ַ���ָ��fp���Զ�ָ����һ���ַ�
	if (IsAlpha(ch)) {             //�жϸ��ַ��Ƿ�����ĸ          
		Word[0] = ch;
		ch = fgetc(fp);
		i = 1;
		while (IsNum(ch) || IsAlpha(ch))  {  //�жϸ��ַ��Ƿ�����ĸ������ 
			Word[i] = ch;
			i++;
			ch = fgetc(fp);
		}
		Word[i] = '\0';      //'\0' �����ַ�����(�ո�)
		fseek(fp, -1, 1);
		c = IsKey(Word);     //�ж��Ƿ��ǹؼ���                     
		if (c == 0) printf("%s\t$��ͨ��ʶ��\n\n", Word);//���ǹؼ���
		else if (c == 2)     printf("%s\t$������\n\n", Word);
		else    printf("%s\t$�ؼ���\n\n", Word);      //����ؼ���
	}

	else              //��ʼ�жϵ��ַ�������ĸ
	{
		if (IsNum(ch))                //�ж��Ƿ�������
		{
			Word[0] = ch;
			ch = fgetc(fp);
			i = 1;
			while (IsNum(ch))
			{
				Word[i] = ch;
				i++;
				ch = fgetc(fp);
			}
			Word[i] = '\0';
			fseek(fp, -1, 1);    //����
			printf("%s\t$�޷���ʵ��\n\n", Word);
		}

		else        //��ʼ�жϵ��ַ�������ĸҲ��������
		{
			Word[0] = ch;
			switch (ch)
			{
			case'[':

			case']':

			case'(':

			case')':

			case'{':

			case'}':

			case',':

			case'"':
			case';':printf("%s\t$���\n\n", Word); break;

			case'+':ch = fgetc(fp);

				Word[1] = ch;

				if (ch == '=')
				{
					printf("%s\t$�����\n\n", Word);//�������+=��
				}

				else if (ch == '+')
				{
					printf("%s\t$�����\n\n", Word); //�жϽ��Ϊ��++��
				}

				else
				{
					fseek(fp, -1, 1);
					printf("%s\t$�����\n\n", Word); //�жϽ��Ϊ��+��
				}
				break;

			case'-':ch = fgetc(fp);
				Word[1] = ch;
				if (ch == '=')
				{
					printf("%s\t$����\n\n", Word);
				}
				else if (ch == '-')
				{
					printf("%s\t$�����\n\n", Word); //�жϽ��Ϊ��--��
				}
				else
				{
					fseek(fp, -1, 1);
					printf("%s\t$�����\n\n", Word); //�жϽ��Ϊ��-��
				}
				break;
			case'*':
			case'/':
			case'!':
			case'=':ch = fgetc(fp);
				if (ch == '=')
				{
					printf("%s\t$�����\n\n", Word);
				}
				else
				{
					fseek(fp, -1, 1);
					printf("%s\t$�����\n\n", Word);
				}
				break;

			case'<':ch = fgetc(fp);
				Word[1] = ch;
				if (ch == '=')
				{
					printf("%s\t$�����\n\n", Word); //�жϽ��Ϊ�������<=��
				}

				else if (ch == '<')
				{
					printf("%s\t$�����\n\n", Word); //�жϽ��Ϊ��<<��
				}

				else
				{
					fseek(fp, -1, 1);
					printf("%s\t$�����\n\n", Word); //�жϽ��Ϊ��<��
				}
				break;

			case'>':ch = fgetc(fp);
				Word[1] = ch;
				if (ch == '=') printf("%s\t$�����\n\n", Word);
				else
				{
					fseek(fp, -1, 1);
					printf("%s\t$�����\n\n", Word);
				}
				break;

			case'%':ch = fgetc(fp);
				Word[1] = ch;
				if (ch == '='){ printf("%s\t$�����\n\n", Word); }
				if (IsAlpha(ch)) printf("%s\t$���ͱ�ʶ��\n\n", Word);
				else
				{
					fseek(fp, -1, 1);
					printf("%s\t$ȡ�������\n\n", Word);
				}
				break;
			default:
				printf("�޷�ʶ���ַ�!\n\n");
				break;
			}
		}
	}
}
	int	main()
	{
		char in_fn[30];  //�ļ�·��              
		FILE *fp;
		printf("\n������Դ�ļ���������·���ͺ�׺����:");
		while (1){
			gets(in_fn);
			scanf("%s", in_fn);
			if ((fp = fopen(in_fn, "r")) != NULL)  break;  //��ȡ�ļ����ݣ��������ļ�ָ�룬��ָ��ָ���ļ��ĵ�һ���ַ�

			else printf("�ļ�·������!����������:");
		}
		printf("\n******************* �ʷ���������� *******************\n");
		do{
			ch = fgetc(fp);
			if (ch == '#')  break;      //�ļ���#��β����Ϊɨ���������

			else if (ch == ' ' || ch == '\t' || ch == '\n'){} //���Կո񣬿հף��ͻ���
			else{
				fseek(fp, -1, 1);          //����һ���ֽڿ�ʼʶ�𵥴���
				scanner(fp);
			}
		} while (ch != '#');
		return 0;
	}