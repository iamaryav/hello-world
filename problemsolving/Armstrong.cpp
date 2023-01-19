#include<stdio.h>
#include<math.h>
int main(){
	
	int count=0,num,num1,temp,sum=0;
	printf("Enter no. ");
	scanf("%d",&num);
	temp = num;
	num1 = num;
	while(temp!=0)
	{
		count++;
		temp = temp/10;
	}
	while(num!=0)
	{
		temp = num%10;
		sum = sum+pow(temp,count);
		num = num/10;	
	}
	if(num1 == sum)
		printf("Armstrong no. ");
	else
		printf("not Armstrong no. ");

}
