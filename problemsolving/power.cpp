// program for finding power without using power function
#include<iostream>
using namespace std;
int power(int base,int pow)
{
	int i,mul;
	for(i=1;i<=pow;i++)
	{
		mul *= base;
	}
	return(mul);
}
int main()
{
	int base,pow;
	cout<<"Enter Base value :";
	cin>>base;
	cout<<"Enter exponent value :";
	cin>>pow;
	int val = power(base,pow);
	cout<<"value is :"<<val;
	return(0);
}
