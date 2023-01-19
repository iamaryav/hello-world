#include<stdio.h>
#include<math.h>
int main()
{
	int num,count=0,sum=0;
	printf("Enter binary number : ");
	scanf("%d",&num);
	while(num !=0)
	{
		int temp = num%10;
		sum += temp*pow(2,count);
		count++;
		num = num/10;
	}
	printf("Decimal no. is : %d",sum);
	return 0;
}
