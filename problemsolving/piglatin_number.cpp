// Piglatin no. or string palindrome
#include<iostream>
#include<conio.h>
#include<stdio.h>
#include<string.h>
using namespace std;
int main()
{
	char ch[20];
	cout<<"Enter string to be checked :"<<endl;
	scanf("%s",ch);
	char cpy[20];
	strcpy(cpy,ch);
	strrev(cpy);
	//printf("\n%s\n",cpy);
	strcmp(cpy,ch) ? printf("It is not piglatin no. \n") : printf("It is piglatin no. \n");
}
