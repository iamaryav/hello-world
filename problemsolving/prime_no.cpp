#include<stdio.h>
#include<conio.h>
int main()
{
	int num,i,flag=1;
	printf("Enter a no. for checking :");
	scanf("%d",&num);
	for(i=2;i*i<=num;i++)
	{
		if(num%i == 0)
		{
			flag = 0;
			break;
		}
	}
	flag==1 ? printf("No. is prime \n") : printf("No. is not prime \n");
	getch();
}
