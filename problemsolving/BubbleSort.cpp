#include<iostream>
using namespace std;
void swap(int *a,int *b)
{
	int temp;
	temp = *a;
	*a = *b;
	*b = temp;
}
bubbleSort(int arr[],int size)
{
	int i,j;
	for(i=0;i<size;i++)
	{
		for(j=0;j<size-i-1;j++)
		{
			if(arr[j]>=arr[j+1])
			{
				swap(&arr[j],&arr[j+1]);
			}
		}
	}
}
int main()
{
	int i,size;
	int arr[20];
	cout<<"Enter the size of array :";
	cin>>size;
	cout<<"Enter an array"<<endl;
	for(i=0;i<size;i++)
	{
		cin>>arr[i];
	}
	bubbleSort(arr,size);
	for(i=0;i<size;i++)
	{
		cout<<arr[i]<<"\t";
	}
	return(0);
}
