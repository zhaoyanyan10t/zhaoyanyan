#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<windows.h>
int mao(int arr[], int len)
{
	int i, j, hu, count = 0;
	for (i = 1; i < len; i++)//����
	{
		for (j = 0; j<len - 1; j++)//�ӵ�һ������ʼ���У������Ǵ�0���±꿪ʼ��
		{
			if (arr[j]>arr[j + 1])
			{
				hu = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = hu;
				count++;
			}
		}

	}
	for (i = 1; i <len; i++){
		printf("%d ", arr[i]);

	}

}
int main()
{
	int arr[] = { 12, 51, 5, 1, 9 };
	int len = sizeof(arr) / sizeof(arr[0]);
	mao(arr, len);
	system("pause");
	return 0;
}