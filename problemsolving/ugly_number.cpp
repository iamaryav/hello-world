#include<iostream>
#include<conio.h>
using namespace std;
int main()
{
	int num;
	cout<<"Enter a no. to be checked :"<<endl;
	cin>>num;
	if((num%2)==0 || (num%3)==0 || (num%5)==0)
	{
		cout<<"no. is ugly :"<<endl;
	}
	else
	{
		cout<<"no. is not ugly :"<<endl;
	}
	getch();
	return(0);
}
