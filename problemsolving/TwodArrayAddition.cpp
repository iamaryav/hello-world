#include<stdio.h>
#include<stdlib.h>
int main(){
	int m,n,i,j,*x;
	printf("Enter number of rows :");
	scanf("%d",&m);
	printf("Enter number of columns :");
	scanf("%d",&n);
	int **arr = (int**) malloc(m*sizeof(int*));
	for(i=0;i<m;i++)
	{
		*(arr+i)=(int*)malloc(n*sizeof(int));
		
	}
	int **brr = (int**) malloc(m*n*sizeof(int*));
	for(i=0;i<m;i++)
	{
		*(brr+i)=(int*)malloc(n*sizeof(int));
		
	}	
	int **crr = (int**) malloc(m*n*sizeof(int*));
	for(i=0;i<m;i++)
	{
		*(crr+i)=(int*)malloc(n*sizeof(int));
		
	}
	printf("Enter element of first array\n");
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++){
			scanf("%d",(*(arr+i)+j));
		}
	}
	printf("Enter element of second array\n");
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++){
			scanf("%d",(*(brr+i)+j));
		}
	}
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++){
			
			*(*(crr+i)+j) = *(*(arr+i)+j) + *(*(brr+i)+j);
		}
	}
	printf("Addition of two matrix\n");
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++){
			printf("%d\t",*(*(crr+i)+j));
		}
		printf("\n");
	}
	return(0);
}
