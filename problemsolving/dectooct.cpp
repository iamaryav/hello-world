#include<stdio.h>
int main()
{
	int num,oct[100];
	printf("Enter no. to change : ");
	scanf("%d",&num);
	int i = 0;
	while(num!=0){
		oct[i] = num%8;
		i +=1;
		num = num/8; 
	}
	for(int j=i-1;j>=0;j--)
	{
		printf("%d",oct[j]);
	}
	
	return 0;
}
