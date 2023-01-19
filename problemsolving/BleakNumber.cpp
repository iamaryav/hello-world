// Program for finding bleak no.
#include<iostream>
#include<conio.h>
using namespace std;
int CountBits(int num)
{
	unsigned int count = 0;
	while(num)
	{
		num &= (num-1);
		count += 1;
	}
	return(count);
}
bool IsBleak(int num)
{
	for(int x = 1;x<num; x++)
	{
		if(CountBits(x)+x==num)
	 		return false;
	}
	return true;
}
int main()
{
	int num;
	cout<<"Enter a no.:";
	cin>>num;
	IsBleak(num)?cout<<"Bleak No." : cout<<"Not Bleak No.";

}
