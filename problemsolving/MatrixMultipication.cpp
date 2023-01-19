#include<stdio.h>
int main(){
	int a[10][10],b[10][10],c[10][10];
	int m,n,i,j,k,sum=0;
	printf("Enter the no. of row :");
	scanf("%d",&m);
	printf("Enter the no. of column :");
	scanf("%d",&n);
	printf("Enter first matrix :\n");
	for(i=0;i<m;i++){
		for(j=0;j<n;j++){
			scanf("%d",&a[i][j]);
		}
	}
	printf("Enter second matrix :\n");
	for(i=0;i<m;i++){
		for(j=0;j<n;j++){
			scanf("%d",&b[i][j]);
		}
	}
	for(i=0;i<m;i++){
		for(j=0;j<n;j++){
			sum=0;
			for(k=0;k<m;k++){
				sum += a[i][k]*b[k][j];
			}
			c[i][j]=sum;
		}
	}
	printf("The result matrix is \n");
	for(i=0;i<m;i++){
		for(j=0;j<n;j++){
			printf("%d ",c[i][j]);
		}
		printf("\n");
	}
	return(0);
}
