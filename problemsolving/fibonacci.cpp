#include<stdio.h>
int fib(int);
int main(){
	
	int num;
	printf("Enter no up to you want to print series\n");
	scanf("%d",&num);
	for(int i =0 ;i<=num;i++)
	{
		int val = fib(i);
		printf("%d\t",val);
	}
	return 0;
}
int fib(int num)
{
	if(num == 0 || num == 1)
		return 1;
	else
		return(fib(num-1)+fib(num-2));
}
