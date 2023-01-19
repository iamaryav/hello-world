#include<stdio.h>
#include<math.h>
double SquareRoot(int num)
{
	double a,lb=0,ub=num;
	a=(lb+ub)/2;
	int count=50;
	while(count!=0){
	if(fabs(a*a-num)<0.0001){
		return(a);	
	}
	else if(a*a>num)
	{
		ub=a;
	}
	else{
		lb=a;
	}
	a=(lb+ub)/2;
	count--;
}
}
int main()
{
	int num;
	double res;
	printf("Enter a no for finding square root: ");
	scanf("%d",&num);
	res=SquareRoot(num);
	printf("\n Square Root is : %lf",res);
	return(0);
}
