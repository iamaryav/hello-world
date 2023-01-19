#include<iostream>
#include<stdlib.h>
using namespace std;

int binarySearch(int *arr,int val,int lb,int ub)
{
	if (lb<=ub) { 
        int mid = (lb + ub)/ 2; 
	
	if(*(arr+mid)==val)
	{
		return mid+1;
	}
	if(val<arr[mid])
	{
		return binarySearch(arr,val,lb,mid-1);
	}
	else
	{
		return binarySearch(arr,val,mid+1,ub);
	}
	
   }
		return 0;
}
int main()
{
	cout<<"Enter size of array"<<endl;
	int size;
	cin>>size;
	cout<<"Enter array"<<endl;
	int *arr = (int*)malloc(size*sizeof(int));
	
	for(int i=0;i<size;i++)
	{
		cin>>arr[i];
	}
	cout<<"Enter value for search"<<endl;
	int val;
	cin>>val;
	int pos = binarySearch(arr,val,0,size-1);
	if(pos)
	{
		cout<<"Value found at position: "<<pos;
	}
	else
	{
		cout<<"Value not found";
	}
	
	return 0;
}
