#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<windows.h>
//void Jiao(int *a,int *b)
//{
//	int tmp = *a;
//	*a = *b;
//	*b = tmp;
//}
//void Show(int arr[])
//{
//	int i;
//	for (i = 0; i < 3; i++)
//	{
//		printf("%d ", arr[i]);
//	}
//	printf("\n");
//}
int main()
{
	int i;
	int arr1[3] = { 0 };
	int arr2[3] = { 0 };
	for (i = 0; i < 3; i++)
	{
		scanf("%d ", &arr1[i]);
	}
	for (i = 0; i < 3; i++)
	{
		scanf("%d ", &arr2[i]);
	}
	for (i = 0; i < 3; i++)
	{
		printf("%d ", arr1[i]);
	}
	for (i = 0; i < 3; i++)
	{
		printf("%d ", arr2[i]);
	}
	system("pause");
	return 0;
}

//	
//	for (i = 0; i < 3; i++)
//	{
//		Jiao(&arr1[i], &arr2[i]);
//	}
//	Show(arr1);
//	Show(arr2);
//	/*for (i = 0; i < 10; i++)
//	{
//		printf("%d ", arr1[i]);
//	}
//	printf("\n");
//	for (i = 0; i < 10; i++)
//	{
//		printf("%d ", arr2[i]);
//	}*/
//	system("pause");
//	return 0;
//}
//struct Stu
//{
//	char name[10];
//
//	char sex[20];
//	int age;
//};
//int main()
//{
//	struct Stu s = { "zhagsan", "男", 20 };
//	printf("%s %s %d\n",s.name,s.sex,s.age);
//	system("pause");
//	return 0;
//}
//#define ADD(x,y)((x)+(y))
//int main()
//{
//	int sum = ADD(2, 3);
//	printf("%d ", sum);
//	sum = 10 * ADD(2, 3);
//	printf("%d ", sum);
//	system("pause");
//	return 0;
//}
//int Find(int t,int arr[4][4])
//{
//	int c =3;//c列
//	int r=0;//r行  
//	while (c>= 0 && r < 4)
//	{
//		if (arr[r][c] < t)
//		{
//			r++;
//		}
//		else if (arr[r][c]>t)
//		{
//			c--;
//		}
//		else{
//			return 1;
//		}
//	}
//	return 0;
//}
//int main()
//{
//	int t;
//	int arr[4][4] = { 1, 2, 8, 92,4,9,12,4,7,10,13,6,8,11,15 };
//	printf("输入一个数：");
//	scanf("%d", &t);
//	Find(t, arr);
//	if (Find(t,arr)==1)
//	{
//		printf("有元素\n");
//	}
//	if (Find(t,arr)==0)
//	{
//		printf("没有\n");
//	}
//	system("pause");
//	return 0;
//}

//int main()
//{
//	int i,j,a=0;
//	for (i = 0; i < 2; i++)
//	{
//		for (j = 0; j < 4; j++)
//		{
//			if (j% 2)
//			     break;
//		    a++;
//		}
//		a++;
//	}
//	printf("%d\n", a);
//	system("pause");
//	return 0;
//}