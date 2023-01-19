// sum of factorial of all digit of a number is equal to the number itself
#include<iostream>
using namespace std;
bool KrishnamurthyNumber(int num)
{
	int i,fact,sum=0;
	int temp = num;
	while(num != 0)
	{
		int rem = num%10;
		fact = 1;
		for(i=1;i<=rem;i++)
		{
			fact *= i;
		}
		sum += fact;
		num /= 10;
	}
	if(temp == sum)
		return(true);
	else
		return(false);
}
int main()
{
	int num;
	cout<<"Enter a number :";
	cin>>num;
	bool val = KrishnamurthyNumber(num);
	if(val)
	{
		cout<<"No. is Krishnamurthy";
	}
	else
	{
		cout<<"No. is not Krishnamuthy";
	}
	return(0);
}
