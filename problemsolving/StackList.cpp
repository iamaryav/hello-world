#include<conio.h>
#include<iostream>
#include<stdlib.h>
using namespace std;
class Stack
{
	private:
		Stack *head,*next,*p,*m,*nw;
		int data;
	public:
		Stack()
		{
			head = NULL;
		}
		void push(int val)
		{
			//List *p,*m;
			p=head;
			nw = (Stack *)malloc(sizeof(Stack));
			nw->data=val;
			nw->next=NULL;
			if(head == NULL)
			{
			  head=nw;	
			}
			else
			{
				while(p->next != NULL)
				{
					m=p;
					p=p->next;
				}
				p->next=nw;
			}
		}
		int pop()
			{
				//Stack *p,*m;
				int val;
				p = head;
				if(head == NULL)
				{
					cout<<"Stack is already empty\n";
					return(0);
				}
				else
				{
					while(p->next != NULL)
					{
						m=p;
						p=p->next;
					}
					val = p->data;
					m->next=NULL;
					free(p);
				}
				return(val);
			}
			void display()
			{
				//Stack *p;
				p=head;
				if(head == NULL)
				{
					cout<<"Stack is empty :";
				}
				else
				{
					while(p != NULL)
					{
						cout<<p->data<<"\t";
						p=p->next;
					}
				}
			}
};
int main()
{
	int val,ch;
	Stack s1;
	while(1)
	{
		cout<<"\npress 1 for push value\npress 2 for pop value\npress 3 for display\npress 4 exit "<<endl;
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

