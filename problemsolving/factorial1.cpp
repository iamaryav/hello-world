#include<stdio.h>
#include<iostream>

using namespace std;

long int factorial(long int, long int);

int main(){
	
	long int n, val=1, mul = 1;
	int i;
	
	printf("Enter a number for factorial :");
	scanf("%ld",&n);
	
	//long int res = factorial(n, val);
	
	for(i=1;i<=n;i++){
		
		mul = mul*i;
	}
	
	printf("Factorial = %ld", mul);
	
	return(0);
}

/*long int factorial(long int n)
{
	if(n==1 || n==0){
		return 1;
	}
	else{
		return n*factorial(n-1);
	}
}*/

/* long int factorial(long int n){
	
	while(n>0){
		return n*factorial(n-1);
	}
	return 1;
} */

/* long int factorial(long int n, long int val){
	
	if(n==0 || n==1){
		return val;
	}
	else{
		return factorial(n-1,n*val);
	}
} */
