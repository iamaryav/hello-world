#include<conio.h>
#include<iostream>
using namespace std;
int size;
class Array
{
	private:
	int a[100];
	public:
		void input()
		{
			int i;
			for(i=0;i<size;i++)
			{
				cin>>a[i];
			}
		}
		void insert(int pos,int val)
		{
			int i;
			size=size+1;
			for(i=size-1;i>=pos;i--)
			{
				a[i]=a[i-1];
			}
			a[i]=val;
		}
		void deletion(int pos)
		{
			int i;
			for(i=pos-1;i<size-1;i++)
			{
				a[i]=a[i+1];
			}
			size=size-1;
		}
		void display()
		{
			cout<<"value is :\n";
			int i;
			for(i=0;i<size;i++)
			{
				cout<<a[i]<<"\t";
			}
		}
};
int main()
{
	int ch,pos,val;
	cout<<"Enter the size of array\n";
	cin>>size;
	Array a1;
	while(1)
	{
	cout<<"\nPress 1 for take input\npress 2 for insert an element\npress 3 delete an element\npress 4 display\npress 5 for exit"<<endl;
	cin>>ch;
	switch(ch)
	{
		case 1:cout<<"Enter input of an array\n";
		       a1.input();
		       cout<<"Input taken :\n";
		       break;
		case 2:cout<<"Enter position where you want enter data\n";
		       cin>>pos;
		       cout<<"Enter value :";
		       cin>>val;
		       a1.insert(pos,val);
		       cout<<"Value Inserted :\n";
	    	   break;
		case 3:cout<<"Enter position where you want to delete data :";
		       cin>>pos;
		       a1.deletion(pos);
		       cout<<"Value deleted :\n";
		       break;
		case 4:a1.display();
		       break;
		case 5:exit(0);
		
		default:cout<<"Invalid Selection\n";
		       
	}
}
getch();
return(0);	
}
	
	
	
	
	
