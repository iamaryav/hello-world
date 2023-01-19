#include<iostream>
#define max 25
using namespace std;
class Queue
{
	private:
		int arr[max],i,front,rear;
	public:
		Queue()
		{
			front = -1;
			rear = -1;
		}
		void insert(int val)
		{
			if(rear == max-1)
			{
				cout<<"Queue is full "<<endl;
			}
			else
			{
				rear += 1;
				arr[rear] = val;
			}
		}
		void del()
		{
			int val;
			if(front == rear)
			{
				cout<<"Queue is Empty "<<endl;
			}
			else
			{
				front += 1;
				val=arr[front];
				cout<<"value deleted :"<<val<<endl;
			}
		}
		void display()
		{
			int i;
			if(front == rear)
			{
				cout<<"Queue is empty "<<endl;
			}
			else
			{
				cout<<"Queue is :"<<endl;
				for(i = front+1;i<=rear;i++)
				{
					cout<<arr[i]<<"\t";
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
