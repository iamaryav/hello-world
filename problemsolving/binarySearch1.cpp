#include<stdio.h>
#include<stdlib.h>
int binarySearchRec(int*,int,int,int);
int binarySearch(int*,int,int,int);
int main()
{
	int n,val;
	printf("Enter size of array\n");
	scanf("%d",&n);
	int *arr = (int*)malloc(n*sizeof(int));
	printf("Enter sorted array\n");
	for(int i=0;i<n;i++)
	{
		scanf("%d",arr+i);
	}
	printf("Enter value for search\n");
	scanf("%d",&val);
	//int index = binarySearch(arr,0,n-1,val);
	int index = binarySearchRec(arr,0,n-1,val);
	
	if(index)
	{
		printf("Value found at position %d \n",index);
	}
	else
	{
		printf("This vlaue is not present in array\n");
	}
	
	return 0;
}

int binarySearch(int *arr,int l,int u, int val)
{
	int mid = (l+u)/2;
	while(l<u && *(arr+mid) != val)
	{
		if(val<*(arr+mid))
		{
			u = mid-1;
		}
		else
			l = mid+1;
		
		mid = (l+u)/2;
	}
	
	if(*(arr+mid) == val)
	{
		return mid+1;
	}
	
	return 0;
}
int binarySearchRec(int *arr,int l, int u, int val)
{
	int mid = (l+u)/2;
	if(*(arr+mid) == val)
		return mid+1;
	while(l<=u)
	{
		if(val<*(arr+mid))
		{
			return binarySearchRec(arr,l,mid-1,val);
		}
		else
		{
			return binarySearchRec(arr,mid+1,u,val);	
		}
	}
	
	return(0);
}
