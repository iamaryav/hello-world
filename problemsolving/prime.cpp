#include<stdio.h>
int main()
{
	int num,flag=1;
	printf("Enter no. to check\n");
	scanf("%d",&num);
	for(int i=2;i*i<=num;i++)
	{
		if(num%i==0)
		{
			flag = 0;
			break;
		}
	}
	if(flag)
	{
		printf("No. is prime\n");
	}
	else
		printf("No. is not prime\n");
}
