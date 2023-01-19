#include<stdio.h>
int checkPrime(int);
int main()
{
	long long int num1,num2,i,count=0;
	scanf("%lld %lld",&num1,&num2);
	
	for(i=num1;i<=num2 && i+6<=num2;i++)
	{
		if(checkPrime(i))
		{
			if(checkPrime(i+6))
			{
				count++;
			}
		}
	}
	printf("%lld",count);
	return 0;
}

int checkPrime(int num)
{
	int i,c=1;
	if(num<1)
	{
		return 0;
	}
	for(i=2;i*i<=num;i++)
	{
		if(num%i==0)
		{
			c=0;
			break;
		}
	}
	if(c)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

