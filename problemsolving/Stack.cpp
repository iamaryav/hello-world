#include<conio.h>
#include<iostream>
using namespace std;
class Stack
{
	private:
		int a[100],max;
		int top;
	public:
		Stack(int max)
		{
			this->max = max;
			top = -1;
		}
		void push(int val)
		{
			if(top == max-1)
			{
				cout<<"Stack overflow"<<endl;
			}
			else
			{
				top = top + 1;
				a[top] = val;
				cout<<"Value inserted \n"<<endl;
			}
		}
		int pop()
		{
			if(top == -1)
			{
				cout<<"Stack is empty"<<endl;
				return(0);
			}
			else
			{
				int val;
				val = a[top];
				top = top - 1;
				return (val);
			}
		}
		void display()
		{
			int i;
			if(top==-1)
			{
				cout<<"Stack is empty"<<endl;
			}
			else
			{
			
				for(i=0;i<=top;i++)
				{
					cout<<a[i]<<"\t";
				}
				cout<<endl;
			}
		}
};
int main()
{
	int val,ch,max;
	cout<<"Enter size of Stack"<<endl;
	cin>>max;
	Stack s1(max);
	while(1)
	{
		cout<<"press 1 for push value\npress 2 for pop value\npress 3 for display\npress 4 exit "<<endl;
		cin>>ch;
		switch(ch)
		{
			case 1:cout<<"Enter value :";
			       cin>>val;
			       s1.push(val);
			       break;
			case 2:val=s1.pop();
			       cout<<"Value deleted :"<<val<<endl;
			       break;
			case 3:s1.display();
			       break;
			case 4:exit(0);
			
			default:cout<<"Invalid selection \n"<<endl;
		}
	}
	getch();
	return(0);
}















