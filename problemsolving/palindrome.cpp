#include<stdio.h>
int reverse(int);
int main(){
	
	int num,num1;
	printf("Please enter a no to check :");
	scanf("%d",&num);
	num1= num;
	int rev=reverse(num);
	if(rev == num1)
		printf("Palindrome Number");
	else
		printf("Not Palindrome no.");
	
}

int reverse(int num){
	
	int temp=0,mod;
	while(num!=0)
	{
		mod = num%10;
		temp = temp*10+mod;
		num = num/10;
	}
	
	return temp;
}
