#include<stdio.h>
int main(){
	
	int n,i;
	int *x;
	printf("Enter a value\n");
	scanf("%d",&n);
	x=&n;
	printf("Address is : %u",x);
	printf("\nValue is :%d",*x);
	return(0);
	
}
