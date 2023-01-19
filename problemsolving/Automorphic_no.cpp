//Automorphic no.
#include<iostream>
#include<conio.h>
#include<math.h>
using namespace std;
int main()
{
	int num,temp,sqr,check=0,i=0,mul;
	cout<<"Enter a num to checked \n";
	cin>>num;
	temp = num;
	sqr = pow(num,2);
	while(temp != 0)
	{
		temp /= 10;
		mul = sqr%10;
		check = check+pow(10,i++)*mul;
		sqr /= 10;
	}
	check == num ? cout<<"No. is Automorpic \n" : cout<<"No. is not Automorhic \n";
	getch();
	return(0);
}
