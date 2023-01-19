#include<stdio.h>

int gcd(int a,int b)
{
	if(a%b==0)
		return b;
	else
		return (b,a%b);
}
int main()
{
	int a,b;
	printf("Enter value dividend\n");
	scanf("%d",&a);
	printf("Enter value of divisor\n");
	scanf("%d",&b);
	int sol = gcd(a,b);
	printf("GCD = %d",sol);
	return 0;
}
