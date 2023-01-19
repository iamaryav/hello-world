#include <stdio.h>
int main()
{
	int a[4][4], sum = 0, row, col;
	printf("Enter the no of row\n");
	scanf("%d", &row);
	printf("Enter the no. of column\n");
	scanf("%d", &col);
	printf("Enter the array\n");
	for (int i = 0; i < row; i++)
	{
		for (int j = 0; j < col; j++)
		{
			scanf("%d", &a[i][j]);
		}
	}
	for (int i = 0; i < row; i++)
	{
		for (int j = 0; j < col; j++)
		{
			if (i == 0)
			{
				sum += a[i][j];
			}
			if (i == row - 1)
			{
				sum += a[i][j];
			}
			if (j == 0 && i > 0 && i < row - 1)
			{
				sum += a[i][j];
			}
			if (j == col - 1 && i > 0 && i < row - 1)
			{
				sum += a[i][j];
			}
		}
	}
	printf("%d", sum);
	return 0;
}
