//Evaluation of postfix expression
#include<stdio.h>
#include<ctype.h>
#include<math.h>
#define max 25
int arr[max];
int top = -1;
void push(int val)
{
	arr[++top] = val;
	/*top = top +1;
	arr[top] = val;*/
}
int pop()
{
	 return(arr[top--]);
	 /*int val;
	 val = arr[top];
	 top = top-1;
	 return(val);*/
}
int main()
{
	char expr[30];
	int i=0,a,b;
	char ch;
	printf("Enter expression\n");
	scanf("%s",expr);
	while((ch=expr[i])!='\0')
	{
		if(isdigit(ch))
		{
			push(ch-'0');
		}
		else
		{
			b=pop();
			a=pop();
			switch(ch)
			{
				case '+':push(a+b);
						 break;
				case '-':push(a-b);
						 break;
				case '*':push(a*b);
						 break;
				case '/':push(a/b);
						 break;
				case '^':push(pow(a,b));
						 break;
			}
		}
		i++;
	}
	printf("The solution of the equation is :%d",arr[top]);
}
