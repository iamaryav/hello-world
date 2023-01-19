// program for selection sort
#include<iostream>
using namespace std;
int minm(int a[],int i,int size)
{
	int min = i;
	for(;i<size;i++)
	{
		if(a[min]>a[i])
			min = i;
	}
	return(min);
}
void swap(int *a,int *b)
{
	int temp = *a;
	*a = *b;
	*b = temp;
}
void selectionSort(int a[],int size)
{
	int i,min,j,index;
	//unsigned int count = 0;
	for(i=0;i<size;i++)
	{
		int min = minm(a,i,size);
		swap(&a[i],&a[min]);
	}
	//cout<<"No. of comparision :"<<count<<endl;
}
int main()
{
	int a[20],size;
	cout<<"Enter size of array :";
	cin>>size;
	cout<<"Enter array"<<endl;
	for(int i=0;i<size;i++)
	{
		cin>>a[i];
	}
	selectionSort(a,size);
	for(int i=0;i<size;i++)
	{
		cout<<a[i]<<"\t";
	}
	return(0);
}
