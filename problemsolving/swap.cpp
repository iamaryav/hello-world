#include<stdio.h>
void swap(int, int);
void swapw(int, int);
void swapp(int*,int*);
int main()
{
	int a,b;
	printf("Enter a : ");
	scanf("%d",&a);
	printf("Enter b : ");
	scanf("%d",&b);
	swap(a,b);
	swapw(a,b);
	swapp(&a,&b);
	printf("a = %d \n b = %d\n",a,b);
	return(0);
}
void swap(int a, int b)
{
	int temp;
	temp = a;
	a = b;
	b = temp;
	printf("a = %d \n b = %d \n",a,b);
}
void swapw(int a, int b)
{
	a = a+b;
	b = a-b;
	a = a-b;
	printf("a = %d \n b = %d \n",a,b);
}
void swapp(int *a,int *b)
{
	*a = *a+*b;
	*b = *a-*b;
	*a = *a-*b;
}

