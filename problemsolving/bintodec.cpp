#include<stdio.h>
#include<math.h>
#include<stdlib.h>
int main()
{
	int num=0,p=0;
	int n;
	printf("Enter digit in binary : ");
	scanf("%d",&n);
	int *arr = (int*)malloc(n*sizeof(int));
	for(int i=0;i<n;i++)
		scanf("%d",&arr[i]);
	for(int i=n-1;i>=0;i--)
	{
		num = num+(*(arr+i))*pow(2,p);
		p++;
	}
	printf("Decimal number is :%d ",num);
	return 0;
}
