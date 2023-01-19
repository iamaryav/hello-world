#include<stdio.h>
int main()
{
	int num,i,temp,bin[100];
	printf("Enter number to change :");
	scanf("%d",&num);
	while(num!=0)
	{
		bin[i++] = num%2;
		num = num/2;
	}
	for(int j=i-1;j>=0;j--)
	{
		printf("%d",bin[j]);
	}
	return 0;
}
