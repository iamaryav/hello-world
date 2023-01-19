#include<iostream>
#include<Stdlib.h>
using namespace std;
class Queue
{
		private:
		Queue *head,*next,*p,*m,*nw;
		int data;
	public:
		Queue()
		{
			head = NULL;
		}
		void insert(int val)
		{
			//List *p,*m;
			p=head;
			nw = (Queue *)malloc(sizeof(Queue));
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
		void delBeg()
			{
				//List *p,*m;
				int val;
				p = head;
				if(head == NULL)
				{
					cout<<"List is already empty\n";
				}
				else
				{
					val = head->data;
					head=head->next;
					free(p);
					cout<<"Value is deleted "<<endl;
				}
			}
			void display()
			{
				p = head;
				if(head == NULL)
				{
					cout<<"Queue is Empty "<<endl;
				}
				else
				{
					while(p != NULL)
					{
						cout<<p->data<<"\t";
						p = p->next;
					}
					cout<<endl;
				}
			}
};
int main()
{
	int val,ch;
	Queue q1;
	while(1)
	{
		cout<<"Press 1 for insert a value \npress 2 for delete a value \npress 3 for display a queue \nPress 4 for exit "<<endl;
		cin>>ch;
		switch(ch)
		{
			case 1:cout<<"Enter value for insertion :"<<endl;
				   cin>>val;
				   q1.insert(val);
				   cout<<"Value Inserted"<<endl;
				   break;
			case 2:q1.delBeg();
				   break;
			case 3:q1.display();
				   break;
			case 4:exit(1);
			
			default:cout<<"Invalid selection ";
			       
		}
	}
}
