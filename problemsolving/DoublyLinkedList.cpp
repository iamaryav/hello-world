// Program for Doubly linked List
#include<conio.h>
#include<iostream>
#include<stdlib.h>
using namespace std;
class List;
List *head=NULL,*nw,*p,*m;
class List
{
	private:
    	int data;
		List *next,*prev;
	public:
		void insBeg(int val)
		{
			nw = (List*)malloc(sizeof(List));
			nw->data=val;
			nw->next=NULL;
			nw->prev=NULL;
			if(head == NULL)
			{
			  head=nw;	
			}
			else
			{
				nw->next=head;
				head=nw;
			}
		}
		void insEnd(int val)
		{
			//List *p,*m;
			p=head;
			nw = (List *)malloc(sizeof(List));
			nw->data=val;
			nw->next=NULL;
			nw->prev=NULL;
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
				nw->prev=p;
			}
		}
		void insPos(int pos,int val)
		{
			//List *p,*m;
			int c=1;
			p=head;
			nw = (List *)malloc(sizeof(List));
			nw->data=val;
			nw->next=NULL;
			nw->prev=NULL;
			if(head == NULL)
			{
			  head=nw;	
			}
			else
			{
				while(p->next != NULL && c<pos)
				{
					m=p;
					p=p->next;
					c++;
				}
				nw->next=p;
				p->prev=nw;
				m->next=nw;
				nw->prev=m;
			}
		}
			int delBeg()
			{
				//List *p,*m;
				int val;
				p = head;
				if(head == NULL)
				{
					cout<<"List is already empty\n";
					return(0);
				}
				else
				{
					val = head->data;
					head=head->next;
					free(p);
				}
				return(val);
			}
		int delEnd()
			{
				//List *p,*m;
				int val;
				p = head;
				if(head == NULL)
				{
					cout<<"List is already empty\n";
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
			int delPos(int pos)
			{
				//List *p,*m;
				int val,c=1;
				p = head;
				if(head == NULL)
				{
					cout<<"List is already empty\n";
					return(0);
				}
				else
				{
					while(p->next != NULL && c<pos)
					{
						m=p;
						p=p->next;
						c++;
					}
					val = p->data;
					m->next=p->next;
					free(p);
				}
				return(val);
			}
			void display()
			{
				//List *p;
				p=head;
				if(head == NULL)
				{
					cout<<"List is empty :";
				}
				else
				{
					while(p != NULL)
					{
						cout<<p->data<<"\t";
						p=p->next;
					}
					cout<<endl;
				}
			}
};
int main()
{
	int ch,pos,val;
	List l;
	while(1)
	{
		cout<<"\npress 1 for insert at begining\npress 2 for insert at end\npress 3 for insert at pos\npress 4 for delete at begining\npress 5 for delete at end\npress 6 for delete at any position\npress 7 for display\npress 8 for exit \n";
		cin>>ch;
	switch(ch)
	{
		case 1:cout<<"Enter value :";
		       cin>>val;
		       l.insBeg(val);
		       cout<<"Value inserted \n";
		       break;
		case 2:cout<<"Enter value :";
		       cin>>val;
		       l.insEnd(val);
		       cout<<"Value inserted \n";
		       break;
		case 3:cout<<"Enter Position :";
		       cin>>pos;
		       cout<<"Enter value :";
		       cin>>val;
		       l.insPos(pos,val);
		       cout<<"Value inserted \n";
		       break;
		case 4:l.delBeg();
		       cout<<"value deleted :"<<endl;
		       break;
		case 5:l.delEnd();
		       cout<<"value deleted :"<<endl;
		       break;
		case 6:cout<<"Enter postion where you want to delete value :";
		       cin>>pos;
		       l.delPos(pos);
		       cout<<"value deleted :"<<endl;
		       break;
		case 7:cout<<"Value is :\n";
		       l.display();
		       break;
		
		case 8:exit(0);
		
		default:cout<<"Invalid selection \n";
		       
	}
}
	getch();
	return(0);
}
