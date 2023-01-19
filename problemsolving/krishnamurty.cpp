#include<stdio.h>
int main()
{
	int num,sum=0,fact=1,temp,num1,i;
	printf("Enter no. : ");
	scanf("%d",&num);
	num1 = num;
	while(num!=0)
	{
		fact=1;
		temp = num%10;
		for(i=1;i<=temp;i++)
		{
			fact = fact*i;
		}
		sum=sum+fact;
		num = num/10;
	}
	if(num1 == sum)
		printf("Krishnamurty no. :");
	else
		printf("Not km no.");
		
	return 0;
}
