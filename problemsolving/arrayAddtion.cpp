#include<stdio.h>
#include<stdlib.h>
int main(){
	int n,i;
	printf("Enter the size of array :");
	scanf("%d",&n);
	int *arr = (int*)malloc(n*sizeof(int));
	int *brr = (int*)malloc(n*sizeof(int));
	int *crr = (int*)malloc(n*sizeof(int));
	printf("Enter first array\n");
	for(i=0;i<n;i++){
		scanf("%d",(arr+i));
	}
	printf("Enter second array\n");
	for(i=0;i<n;i++){
		scanf("%d",(brr+i));
	}
	for(i=0;i<n;i++){
		*(crr+i) = *(arr+i) + *(brr+i);
	}
	printf("Addition is :\n");
	for(i=0;i<n;i++){
		printf("%d\t",*(crr+i));
	}
	return(0);
}
