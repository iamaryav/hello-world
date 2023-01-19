#include<iostream>
#include<conio.h>
using namespace std;
int main()
{
	int num,i=0,rem,j;
	int a[100];
	cout<<"Enter a no.\n";
	cin>>num;
	while(num!=0)
	{
		rem=num%2;
		a[i++]=rem;
		num=num/2;
	}
	for(j=i-1;j>=0;j--)
	{
		cout<<a[j];
	}
	return(0);
}
