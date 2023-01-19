// Program for Radix sort
#include<iostream>
#include<math.h>
#define max 25
int arr[max];
void printarr(int);
void radsort(int,int);
using namespace std;
int main()
{
	int i,n,num,l;
	cout<<"Enter the no. of elements :"<<endl;
	cin>>n;
	for(i=0;i<n;i++)
	{
		cout<<"Enter Number "<<i<<":";
		cin>>arr[i];
	}
	cout<<"The unsorted array is :"<<endl;
	printarr(n);
	for(i=0;i<n;i++)
	{
		l=0;
		num = arr[i];
		while(num != 0)
		{
			num /= 10;
			l++;
		}
	}
	radsort(n,l);
	cout<<"The sorted array is :"<<endl;
	printarr(n);
	return(0);
}
void printarr(int n)
{
	int i;
	for(i=0;i<n;i++)
	{
		cout<<arr[i]<<"\t";
	}
	cout<<endl;
}
void radsort(int n,int l)
{
	 int front[20],rear[20];
	 struct
	 {
	 	int info,next;
	 }node[max];
	 int exp,first,i,j,k,p,q,y;
	 for(i=0;i<n-1;i++)
	 {
	 	node[i].info = arr[i];
	 	node[i].next = i+1;
	 }
	 node[n-1].info = arr[n-1];
	 node[n-1].next = -1;
	 first = 0;
	 for(k=1;k<n;k++)
	 {
	 	for(i=0;i<10;i++)
	 	{
	 		front[i] = -1;
	 		rear[i] = -1;
		}
		while(first != -1)
		{
			p = first;
			first = node[first].next;
			y = node[p].info;
			exp = pow(10,k-1);
			j = (y/exp)%10;
			q = rear[j];
			if(q==-1)
				front[j] = p;
			else
				node[q].next = p;
			rear[j] = p;
		}
		for(j=0;j<10 && front[j]==-1;j++);
		first = front[j];
		while(j<=9)
		{
			for(i=j+1;i<10 && front[i]==-1;i++);
			if(i<=9)
			{
				p = i;
				node[rear[j]].next = front[i];
			}
			j = i;
		}
		node[rear[p]].next = -1;
	 }
	 for(i=0;i<n;i++)
	 {
	 	arr[i] = node[first].info;
	 	first = node[first].next;
	 }
	 
}
