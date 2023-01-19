#include<stdio.h>
#include<stdlib.h>
int main()
{
	int pos,n,val,flag=0;
	printf("Enter size of array\n");
	scanf("%d",&n);
	
	int *arr = (int*)malloc(n*sizeof(int));
	printf("Enter array\n");
	for(int i=0;i<n;i++)
	{
		scanf("%d",arr+i);
	}
	printf("Enter value for search\n");
	scanf("%d",&val);
	for(int i =0;i<n;i++)
	{
		if(*(arr+i)==val)
		{
			flag = 1;
			pos = i;
		}
	}
	if(flag)
	{
		printf("value found at position\n%d",pos+1);
	}
	else
		printf("value not found in array\n");
	
	return 0;
	
}
