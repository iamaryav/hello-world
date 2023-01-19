// Representation of Complete Binary Tree using Array
#include<conio.h>
#include<iostream>
using namespace std;
class BinTree
{
	private:
		char a[100];
		int i,nodes;
	public:
		BinTree()
		{
			i = 0;
		}
		void takeInput(int nodes)
		{
//			while(i < nodes) // Trying this loop for make user friendly environment
//			{
//				if(i == 0)
//				{
//					cout<<"Enter Root node \n";
//					cin>>a[i++];
//				}
//				else if(i%2 != 0)
//				{
//					cout<<"Enter left child :"<<a[i-2]<<endl;
//					cin>>a[i++];
//				}
//				else
//				{
//					cout<<"Enter Right child :"<<a[i-2]<<endl;
//					cin>>a[i++];
//				}
//			}
			cout<<"Enter name of nodes in character\n";
			for(i=0;i<nodes;i++)
			{
				cin>>a[i];
			}
		}
		void display(int nodes)
		{
			for(i=0;i<nodes;i++)
			{
				cout<<a[i]<<"\t";
			}
			cout<<endl;
		}
};
int main()
{
	BinTree b1;
	int ch,nodes;
	char val;
	while(1)
	{
		cout<<"Press 1 for enter tree \nPress 2 for display\nPress 3 for Exit\n";
		cin>>ch;
		switch(ch)
		{
			case 1:cout<<"Enter no. of nodes\n";
			       cin>>nodes;
			       b1.takeInput(nodes);
			       cout<<"Value Inserted \n";
			       break;
			case 2:b1.display(nodes);
			 	   break;
			case 3:exit(0);
			
			default:cout<<"Invalid selection \n";
		}
		
	}
	getch();
	return(0);
}
