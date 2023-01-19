#include<stdio.h>
int main()
{
	char alphabet = 'A',input;
	int i,j;
	printf("Enter the character you want to print at the last row\n");
	scanf("%c",&input);
	for(int i=1;i<=(input-'A'+1);i++)
	{
		for(j=1;j<=i;j++)
		{
	
		printf("%c",alphabet);
		}
		printf("\n");
		alphabet++;
	}
}
