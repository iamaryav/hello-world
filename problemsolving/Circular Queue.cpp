//Program for circular queue
#include<iostream>
#define max 5
using namespace std;
class Queue
{
	private:
		int arr[max],i,front,rear;
	public:
		Queue()
		{
			front = 0;
			rear = -1;
		}
		void insert(int val)
		{
			if((rear == max-1 && front == 0) || (rear == front-1 && rear>-1))// condition for finding full circilar queue
			{
				cout<<"Queue is full "<<endl;
			}
			else
			{
				rear = (rear+1)%max;//expression for inserting data in circular way
				arr[rear] = val;
			}
		}
		void del()
		{
			int val;
			if(rear <= -1)
			{
				cout<<"Queue is Empty "<<endl;
			}
			else
			{
				val=arr[front];
				if(front == rear)
				{
					front = 0;
					rear = -1;
				}
				else
				{
					front = (front+1)%max;
				}
				cout<<"value deleted :"<<val<<endl;
			}
		}
		void display()// display is very important in circular queue
		{
			int i;
			if(rear<=-1)
			{
				cout<<"Q is empty "<<endl;
			}
			else
			{
				cout<<"Q is :"<<endl;
				if(rear>front)
				{
					for(i = front;i<=rear;i++)
					{
						cout<<arr[i]<<"\t";
					}
				}
				else// Printing value when rear is less than front 
				{
					i = front;
					do
					{
						cout<<arr[i]<<"\t";
						i = (i+1)%max;//For printing value in circular way
					}while(i != (rear+1));
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
			case 2:q1.del();
				   break;
			case 3:q1.display();
				   break;
			case 4:exit(1);
			
			default:cout<<"Invalid selection ";
			       
		}
	}
}
