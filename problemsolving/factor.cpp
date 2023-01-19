#include<stdio.h>
int main()
{
	int num1,i;
	scanf("%d",&num1);
	while(num1%2 == 0)
	{
		printf("2 ");
		num1 = num1/2;
	}
	for(i=3;i*i<=num1;i+=2)
	{
		while(num1%i==0)
		{
			printf("%d ",i);
			num1 = num1/i;
		}
	}
	if(num1>2)
		printf("%d",num1);
	
	return 0;
}
