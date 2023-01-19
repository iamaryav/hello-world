#include<stdio.h>
int main()
{
	int num,prev,next,temp;
	printf("print no. up to you want to print fibonacci series\n");
	scanf("%d",&num);
	printf("1 ");
	prev = 0;
	next =1;
	temp = 0;
	for(int i=0;i<num-1;i++)
	{
		temp = prev ;
		prev = next;
		next = next+temp;
		printf("%d ",next);
	}
	
	return 0;
}
