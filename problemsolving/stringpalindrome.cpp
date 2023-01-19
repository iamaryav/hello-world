#include<stdio.h>
#include<string.h>
int main()
{
	char str[30],cstr[30];
	printf("Enter String : ");
	scanf("%s",str);
	strcpy(cstr,str);
	strrev(cstr);
	if(!strcmp(str,cstr))
		printf("String is palindrome");
	else
		printf("String is not palindrome");
}
