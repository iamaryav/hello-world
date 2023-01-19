/*
Ceaser cipher encryption
*/
#include<iostream>
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

using namespace std;
void encrypt(char[],int);
void decrypt(char[],int);
int main()
{
	int dec,i,len,ch;
	char msg[30];
	cout<<"Enter length of message\n";
	cin>>len;
	printf("Enter a message for encrypt or decrypt\n");
	//for(i=0;i<len;i++)
	fflush(stdin);
	gets(msg);
	
	while(true)
	{
	cout<<"\nPress 1 for encrypt \nPress 2 for decrypt\npress 3 for exit\n";
	cin>>ch;
	switch(ch)
	{
		case 1:encrypt(msg,len);
			   break;
		case 2:decrypt(msg,len);
		       break;
		case 3:exit(0);
		
		default:cout<<"Invalid selection";
		         break;
	}
}
	getch();
	return(0);
}
void encrypt(char msg[],int len)
{
	int i;
	cout<<"Encrypted message\n";
	for(i=0;i<len;i++)
	cout<<char(int(msg[i])+5);
}
void decrypt(char msg[],int len)
{
	int i;
	cout<<"Decrypted message\n";
	for(i=0;i<len;i++)
	{
		cout<<char(int(msg[i])-5);
	}
}

