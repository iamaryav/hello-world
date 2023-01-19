// program for insertion sort
#include<iostream>
using namespace std;
int insertionSort(int a[],int size)
{
	int i,j,temp;
	unsigned int count = 0;
	for(i=1;i<size;i++)
	{
		temp = a[i];
		for(j=i-1;j>=0;j--)
		{
			count += 1;
			if(temp<=a[j])
			{
				a[j+1]=a[j];
			}
			else 
				break;
		}
		a[j+1]=temp;
	}
	return(count);
}
int main()
{
	int a[20],i,size;
	cout<<"Enter size of array :";
	cin>>size;
	cout<<"Enter array\n";
	for(i=0;i<size;i++)
	{
		cin>>a[i];
	}
	int count=insertionSort(a,size);
	for(i=0;i<size;i++)
		cout<<a[i]<<"\t";
	//cout<<"\nNo. of comparision :"<<count;
	return(0);
	
}
